package com.example.Examen1Back2.modelos;

import jakarta.persistence.*;

@Entity  //Indica que esta clase es una entidad JPA
@Table(name = "cursos")  //Nombre de la tabla en la base de datos

public class Curso {

    @Id //Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Generación automática del ID es un auto-increment
    private Integer id;
    private String nombre;
    private String docente;

    public Curso() {
    }

    public Curso(Integer id, String nombre, String docente) {
        this.id = id;
        this.nombre = nombre;
        this.docente = docente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }
}
