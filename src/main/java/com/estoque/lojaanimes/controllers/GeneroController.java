package com.estoque.lojaanimes.controllers;

import com.estoque.lojaanimes.DTO.GeneroDTO;
import com.estoque.lojaanimes.models.GeneroModel;
import com.estoque.lojaanimes.services.GeneroService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/genero")
public class GeneroController {

    @Autowired
    GeneroService generoService;

    @PostMapping
    public ResponseEntity<Object> saveGenero(@RequestBody @Valid GeneroDTO generoDTO) {
        if (generoService.nomeDoGeneroExiste(generoDTO.getNome())) {
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Genero já cadastrado.");
        }
        var generoModel = new GeneroModel();
        BeanUtils.copyProperties(generoDTO, generoModel);
        return ResponseEntity.status(HttpStatus.OK).body(generoService.save(generoModel));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAllGenerosById(@PathVariable(value="id") Long id) {
        Optional<GeneroModel> generoModelOptional = generoService.buscaPorId(id);
        if (generoModelOptional.isEmpty()) {
           return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Genero de id: " + id + " não encontrado.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(generoModelOptional.get());
    }

}
