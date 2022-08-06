package com.estoque.lojaanimes.DTO;

import com.estoque.lojaanimes.models.AutorModel;
import com.estoque.lojaanimes.models.GeneroModel;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import java.util.Set;

public class AnimeDTO {

    @NotBlank
    private String nome;
    @NotNull
    private int qtdTemporadas;
    @PastOrPresent
    private LocalDate dtCriacao;
    @NotEmpty
    private Set<GeneroModel> animeGeneros;
    @NotBlank
    private AutorModel autor;

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

    public Set<GeneroModel> getAnimeGeneros() {
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
    }
}
