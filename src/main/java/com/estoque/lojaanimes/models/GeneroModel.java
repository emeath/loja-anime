package com.estoque.lojaanimes.models;

import javax.persistence.*;

@Entity
@Table(name = "generos")
public class GeneroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false)
    private String descricao;

}
