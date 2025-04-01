package org.example;

import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Set;

public class Inscripcion {
    @Setter private Set<Materia> materiasSolicitadas;
    @Setter private Alumno alumno;
    @Setter private LocalDateTime fechaDeEvaluacion;

    public boolean aprobada(){
        return this.materiasSolicitadas.stream().allMatch(m -> m.cumpleCorrelativas(alumno.getMateriasAprobadas()));
    }
}
