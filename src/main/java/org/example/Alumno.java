package org.example;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public class Alumno {
    @Setter private String nombre;
    @Setter private String apellido;
    @Setter private int edad;

    @Getter public Set<Materia> materiasAprobadas;

    public Alumno() {
        this.materiasAprobadas = new HashSet<Materia>();
    }

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }

}
