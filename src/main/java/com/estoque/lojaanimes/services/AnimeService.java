package com.estoque.lojaanimes.services;

import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.estoque.lojaanimes.models.AnimeModel;
import com.estoque.lojaanimes.repositories.AnimeRepository;

@Service
public class AnimeService {

    @Autowired
    AnimeRepository animeRepository;

    public boolean nomeDoGeneroExiste(String nome) {
        return animeRepository.existsByNome(nome);
    }

    public Page<AnimeModel> findAll(PageRequest pageRequest){
        return animeRepository.findAll(pageRequest);
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
