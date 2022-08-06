package com.estoque.lojaanimes.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "generos")
public class GeneroModel implements Serializable {

    public GeneroModel() {
    }

    public GeneroModel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String descricao;

    @ManyToMany(mappedBy = "animeGeneros", fetch = FetchType.EAGER)
    private Set<AnimeModel> generoAnimes;

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "GeneroModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", generoAnimes=" + generoAnimes +
                '}';
    }
}
