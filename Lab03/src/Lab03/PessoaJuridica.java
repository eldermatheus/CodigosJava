package Lab03;

public class PessoaJuridica extends Pessoa {
	private String cnpj;
	
	public PessoaJuridica(String nome, String email) {
		super(nome,email);
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
