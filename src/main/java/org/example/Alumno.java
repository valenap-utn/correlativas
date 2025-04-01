package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    @Setter private String nombre;
    @Setter private String apellido;
    @Setter private Integer edad;

    @Getter public Set<Materia> materiasAprobadas;

    public Alumno(String nombre, String apellido, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materiasAprobadas = new HashSet<>();
    }

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

}
