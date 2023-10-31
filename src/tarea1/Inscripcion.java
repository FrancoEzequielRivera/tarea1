package tarea1;

import java.util.ArrayList;

public class Inscripcion {
	
	public boolean aprobada(Materia mat, ArrayList<Integer> idListaMateriasAprobadas) {
		
		boolean aprobadaAnterior = false;
		
		if(mat.getidCorrelativaAnterior() == -1) {
			aprobadaAnterior = true;
		}else{
			for(int i : idListaMateriasAprobadas) {
				if(i == mat.getidCorrelativaAnterior()){
					aprobadaAnterior = true;
				}
			}
		}
		
		return aprobadaAnterior;
	}

}
