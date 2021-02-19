package entidades;

public class Hospede extends Pessoa{
	private int quantidadeOcupacoes;  
		
	public Hospede(String nome, int rg,  int cpf, String endereco, int telefone, int celular, String email) {
		super(nome, rg,  cpf, endereco, telefone, celular, email);
	}
	
	public int getQuantidadeOcupacao() {
		return quantidadeOcupacoes;
	}
	
	public void setsetQuantidadeOcupacao(int numeroOcupacoes) {
		this.quantidadeOcupacoes = quantidadeOcupacoes;
	}
	
}
