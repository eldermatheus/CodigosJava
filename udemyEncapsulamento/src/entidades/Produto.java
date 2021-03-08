package entidades;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;

	//Cosntrutor
	public Produto(String nome,double preco,int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	
	//Construtor de sobrecarga
		public Produto(String nome,double preco) {
			this.nome = nome;
			this.preco = preco;
	}
	
	// Getters e Setters	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQuantidade() {
		return quantidade;
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