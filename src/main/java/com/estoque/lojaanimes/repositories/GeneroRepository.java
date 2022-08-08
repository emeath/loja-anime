package com.estoque.lojaanimes.repositories;

import com.estoque.lojaanimes.models.AnimeModel;
import com.estoque.lojaanimes.models.GeneroModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.PathVariable;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface GeneroRepository extends JpaRepository<GeneroModel, Long> {

    @Query("SELECT g FROM GeneroModel g WHERE g.nome = :nomeGenero")
    public Optional<List<GeneroModel>> nomeDoGeneroExiste(String nomeGenero);

    @Query("SELECT g FROM GeneroModel g WHERE g.id = :idGenero")
    public Optional<GeneroModel> buscaPorId(Long idGenero);

    @Query("SELECT g FROM GeneroModel g")
    public List<GeneroModel> buscarTodos();

    @Modifying
    @Query("DELETE FROM GeneroModel g WHERE g.id = :idGenero")
    public void deletarPorID(Long idGenero);
    
    @Query("SELECT g FROM GeneroModel g JOIN g.generoAnimes genani JOIN genani.autor a WHERE a.id = :id")
    public List<GeneroModel> findByAutorId(Long id);

    Optional<GeneroModel> findByNome(String nome);

    // save -> derived query


}
