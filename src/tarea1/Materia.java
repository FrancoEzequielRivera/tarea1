package tarea1;

public class Materia {
	
	private String nomMat;
	private Integer idMateria;
	private Integer idCorrelativaAnterior;
	
	public Materia(String nomMat, Integer idMateria, Integer idCorrelativaAnterior) {
		
		this.nomMat = nomMat;
		this.idMateria = idMateria;
		this.idCorrelativaAnterior = idCorrelativaAnterior;
	}

	public String getNomMat() {
		return nomMat;
	}

	public void setNomMat(String nomMat) {
		this.nomMat = nomMat;
	}

	public Integer getidMateria() {
		return idMateria;
	}

	public void setidMateria(Integer idMateria) {
		this.idMateria = idMateria;
	}

	public Integer getidCorrelativaAnterior() {
		return this.idCorrelativaAnterior;
	}

	public void setidCorrelativaAnterior(Integer idCorrelativaAnterior) {
		this.idCorrelativaAnterior = idCorrelativaAnterior;
	}
	
}
