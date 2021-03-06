package entidades;

public class Produto {
	public String nome;
	public double preco;
	public int quantidade;

	//Cosntrutor
	public Produto(String nome,double preco,int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//Cosntrutor de sobrecarga
		public Produto(String nome,double preco) {
			this.nome = nome;
			this.preco = preco;
	}
	
	//Métodos
	public double valorTotalEstoque() {
		return preco * quantidade;
	}

	public void adicionarProduto(int quantidade) {
		this.quantidade += quantidade;
	}

	public void removerProduto(int quantidade) {
		this.quantidade -= quantidade;
	}
	
	public String toString() {
		return nome 
				+ ", R$ "
				+ preco
				+ ", "
				+ quantidade
				+ " unidades, Total: $ "
				+ valorTotalEstoque();
	}
}