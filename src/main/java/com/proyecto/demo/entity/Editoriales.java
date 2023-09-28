package com.proyecto.demo.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EDITORIAL")
public class Editoriales {
    @Id
    @Column(name = "ID_EDITORIAL")
    int ID_GRUPO;

    @Column(name="EDITORIAL")
    String EDITORIAL;

}
