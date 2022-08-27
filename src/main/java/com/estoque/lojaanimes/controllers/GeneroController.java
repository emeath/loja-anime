package com.estoque.lojaanimes.controllers;

import com.estoque.lojaanimes.DTO.GeneroDTO;
import com.estoque.lojaanimes.models.AutorModel;
import com.estoque.lojaanimes.models.GeneroModel;
import com.estoque.lojaanimes.services.AutorService;
import com.estoque.lojaanimes.services.GeneroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    @Autowired
    GeneroService generoService;
    @Autowired
    AutorService autorService;

    @PostMapping
    public ResponseEntity<Object> saveGenero(@RequestBody @Valid GeneroDTO generoDTO) {
        if (generoService.nomeDoGeneroExiste(generoDTO.getNome())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        GeneroModel generoModel = new GeneroModel();
        BeanUtils.copyProperties(generoDTO, generoModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(generoService.save(generoModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getGeneroById(@PathVariable(value="id") Long id) {
        Optional<GeneroModel> generoModelOptional = generoService.buscaPorId(id);
        if (!generoModelOptional.isPresent()) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(generoModelOptional.get());
    }

    @GetMapping("/autores/{id}")
    public ResponseEntity<Object> getGenerosByAutorId(@PathVariable(value = "id") Long id) {
        Optional<AutorModel> autorModelOptional = autorService.findById(id);
        if (!autorModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        List<GeneroModel> generos = generoService.findByAutorId(autorModelOptional.get().getId());
        return ResponseEntity.status(HttpStatus.OK).body(generos);
    }

    @GetMapping
    public ResponseEntity<List<GeneroModel>> getAllGeneros() {
        return ResponseEntity.status(HttpStatus.OK).body(generoService.buscarTodos());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteGeneroById(@PathVariable(value = "id") Long id) {
        Optional<GeneroModel> generoModelOptional = generoService.buscaPorId(id);
        if (!generoModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        generoService.deletarPorId(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateGenero(@PathVariable(value = "id") Long id, @RequestBody GeneroDTO generoDTO){
        Optional<GeneroModel> generoModelOptional = generoService.buscaPorId(id);
        if (!generoModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }

        GeneroModel generoModel = new GeneroModel();
        generoModel.setId(generoModelOptional.get().getId());
        BeanUtils.copyProperties(generoDTO, generoModel);

        return ResponseEntity.status(HttpStatus.OK).body(generoService.save(generoModel));
    }

}
