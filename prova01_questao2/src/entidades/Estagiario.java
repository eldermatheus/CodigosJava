package entidades;

public class Estagiario extends Pessoa {
	private double remuneracao;
	private	int tempoContrato;
	
	public Estagiario(String nome, int rg, int cpf, int idade, double remuneracao, int tempoContrato) {
		super(nome, rg, cpf, idade);
	}
	
	public double getRemuneracao() {
		return remuneracao;
	}
	
	public void setRemuneracao(double remuneracao) {
		this.remuneracao = remuneracao;
	}
	
	
	public int getTempoContrato() {
		return tempoContrato;
	}
	
	public void setTempoContrato(int tempoContrato) {
		this.tempoContrato = tempoContrato;
	}
	
	
	
	
}
