package tarea1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AlumnosTest {

	@Test
	public void AlumnoSeInscribeAMateriaSinCorrelativaTest() {
		Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", 1, -1);
		
		Inscripcion ins = new Inscripcion();
		Alumno alu = new Alumno("Franco", ins);
		
		assertEquals(alu.inscribir(algoritmos), "Inscripción exitosa.");
	}
	
	@Test
	public void AlumnoSeInscribeAMateriaConCorrelativasAprobadasTest() {
		Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", 1, -1);
		Materia paradigmas = new Materia("Paradigmas de Programación", 2, 1);
		Materia disenio = new Materia("Diseño de Sistemas", 3, 2);
		
		Inscripcion ins = new Inscripcion();
		Alumno alu = new Alumno("Franco", ins);
		
		alu.agregarAprobada(1);
		alu.agregarAprobada(2);
		
		assertEquals(alu.inscribir(disenio), "Inscripción exitosa.");
	}
	
	@Test
	public void AlumnoSeInscribeAMateriaSinCorrelativasAprobadasTest() {
		Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", 1, -1);
		Materia paradigmas = new Materia("Paradigmas de Programación", 2, 1);
		Materia disenio = new Materia("Diseño de Sistemas", 3, 2);
		
		Inscripcion ins = new Inscripcion();
		Alumno alu = new Alumno("Franco", ins);
		
		assertEquals(alu.inscribir(disenio), "No te has podido inscribir a Diseño de Sistemas, correlativas pendientes.");
	}

}
