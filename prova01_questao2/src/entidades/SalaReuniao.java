package entidades;

public class SalaReuniao extends Sala{
	int mesas;
	int cadeiras;
	int expositor;
	
	public SalaReuniao(int numero, int capacidade, int bloco, int mesas, int quantidadeCadeiras, int quantidadeMesas, int cadeiras, int expositor) {
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
