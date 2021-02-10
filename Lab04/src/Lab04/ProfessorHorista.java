package Lab04;

public class ProfessorHorista extends Professor {
	private Double salarioHora;
	
	
	public ProfessorHorista(Integer matricula, String nome, Integer cargaHoraria, Double salarioHora) {
		super(matricula, nome, cargaHoraria, salarioHora);
	}
	
	public Double getSalarioHora() {
		return salarioHora;
	}
	
	public void setSalarioHora(Double salarioHora) {
		this.salarioHora = salarioHora;
	}

	
}

