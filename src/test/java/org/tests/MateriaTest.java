package org.tests;

import org.example.Alumno;
import org.example.Materia;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MateriaTest {
    @Test
    @DisplayName("Test: Verificar que el alumno cumple con las correlativas")
    public void VerificarAlumnoCumpleCorrelativas() {
        Materia ingles1 = new Materia("Ingles1");

        Materia ingles2 = new Materia("Ingles2");
        ingles2.setCorrelativas(Set.of(ingles1));

        Alumno alumno = new Alumno("Rufina","Gonzalez",21);
        alumno.agregarMateriaAprobada(ingles1);

        //Verifico que el alumno cumple Correlativas
        assertTrue(ingles2.cumpleCorrelativas(alumno.getMateriasAprobadas()));
    }
}
