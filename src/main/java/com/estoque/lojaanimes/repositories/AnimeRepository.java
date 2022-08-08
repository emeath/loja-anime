package com.estoque.lojaanimes.repositories;

import com.estoque.lojaanimes.models.AnimeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Set;

public interface AnimeRepository extends JpaRepository<AnimeModel, Long> {
    public boolean existsByNome(String nome);

    @Query("SELECT a FROM AnimeModel a WHERE a.autor.id = :id")
    List<AnimeModel> findAnimesPorIdAutor(Long id);

    @Query("SELECT genani FROM GeneroModel g JOIN g.generoAnimes genani WHERE g.nome = :nomeGenero")
    public Set<AnimeModel> animesPorGenero(String nomeGenero);
}
