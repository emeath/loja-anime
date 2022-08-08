package com.estoque.lojaanimes.controllers;

import com.estoque.lojaanimes.DTO.AnimeDTO;
import com.estoque.lojaanimes.DTO.AutorDTO;
import com.estoque.lojaanimes.models.AutorModel;
import com.estoque.lojaanimes.services.AutorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    AutorService autorService;

    @GetMapping
    public ResponseEntity<List<AutorModel>> getAllAutores() {
        return ResponseEntity.status(HttpStatus.OK).body(autorService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAutorById(@PathVariable Long id){
        Optional<AutorModel> autorModelOptional = autorService.findById(id);
        if (autorModelOptional.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Autor id: " + id + " não encontrado!");
        }
        return ResponseEntity.status(HttpStatus.OK).body(autorService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Object> addAutor(@RequestBody AutorDTO autorDTO){

    }

    /*
    @DeleteMapping("/{id}")

    @PutMapping("/{id}")
    */
}
