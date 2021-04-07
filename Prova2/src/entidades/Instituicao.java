package entidades;

public class Instituicao {
	private Integer cnpj;
	private String nomeFantasia; 
	private String razaoSocial;
	private String endereco; 
	private Integer telefone;
	private String email;
	
	public Instituicao() {		
	}
			
	public Instituicao(Integer cnpj, String nomeFantasia, String razaoSocial, String endereco, Integer telefone, String email) {
		this.cnpj = cnpj;
		this.nomeFantasia = nomeFantasia;
		this.razaoSocial = razaoSocial;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public Integer getCnpj() {
		return cnpj;
	}

	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return 
		"Dados da Instituicação de Ensino"
		+ System.lineSeparator()
		+ "-CNPJ: " + cnpj 
		+ ". -Nome Fantasia: " + nomeFantasia
		+ ". -Razão Social : " + razaoSocial
		+ ". -Endereço: " + endereco
		+ ". -Telefone: " + telefone
		+ ". -E-mail: " + email +".";
	}
}
