package entidades;

public class Pessoa {
	
	private Integer cpf;
	private String nome; 
	private String endereco; 
	private Integer celular; 
	private String email;
	private String loginUsuario;
	private String loginSenha;
	
	public Pessoa() {		
	}
	
	public Pessoa(Integer cpf, String nome, String endereco, Integer celular, String email, String loginUsuario, String loginSenha) {
		this.cpf = cpf;
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		this.email = email;
		this.loginUsuario = loginUsuario;
		this.loginSenha = loginSenha;
	}

	public Integer getCpf() {
		return cpf;
	}

	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereço) {
		this.endereco = endereço;
	}

	public Integer getCelular() {
		return celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String setUsuario() {
		return loginUsuario;
	}
	
	public void setUsuario(String loginUsuario) {
		this.loginUsuario = loginUsuario;
	}	

	public void setSenha(String loginSenha) {
		this.loginSenha = loginSenha;
	}
		
	public static void ListarPessoas(Pessoa[] Pessoa){ 
		for (Pessoa p : Pessoa) {
			System.out.println(
				" CPF: " + p.getCpf() +
				" |Nome: " + p.getNome() +
				" |Endereço: " + p.getEndereco() +
				" |Celular: " + p.getCelular() +  
				" |Email: " + p.getEmail());
		}
	}	
}
