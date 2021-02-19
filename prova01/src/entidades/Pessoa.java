package entidades;

import java.util.Date;

public class Pessoa {
	private String nome;
	private	String dataDeNascimento;
	
	public Pessoa(String nome, String dataDeNascimento) { 
		super();
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
	}	
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getdataDeNascimento() {
		return dataDeNascimento;
	}
	
	public void setdataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	
}
