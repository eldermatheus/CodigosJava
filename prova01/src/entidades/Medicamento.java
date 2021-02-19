package entidades;

public class Medicamento {
	private String descricao;
	private	int quantidadeEmEstoque;
	private String unidadeMedida;
	
	public Medicamento(String descricao, int quantidadeEmEstoque, String unidadeMedida) { 
		super();
		this.descricao = descricao;
		this.quantidadeEmEstoque = quantidadeEmEstoque;
		this.unidadeMedida = unidadeMedida;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getQuantidadeEmEstoque() {
		return quantidadeEmEstoque;
	}
	
	public void setQuantidadeEmEstoque(int quantidadeEmEstoque) {
		this.quantidadeEmEstoque = quantidadeEmEstoque;
	}
	
	public String getUnidadeMedida() {
		return unidadeMedida;
	}
	
	public void setUnidadeMedida(String unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}
	
	
	
}
