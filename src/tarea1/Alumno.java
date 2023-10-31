package tarea1;

import java.util.ArrayList;
import java.util.List;

public class Alumno {
	
	private String nombreAlu;
	private Inscripcion ins;
	private ArrayList<Integer> idListaMateriasAprobadas;
	
	public Alumno(String nombreAlu , Inscripcion ins) {

		this.nombreAlu = nombreAlu;
		this.idListaMateriasAprobadas = new ArrayList<Integer>();
		this.ins = new Inscripcion();
	}
	
	public String inscribir(Materia mat) {
		
		String resultado;
		
		if (ins.aprobada(mat, this.idListaMateriasAprobadas)){
			/*this.agregarAprobada(idMateria);*/
			resultado = "Inscripción exitosa.";
		}else {
			resultado = "No te has podido inscribir a " + mat.getNomMat() +", correlativas pendientes.";
		}
		
		return resultado;
	}
	
	public void agregarAprobada(Integer idMateria) {
		this.idListaMateriasAprobadas.add(idMateria);
	}
}
