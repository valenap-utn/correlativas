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
        Materia ingles1 = new Materia();
        ingles1.setNombre("Ingles1");

        Materia ingles2 = new Materia();
        ingles2.setNombre("Ingles2");
        ingles2.setCorrelativas(Set.of(ingles1));

        Alumno alumno = new Alumno();
        alumno.setNombre("Rufina");
        alumno.setApellido("Gonzalez");
        alumno.setEdad(21);
        alumno.agregarMateriaAprobada(ingles1);

        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setAlumno(alumno);
        inscripcion.setMateriasSolicitadas(Set.of(ingles2));

        //Verifico que el alumno puede realizar la inscripcion
        assertTrue(inscripcion.aprobada());
    }

    @Test
    @DisplayName("Test: Verificar que el alumno NO cumple con las condiciones para la Inscripción")
    public void VerificarAlumnoNOCumpleCondicionesParaInscripcion() {
        Materia ingles1 = new Materia();
        ingles1.setNombre("Ingles1");

        Materia syo = new Materia();
        syo.setNombre("SyO");

        Materia ads = new Materia();
        ads.setNombre("AdS");
        ads.setCorrelativas(Set.of(syo));

        Alumno alumno = new Alumno();
        alumno.setNombre("Rufina");
        alumno.setApellido("Gonzalez");
        alumno.setEdad(21);
        alumno.agregarMateriaAprobada(ingles1);

        Inscripcion inscripcion2 = new Inscripcion();
        inscripcion2.setAlumno(alumno);
        inscripcion2.setMateriasSolicitadas(Set.of(syo,ads));

        //Verifico que el alumno NO puede realizar la inscripcion
        assertFalse(inscripcion2.aprobada());
    }
}

