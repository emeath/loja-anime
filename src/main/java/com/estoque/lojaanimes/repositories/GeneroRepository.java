package com.estoque.lojaanimes.repositories;

import com.estoque.lojaanimes.models.GeneroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface GeneroRepository extends JpaRepository<GeneroModel, Long> {

    @Query("SELECT g FROM GeneroModel g WHERE g.nome = :nomeGenero")
    public Optional<List<GeneroModel>> nomeDoGeneroExiste(String nomeGenero);

    @Query("SELECT g FROM GeneroModel g WHERE g.id = :idGenero")
    Optional<GeneroModel> buscaPorId(Long idGenero);
}
