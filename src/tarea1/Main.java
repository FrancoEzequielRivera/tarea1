package tarea1;

public class Main {

	public static void main(String[] args) {
		
		/*
			En materia se ingresa (nombre de materia, id de materia, id correlativa anterior)
			Si no tiene correlativa anterior se ingresa -1
		 */
		
		Materia algoritmos = new Materia("Algoritmos y Estructuras de Datos", 1, -1);
		Materia paradigmas = new Materia("Paradigmas de Programación", 2, 1);
		Materia disenio = new Materia("Diseño de Sistemas", 3, 2);
		
		//Inscripcion va dentro de alumno así se puede llamar a aprobada() desde Alumno
		
		Inscripcion ins = new Inscripcion();
		Alumno alu = new Alumno("Franco", ins);
		
		/*
		El alumno agrega las materias que aprobó con el id de materia
		de la materia aprobada en algún momento
		*/
		
		alu.agregarAprobada(1);
		//alu.agregarAprobada(2);
		//alu.agregarAprobada(3);
		
		/*
			Acá inscribo al Alumno a una Materia, dentro del método comparo si el
			id anterior de la materia elegida es -1 (para que se acepte la inscripción) O 
			comparo si el id anterior de la materia elegida es igual a alguna de las materias
			aprobadas agregadas con el método agregarAprobada de Alumno (que se guardan en un
			arrayList)
		 */
		
		//System.out.println(alu.inscribir(algoritmos));
		System.out.println(alu.inscribir(paradigmas));
		//System.out.println(alu.inscribir(disenio));
	}

}
