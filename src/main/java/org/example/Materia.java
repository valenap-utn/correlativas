package org.example;

import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

public class Materia {
    @Setter private String nombre;
    @Setter private Set<Materia> correlativas = new HashSet<>();

    public boolean cumpleCorrelativas(Set<Materia> materiasAprobadas){
        return correlativas.isEmpty() || materiasAprobadas.containsAll(correlativas);
    }
}
