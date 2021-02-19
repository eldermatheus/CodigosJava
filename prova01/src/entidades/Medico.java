package entidades;

import java.util.Date;

public class Medico extends Pessoa{
	private String crm;
	private	String endereco;
	private int telefoneCelular;
	
	public Medico(String nome, String dataDeNascimento, String crm, String endereco, int telefoneCelular) { 
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
