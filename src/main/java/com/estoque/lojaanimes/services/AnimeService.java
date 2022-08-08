package com.estoque.lojaanimes.services;

import com.estoque.lojaanimes.models.AnimeModel;
import com.estoque.lojaanimes.repositories.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class AnimeService {

    @Autowired
    AnimeRepository animeRepository;

    public boolean nomeDoGeneroExiste(String nome) {
        return animeRepository.existsByNome(nome);
    }

    public List<AnimeModel> findAll(){
        return animeRepository.findAll();
    }

    public Optional<AnimeModel> findById(Long id) {
        return animeRepository.findById(id);
    }

    @Transactional
    public AnimeModel save(AnimeModel animeModel) {
        return animeRepository.save(animeModel);
    }

    @Transactional
    public void deleteById(Long id) {
        animeRepository.deleteById(id);
    }

    public List<AnimeModel> findAnimesPorIdAutor(Long id) {
        return animeRepository.findAnimesPorIdAutor(id);
    }

    public Set<AnimeModel> animesPorGenero(String nomeGenero) {
        return animeRepository.animesPorGenero(nomeGenero);
    }
}
