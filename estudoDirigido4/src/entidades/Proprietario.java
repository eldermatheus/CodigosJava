package entidades;

public class Proprietario extends Pessoa {

	public Proprietario() {
	}
	
	public Proprietario(String nome, String endereco, String celular, String email) {
		super(nome, endereco, celular, email);
	}

	@Override
	public String toString() {
		return String.format(this.getNome()
				+ ", " + this.getEndereco()
				+ ", " + this.getCelular()
				+ ", " + this.getEmail());
	}
}