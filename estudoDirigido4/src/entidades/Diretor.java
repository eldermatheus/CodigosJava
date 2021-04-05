package entidades;

public class Diretor extends Pessoa {

	public Diretor(String nome, String endereco, String email, String celular) {
		super(nome, endereco, email, celular);
	}

	@Override
	public String toString() {
		return String.format("Diretor: " + this.getNome()
				+ ", Endereco: " + this.getEndereco()
				+ ", Celular: " + this.getCelular()
				+ ", Email: " + this.getEmail());
	}	
}