package entidades;

import java.util.Date;

public class Medico extends Pessoa{
	private String crm;
	private	String endereco;
	int telefoneCelular;
	
	public Medico(String nome, String dataDeNascimento) { 
		super(nome,dataDeNascimento);
		
	}	
	
	public String getCrm() {
		return crm;
	}
	
	public void setCrm(String crm) {
		this.crm = crm;
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	
	public int getTelefoneCelular() {
		return telefoneCelular;
	}
	
	public void setTelefoneCelular(int telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}
	
	
}
