package com.estoque.lojaanimes.services;

import com.estoque.lojaanimes.models.AnimeModel;
import com.estoque.lojaanimes.models.GeneroModel;
import com.estoque.lojaanimes.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class GeneroService {

    @Autowired
    GeneroRepository generoRepository;

    public Set<AnimeModel> animesPorGenero(String nomeGenero){
        return generoRepository.animesPorGenero(nomeGenero);
    }

    public boolean nomeDoGeneroExiste(String nomeGenero) {
        Optional<List<GeneroModel>> generoModelOptional = generoRepository.nomeDoGeneroExiste(nomeGenero);
        if(generoModelOptional.get().isEmpty())
            return false;
        return true;
    }

    @Transactional
    public GeneroModel save(GeneroModel generoModel) {
        return generoRepository.save(generoModel);
    }

    public Optional<GeneroModel> buscaPorId(Long id) {
        return generoRepository.buscaPorId(id);
    }

    public List<GeneroModel> buscarTodos() {
        return generoRepository.buscarTodos();
    }

    @Transactional
    public void deletarPorId(Long id) {
        generoRepository.deletarPorID(id);
    }
}
