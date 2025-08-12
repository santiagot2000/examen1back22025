package com.example.Examen1Back2.modelos;
import jakarta.persistence.*;

import java.util.List;

@Entity //Indica que esta clase es una entidad JPA
@Table(name = "docentes") //Nombre de la tabla en la base de datos
public class Docente {

    @Id //Indica que este campo es la clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Generación automática del ID es un auto-increment
    private Integer id;
    private String especialidad;

    public Docente() {
    }

    public Docente(Integer id, String especialidad) {
        this.id = id;
        this.especialidad = especialidad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}