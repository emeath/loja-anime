package com.estoque.lojaanimes.services;

import com.estoque.lojaanimes.models.AutorModel;
import com.estoque.lojaanimes.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class AutorService {

    @Autowired
    AutorRepository autorRepository;

    @Transactional
    public AutorModel save(AutorModel autorModel) {
        return autorRepository.save(autorModel);
    }

    public List<AutorModel> buscarTodos() {
        System.out.println(AutorService.class + " buscarTodos()");
        return autorRepository.buscarTodos();
    }

    public Optional<AutorModel> findById(Long id){
        return autorRepository.findById(id);
    }

    @Transactional
    public void deletarPorId(Long id) {
        System.out.println(AutorService.class + " deletarPorId(Long id)");
        autorRepository.deletarPorId(id);
    }

    @Transactional
    public void deleteById(Long id) {
        System.out.println(AutorService.class + " deleteById(Long id)");
        autorRepository.deleteById(id);
    }


    public boolean existsByNome(String nome) {
        return autorRepository.existsByNome(nome);
    }
}
