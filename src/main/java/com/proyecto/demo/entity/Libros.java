package com.proyecto.demo.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Data
@Entity
@Table(name = "LIBROS")
public class Libros {

    @Id
    @Column(name = "ASIN_ID")
    private int ASIN_ID;

    @Column(name = "TITULO")
    private String TITULO;

    @Column(name = "FECHA_LANZAMIENTO")
    private String FECHA_LANZAMIENTO;

    @Column(name = "AUTOR")
    private String AUTOR;

    @Column(name = "CATEGORIA")
    private String CATEGORIA;

    @Column(name = "EDITORIAL")
    private String EDITORIAL;

    @Column(name = "IDIOMA")
    private String IDIOMA;

    @Column(name = "PAGINAS")
    private int PAGINAS;

    @Column(name = "PORTADA")
    private String PORTADA;

    @Column(name = "DESCRIPCION")
    private String DESCRIPCION;

   @JsonIgnore
@OneToMany(mappedBy = "libro")
private List<Alquiler> alquileres;

}
