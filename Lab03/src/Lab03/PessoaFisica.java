package Lab03;

public class PessoaFisica extends Pessoa {
	private String cpf;
	
	public PessoaFisica(String nome, String email) {
		super(nome, email);
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
