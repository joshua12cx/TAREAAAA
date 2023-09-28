package com.proyecto.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity

@Table(name="Categoria")

public class Categorias {

     @Id
    @Column(name = "ID_CATEGORIA")
    private int ID_CATEGORIA;

    @Column(name = "CATEGORIA")
    private int CATEGORIA;

}
