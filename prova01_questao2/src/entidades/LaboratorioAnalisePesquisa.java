package entidades;

public class LaboratorioAnalisePesquisa extends Laboratorio{
	private int quantidadeMicroscopios;
	private int quantidadeCentrifugas;
	
	public LaboratorioAnalisePesquisa(int labNumero, int labBloco, int quantidadeMicroscopios, int quantidadeCentrifugas) {
		super(labNumero, labBloco);
	}
	
	public int getQtdeMicroscopios() {
		return quantidadeMicroscopios;
	}

	public void setQtdeMicroscopios(int quantidadeMicroscopios) {
		this.quantidadeMicroscopios = quantidadeMicroscopios;
	}
	
	public int getQtdeCentrifugas() {
		return quantidadeCentrifugas;
	}

	public void setQtdeCentrifugas(int quantidadeCentrifugas) {
		this.quantidadeCentrifugas = quantidadeCentrifugas;
	}
	
	
}
