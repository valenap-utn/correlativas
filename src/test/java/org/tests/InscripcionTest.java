package org.tests;

import org.example.Alumno;
import org.example.Inscripcion;
import org.example.Materia;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class InscripcionTest {
    @Test
    @DisplayName("Test: Verificar que el alumno cumple con las condiciones para la Inscripción")
    public void VerificarAlumnoCumpleCondicionesParaInscripcion() {
        Materia ingles1 = new Materia("Ingles1");

        Materia ingles2 = new Materia("Ingles2");
        ingles2.setCorrelativas(Set.of(ingles1));

        Alumno alumno = new Alumno("Rufina","Gonzalez",21);
        alumno.agregarMateriaAprobada(ingles1);

        Inscripcion inscripcion = new Inscripcion(Set.of(ingles2),alumno);

        //Verifico que el alumno puede realizar la inscripcion
        assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test: Verificar que el alumno NO cumple con las condiciones para la Inscripción")
    public void VerificarAlumnoNOCumpleCondicionesParaInscripcion() {
        Materia ingles1 = new Materia("Ingles1");

        Materia syo = new Materia("SyO");

        Materia ads = new Materia("AdS");
        ads.setCorrelativas(Set.of(syo));

        Alumno alumno = new Alumno("Rufina","Gonzalez",21);
        alumno.agregarMateriaAprobada(ingles1);

        Inscripcion inscripcion2 = new Inscripcion(Set.of(syo,ads),alumno);

        //Verifico que el alumno NO puede realizar la inscripcion
        assertFalse(inscripcion2.aprobada());
    }
}

