package entidades;

public class Colaborador extends Pessoa {
	private double salario;
	private int nivel;

	public Colaborador(String nome, int rg, int cpf, int idade, double salario, int nivel) {
		super(nome, rg, cpf, idade);
	}
	
	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
}
