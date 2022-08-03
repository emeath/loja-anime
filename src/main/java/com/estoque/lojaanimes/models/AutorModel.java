package com.estoque.lojaanimes.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "autores")
public class AutorModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable = false, unique = true)
    private String nome;
    @Column(nullable = false, columnDefinition = "TEXT")
    private String experiencia;

}
