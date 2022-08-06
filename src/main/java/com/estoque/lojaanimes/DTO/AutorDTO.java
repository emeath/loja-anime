package com.estoque.lojaanimes.DTO;

import com.estoque.lojaanimes.models.AnimeModel;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class AutorDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String experiencia;
    @NotEmpty
    private List<AnimeModel> animes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public List<AnimeModel> getAnimes() {
        return animes;
    }

    public void setAnimes(List<AnimeModel> animes) {
        this.animes = animes;
    }
}
