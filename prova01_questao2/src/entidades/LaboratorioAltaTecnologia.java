package entidades;

public class LaboratorioAltaTecnologia extends Laboratorio{
	private int quantidadeComputadores;
	private int quantidadeServidores;
	
	public LaboratorioAltaTecnologia(int labNumero, int labBloco, int quantidadeComputadores, int quantidadeServidores) {
		super(labNumero, labBloco);
	}
	
	public int getQtdeComputadores() {
		return quantidadeComputadores;
	}

	public void setQtdeComputadores(int quantidadeComputadores) {
		this.quantidadeComputadores = quantidadeComputadores;
	}
	
	public int getQtdeServidores() {
		return quantidadeServidores;
	}

	public void setQtdeServidores(int quantidadeServidores) {
		this.quantidadeServidores = quantidadeServidores;
	}
	
	
}
