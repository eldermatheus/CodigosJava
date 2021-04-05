package entidades;

public abstract class Pessoa {
	
	private String nome;
	private String endereco;
	private String email;
	private String celular;
	
	public Pessoa() {
	}
	
	public Pessoa(String nome, String endereco, String email, String celular) {
		this.nome = nome;
		this.endereco = endereco;
		this.celular = celular;
		this.email = email;
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
	
	public void setEndereco(String endereco) { 
		this.endereco = endereco; 
	}
	
	public String getEmail() {
		return email; 
	}
	
	public void setEmail(String email) { 
		this.email = email; 
	}
	
	public String getCelular() { 
		return celular; 
	}
	
	public void setCelular(String celular) { 
		this.celular = celular; 
	}
	
	public String toString() {
		return toString();
	}
}