package entidades;

import java.util.Scanner;

public class Produtora {

	private String nome;
	private String endereco;
	private String email;
	private String celular;
	private Proprietario proprietario;

	public Produtora() {	
	}
	
	public Produtora(String nome, String endereco, String email, String celular, Proprietario proprietario) {
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.celular = celular;
		this.proprietario = proprietario;
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
	public Proprietario getProprietario() { 
		return proprietario; 
	}
	public void setProprietario(Proprietario proprietario) { 
		this.proprietario = proprietario;
	}
	
	public static Pessoa IncluirUmAtor(Scanner ler) {
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Endereço: ");
		String endereco = ler.nextLine();
		System.out.print("Celular: ");
		String celular = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		System.out.print("Curriculo: ");
		String link = ler.nextLine();
		return new Palestrante(nome, endereco, email, celular, link);
	}
	
	public static void AlterarUmAtor(Scanner ler) {
	}
	
	public static void ExcluirUmAtor(Scanner ler) {		
	}
	
	public static Pessoa IncluirUmDiretor(Scanner ler) {
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Endereço: ");
		String endereco = ler.nextLine();
		System.out.print("E-mail: ");
		String email = ler.nextLine();
		System.out.print("Celular: ");
		String celular = ler.nextLine();
		return new Diretor(nome, endereco, email, celular);
	}
	
	public static void ListarPessoas(Pessoa[] pessoa) {
		for (Pessoa p : pessoa) {
			System.out.println(
				"Nome: " + p.getNome() +
				"\rEndereço: " + p.getEndereco() +
				"\rEmail: " + p.getEmail() + 
				"\rCelular: " + p.getCelular());
		}		
	}
}