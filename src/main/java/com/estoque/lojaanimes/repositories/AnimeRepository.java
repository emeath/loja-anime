package com.estoque.lojaanimes.repositories;

import com.estoque.lojaanimes.models.AnimeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnimeRepository extends JpaRepository<AnimeModel, Long> {
    public boolean existsByNome(String nome);
}
