package com.estoque.lojaanimes.DTO;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

public class AutorDTO {

    @NotBlank
    private String nome;
    @NotBlank
    private String experiencia;
    @NotEmpty
    private List<Long> idAnimes;

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

    public List<Long> getIdAnimes() {
        return idAnimes;
    }

    public void setIdAnimes(List<Long> idAnimes) {
        this.idAnimes = idAnimes;
    }
}
