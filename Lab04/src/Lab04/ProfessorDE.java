package Lab04;

public class ProfessorDE extends Professor {
	private Double salario;
	
	public ProfessorDE(Integer matricula, String nome, Double salario) {
		super(matricula, nome, salario);
	}
	
	public Double getSalario() {
		return salario;
	}
	
	public void setSalario(Double salario) {
		this.salario = salario;
	}
}
