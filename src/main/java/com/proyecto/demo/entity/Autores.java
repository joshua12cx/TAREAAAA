package com.proyecto.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity

@Table(name="Autores")

public class Autores {

     @Id
    @Column(name = "ID_AUTOR")
    private int ID_AUTOR;

    @Column(name = "AUTOR")
    private int AUTOR;

}
