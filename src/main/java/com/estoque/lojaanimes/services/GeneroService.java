package com.estoque.lojaanimes.services;

import com.estoque.lojaanimes.models.GeneroModel;
import com.estoque.lojaanimes.repositories.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class GeneroService {

    @Autowired
    GeneroRepository generoRepository;

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
}
