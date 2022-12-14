package com.estoque.lojaanimes.controllers;

import com.estoque.lojaanimes.DTO.AutorDTO;
import com.estoque.lojaanimes.models.AutorModel;
import com.estoque.lojaanimes.services.AnimeService;
import com.estoque.lojaanimes.services.AutorService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/autores")
public class AutorController {

    @Autowired
    AutorService autorService;
    @Autowired
    AnimeService animeService;

    @GetMapping
    public ResponseEntity<List<AutorModel>> getAllAutores() {
        return ResponseEntity.status(HttpStatus.OK).body(autorService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Object> getAutorById(@PathVariable Long id){
        Optional<AutorModel> autorModelOptional = autorService.findById(id);
        if (!autorModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(autorModelOptional.get());
    }

    @PostMapping
    public ResponseEntity<Object> addAutor(@RequestBody @Valid AutorDTO autorDTO){
        if(autorService.existsByNome(autorDTO.getNome().trim())){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        AutorModel autorModel = new AutorModel();
        BeanUtils.copyProperties(autorDTO, autorModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(autorService.save(autorModel));
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteAutorById(@PathVariable(value = "id") Long id) {
        Optional<AutorModel> autorModelOptional = autorService.findById(id);
        if (!autorModelOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        autorService.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> updateAutor(@PathVariable(value = "id") Long id, @RequestBody AutorDTO autorDTO) {
        Optional<AutorModel> autorModelOptional = autorService.findById(id);
        if (!autorModelOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        AutorModel autorModel = new AutorModel();
        autorModel.setId(autorModelOptional.get().getId());
        BeanUtils.copyProperties(autorDTO, autorModel);
        return ResponseEntity.status(HttpStatus.OK).body(autorService.save(autorModel));
    }

}
