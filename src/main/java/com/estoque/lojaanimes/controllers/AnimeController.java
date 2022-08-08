package com.estoque.lojaanimes.controllers;

import com.estoque.lojaanimes.DTO.AnimeDTO;
import com.estoque.lojaanimes.DTO.GeneroDTO;
import com.estoque.lojaanimes.models.AnimeModel;
import com.estoque.lojaanimes.models.AutorModel;
import com.estoque.lojaanimes.models.GeneroModel;
import com.estoque.lojaanimes.services.AnimeService;
import com.estoque.lojaanimes.services.AutorService;
import com.estoque.lojaanimes.services.GeneroService;
import org.apache.coyote.Response;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;

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
        var animeModel = new AnimeModel();
        BeanUtils.copyProperties(animeDTO, animeModel);

        Optional<AutorModel> autorModelOptional = autorService.findById(animeDTO.getIdAutor());
        if(autorModelOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id do autor inválido!");
        }
        animeModel.setAutor(autorModelOptional.get());


        Set<GeneroModel> generos = new HashSet<>();
        for (Long idGenero : animeDTO.getIdGenerosAnime()) {
            Optional<GeneroModel> generoModelOptional = generoService.buscaPorId(idGenero);
            if(generoModelOptional.isEmpty()) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id Genero: " + idGenero + " inválido. Requisição rejeitada.");
            }
            generos.add(generoModelOptional.get());
        }
        animeModel.setAnimeGeneros(generos);

        return ResponseEntity.status(HttpStatus.OK).body(animeService.save(animeModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAnimeById(@PathVariable(value="id") Long id) {
        Optional<AnimeModel> animeModelOptional = animeService.findById(id);
        if (animeModelOptional.isEmpty()) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime de id: " + id + " não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(animeModelOptional.get());
    }

    @GetMapping
    public ResponseEntity<List<AnimeModel>> getAllAnimes() {
        return ResponseEntity.status(HttpStatus.OK).body(animeService.findAll());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteById(@PathVariable(value="id") Long id) {
        Optional<AnimeModel> animeModelOptional = animeService.findById(id);
        if (animeModelOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime (id=" + id + ") não encontrado!");
        }
        animeService.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Anime (id=" + id + ") deletado!");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateById(@PathVariable(value = "id") Long id, @RequestBody @Valid AnimeDTO animeDTO) {
        Optional<AnimeModel> animeModelOptional = animeService.findById(id);
        if (animeModelOptional.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Anime (id=" + id + ") não encontrado!");
        }
        AnimeModel animeModel = new AnimeModel();
        animeModel.setId(animeModelOptional.get().getId());
        BeanUtils.copyProperties(animeDTO, animeModel);

        Set<GeneroModel> generos = new HashSet<>();
        for (Long idGenero : animeDTO.getIdGenerosAnime()) {
            Optional<GeneroModel> generoModelOptional = generoService.buscaPorId(idGenero);
            if (generoModelOptional.isEmpty()){
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id Genero: " + idGenero + " inválido. Requisição rejeitada.");
            }
            generos.add(generoModelOptional.get());
        }
        animeModel.setAnimeGeneros(generos);

        Optional<AutorModel> autorModelOptional = autorService.findById(animeDTO.getIdAutor());
        if (autorModelOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Id do autor inválido!");
        }
        animeModel.setAutor(autorModelOptional.get());

        return ResponseEntity.status(HttpStatus.OK).body(animeService.save(animeModel));
    }

}
