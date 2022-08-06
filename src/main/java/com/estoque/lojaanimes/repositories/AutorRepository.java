package com.estoque.lojaanimes.repositories;

import com.estoque.lojaanimes.models.AutorModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AutorRepository extends JpaRepository<AutorModel, Long> {
    @Query("SELECT a FROM AutorModel a")
    public List<AutorModel> buscarTodos();

    @Modifying
    @Query("DELETE FROM AutorModel a WHERE a.id = :id")
    void deletarPorId(Long id);
}
