package com.estoque.lojaanimes.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "autores")
public class AutorModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "autores_seq_gen")
    @SequenceGenerator(name = "autores_seq_gen", sequenceName = "autores_id_seq")
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String experiencia;
    @OneToMany(mappedBy = "autor", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<AnimeModel> animes;

    public AutorModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "AutorModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", experiencia='" + experiencia + '\'' +
                ", animes=" + animes +
                '}';
    }
}
