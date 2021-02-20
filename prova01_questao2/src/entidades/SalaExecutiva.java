package entidades;

public class SalaExecutiva extends Sala{
	int computadores;
	int dataShow;	
	
	public SalaExecutiva(int numero, int capacidade, int bloco, int quantidadeCadeiras, int quantidadeMesas, int computadores, int dataShow) {
		super(numero, capacidade, bloco, quantidadeCadeiras, quantidadeMesas);
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
}
