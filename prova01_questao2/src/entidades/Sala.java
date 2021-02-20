package entidades;

public class Sala {
	int numero;
	int capacidade;
	int quantidadeCadeiras;
	int quantidadeMesas;
	int bloco;

	public Sala(int numero, int capacidade, int bloco, int quantidadeCadeiras, int quantidadeMesas) {
		super();
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
	
	public int getQtdeCadeiras() {
		return quantidadeCadeiras;
	}

	public void setQtdeCadeiras(int quantidadeCadeiras) {
		this.quantidadeCadeiras = quantidadeCadeiras;
	}
	
	public int getQtdeMesas() {
		return quantidadeMesas;
	}

	public void setQtdeMesas(int quantidadeMesas) {
		this.quantidadeMesas = quantidadeMesas;
	}

	public int getNome() {
		return bloco;
	}

	public void setNome(int bloco) {
		this.bloco = bloco;
	}

}
