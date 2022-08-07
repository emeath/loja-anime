package com.estoque.lojaanimes.DTO;

import com.estoque.lojaanimes.models.AnimeModel;
import com.estoque.lojaanimes.models.AutorModel;
import com.estoque.lojaanimes.models.GeneroModel;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public class AnimeDTO {

    @NotBlank
    private String nome;
    @Min(1)
    private int qtdTemporadas;
    @PastOrPresent
    private LocalDate dtCriacao;

    /* Nao é uma boa prática. Nesse DTO com esses atributos abaixo, o json deveria conter o objeto gigantesco
    @NotEmpty
    private Set<GeneroModel> animeGeneros;
    @NotNull
    private AutorModel autor;
    */

    @NotNull
    private Long idAutor;

    @NotEmpty
    private List<Long> idGenerosAnime;

    public List<Long> getIdGenerosAnime() {
        return idGenerosAnime;
    }

    public void setIdGenerosAnime(List<Long> idGenerosAnime) {
        this.idGenerosAnime = idGenerosAnime;
    }

    public Long getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Long idAutor) {
        this.idAutor = idAutor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdTemporadas() {
        return qtdTemporadas;
    }

    public void setQtdTemporadas(int qtdTemporadas) {
        this.qtdTemporadas = qtdTemporadas;
    }

    public LocalDate getDtCriacao() {
        return dtCriacao;
    }

    public void setDtCriacao(LocalDate dtCriacao) {
        this.dtCriacao = dtCriacao;
    }

    /*public Set<GeneroModel> getAnimeGeneros() {
        return animeGeneros;
    }

    public void setAnimeGeneros(Set<GeneroModel> animeGeneros) {
        this.animeGeneros = animeGeneros;
    }

    public AutorModel getAutor() {
        return autor;
    }

    public void setAutor(AutorModel autor) {
        this.autor = autor;
    }*/
}
