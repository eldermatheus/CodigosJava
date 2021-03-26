package entidades;

public class Pessoa {
	private String cpf;
	private String matricula;
	private String nome;
	private String telefone;
	private String email;
	
	public Pessoa(String cpf, String matricula, String nome, String telefone, String email) {
		this.cpf = cpf;
		this.matricula = matricula;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	
	
	
	
	
}
