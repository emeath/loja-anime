package com.estoque.lojaanimes.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "animes")
public class AnimeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "animes_seq_gen")
    @SequenceGenerator(name = "animes_seq_gen", sequenceName = "animes_id_seq")
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, unique = true)
    private int qtdTemporadas;
    @Column(nullable = false)
    private LocalDate dtCriacao;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
            name="animes__generos",
            joinColumns = @JoinColumn(name = "id_animes"),
            inverseJoinColumns = @JoinColumn(name = "generos_id"))
    private Set<GeneroModel> animeGeneros;

    @ManyToOne
    @JoinColumn(name = "id_autor", nullable = false)
    private AutorModel autor;

    public AnimeModel() {
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

    @Override
    public String toString() {
        return "AnimeModel{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", qtdTemporadas=" + qtdTemporadas +
                ", dtCriacao=" + dtCriacao +
                '}';
    }
}
