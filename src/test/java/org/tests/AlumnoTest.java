package org.tests;

import org.example.Alumno;
import org.example.Materia;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class AlumnoTest {
    @Test
    @DisplayName("Test: Verificar materias aprobadas del alumno")
    public void VerificarMateriasAprobadasDelAlumno() {
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

        //Verifico que el alumno tiene aprobada una Materia
        assertTrue(alumno.getMateriasAprobadas().contains(ingles1));
    }
}
