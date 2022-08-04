package com.estoque.lojaanimes.models;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "animes")
public class AnimeModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, unique = true)
    private int qtdTemporadas;
    @Column(nullable = false)
    private LocalDate dtCriacao;

    @ManyToMany
    @JoinTable(name = "animes_generos",
    joinColumns = @JoinColumn(name = "id_anime", referencedColumnName = "id"),
    inverseJoinColumns = @JoinColumn(name = "id_genero", referencedColumnName = "id"))
    private List<GeneroModel> generos;
}
