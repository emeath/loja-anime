package com.estoque.lojaanimes.controllers;

import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.estoque.lojaanimes.DTO.AnimeDTO;
import com.estoque.lojaanimes.models.AnimeModel;
import com.estoque.lojaanimes.models.AutorModel;
import com.estoque.lojaanimes.models.GeneroModel;
import com.estoque.lojaanimes.services.AnimeService;
import com.estoque.lojaanimes.services.AutorService;
import com.estoque.lojaanimes.services.GeneroService;

@RestController
@RequestMapping("/animes")
public class AnimeController {

    @Autowired
    AnimeService animeService;
    @Autowired
    AutorService autorService;
    @Autowired
    GeneroService generoService;

    @PostMapping
    public ResponseEntity<Object> saveAnime(@RequestBody @Valid AnimeDTO animeDTO) {
        if (animeService.nomeDoGeneroExiste(animeDTO.getNome())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Anime: " + animeDTO.getNome() + " já cadastrado.");
        }
        AnimeModel animeModel = new AnimeModel();
        BeanUtils.copyProperties(animeDTO, animeModel);

        Optional<AutorModel> autorModelOptional = autorService.findById(animeDTO.getIdAutor());
        if(!autorModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id do autor inválido!");
        }
        animeModel.setAutor(autorModelOptional.get());


        Set<GeneroModel> generos = new HashSet<>();
        for (Long idGenero : animeDTO.getIdGenerosAnime()) {
            Optional<GeneroModel> generoModelOptional = generoService.buscaPorId(idGenero);
            if(!generoModelOptional.isPresent()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id Genero: " + idGenero + " inválido. Requisição rejeitada.");
            }
            generos.add(generoModelOptional.get());
        }
        animeModel.setAnimeGeneros(generos);

        return ResponseEntity.status(HttpStatus.CREATED).body(animeService.save(animeModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAnimeById(@PathVariable(value="id") Long id) {
        Optional<AnimeModel> animeModelOptional = animeService.findById(id);
        if (!animeModelOptional.isPresent()) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime de id: " + id + " não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(animeModelOptional.get());
    }

    @GetMapping
    public ResponseEntity<Page<AnimeModel>> getAllAnimes(
    		@RequestParam(value="page", defaultValue="0") Integer page,
    		@RequestParam(value="linesPerPage", defaultValue="5") Integer linesPerPage,
    		@RequestParam(value="direction", defaultValue="ASC") String direction,
    		@RequestParam(value="orderBy", defaultValue="nome") String orderBy) {
    	
    	PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
        return ResponseEntity.status(HttpStatus.OK).body(animeService.findAll(pageRequest));
    }
    
    @GetMapping("/nome/{nome}")
    public ResponseEntity<Page<AnimeModel>> getAllAnimesByName(
    		@RequestParam(value="page", defaultValue="0") Integer page,
    		@RequestParam(value="linesPerPage", defaultValue="5") Integer linesPerPage,
    		@RequestParam(value="direction", defaultValue="ASC") String direction,
    		@RequestParam(value="orderBy", defaultValue="nome") String orderBy,
    		@PathVariable(value="nome") String nomeAnime
    		) {    
    	PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
    	
    	return ResponseEntity.status(HttpStatus.OK).body(animeService.findByNomeContaining(pageRequest, nomeAnime));
    }

    @GetMapping("/autores/{id}")
    public ResponseEntity<Object> getAllAnimesByAutorId(@PathVariable(value = "id") Long id) {
        // Autor existe?
        Optional<AutorModel> autorModelOptional = autorService.findById(id);
        if (!autorModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Autor ID: " + id + " não existe!");
        }
        AutorModel autorModel = new AutorModel();
        autorModel.setId(autorModelOptional.get().getId());

        List<AnimeModel> animes = animeService.findAnimesPorIdAutor(autorModel.getId());
        return ResponseEntity.status(HttpStatus.OK).body(animes);

    }

    @GetMapping("/generos/{nomeGenero}")
    public ResponseEntity<Object> getAllAnimesByGeneroNome(@PathVariable(value = "nomeGenero") String nomeDoGenero) {
        Optional<GeneroModel> generoModelOptional = generoService.findByNome(nomeDoGenero);
        if(!generoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Autor ID não encontrado.");
        }
         Set<AnimeModel> animes = animeService.animesPorGenero(generoModelOptional.get().getNome());
        return ResponseEntity.status(HttpStatus.OK).body(animes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable(value="id") Long id) {
        Optional<AnimeModel> animeModelOptional = animeService.findById(id);
        if (!animeModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime (id=" + id + ") não encontrado!");
        }
        animeService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Anime (id=" + id + ") deletado!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateById(@PathVariable(value = "id") Long id, @RequestBody @Valid AnimeDTO animeDTO) {
        Optional<AnimeModel> animeModelOptional = animeService.findById(id);
        if (!animeModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime (id=" + id + ") não encontrado!");
        }
        AnimeModel animeModel = new AnimeModel();
        animeModel.setId(animeModelOptional.get().getId());
        BeanUtils.copyProperties(animeDTO, animeModel);

        Set<GeneroModel> generos = new HashSet<>();
        for (Long idGenero : animeDTO.getIdGenerosAnime()) {
            Optional<GeneroModel> generoModelOptional = generoService.buscaPorId(idGenero);
            if (!generoModelOptional.isPresent()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id Genero: " + idGenero + " inválido. Requisição rejeitada.");
            }
            generos.add(generoModelOptional.get());
        }
        animeModel.setAnimeGeneros(generos);

        Optional<AutorModel> autorModelOptional = autorService.findById(animeDTO.getIdAutor());
        if (!autorModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id do autor inválido!");
        }
        animeModel.setAutor(autorModelOptional.get());

        return ResponseEntity.status(HttpStatus.OK).body(animeService.save(animeModel));
    }

}
