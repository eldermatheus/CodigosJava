package entidades;

public class Pesquisador extends Pessoa{
	int alunosSupervisionados;
	double salario;
	int totalProjetos;
	
	public Pesquisador(String nome, int rg, int cpf, int idade, int alunosSupervisionados, double salario, 	int totalProjetos) {
		super(nome, rg, cpf, idade);
	}
	
	public int getAlunosSupervisionados() {
		return alunosSupervisionados;
	}
	
	public void setAlunosSupervisionados(int alunosSupervisionados) {
		this.alunosSupervisionados = alunosSupervisionados;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getTotalProjetos() {
		return totalProjetos;
	}
	
	public void setTotalProjetos(int totalProjetos) {
		this.totalProjetos = totalProjetos;
	}
	
	
	
	
	
}
