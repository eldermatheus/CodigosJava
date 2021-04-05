package entidades;

import java.util.Scanner;
import entidades.Aluno;
import entidades.Pessoa;

public class Professor extends Pessoa{
	
	private Integer matriculaFuncional;
	
	  
	
	public Professor() {		
	}
	
	public Professor(Integer cpf, String nome, String endereço, Integer celular, String email, Integer matriculaFuncional) {
		super(cpf, nome, endereço, celular, email);
		this.matriculaFuncional = matriculaFuncional;
	}

	public Integer getMatriculaFuncional() {
		return matriculaFuncional;
	}

	public void setMatriculaFuncional(Integer matriculaFuncional) {
		this.matriculaFuncional = matriculaFuncional;
	}
	
	
	public static Pessoa IncluirAluno() {
		Scanner ler = new Scanner(System.in);		
		System.out.print("CPF: ");
		Integer cpf = ler.nextInt();		
		
		ler.nextLine();
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		
		System.out.print("Endereço: ");
		String endereco = ler.nextLine();
		
		System.out.print("Celular: ");
		Integer celular = ler.nextInt();
		
		ler.nextLine();
		System.out.print("E-mail: ");
		String email = ler.nextLine();
		
		System.out.print("Matrícula Acadêmica: ");
		Integer matricula = ler.nextInt();
		ler.nextLine();
		ler.close();	
		
		return new Aluno(cpf, nome, endereco, celular, email, matricula);
	}
	
	public static void AlterarAluno(Pessoa[] pessoas) {		
		Scanner ler = new Scanner(System.in);
		
		for (Pessoa p : pessoas) {
			Aluno a = (Aluno) p;
			
			System.out.println("Escolha o dado que deseja alterar: ");
			System.out.println("CPF; Nome; Endereco; celular; email; matricula");
			
			String escolha = ler.nextLine();
			
			String alteracao;
			Integer alteracaoInt;
			
			if(escolha == "CPF") {
				System.out.print("Novo CPF? ");
				alteracaoInt = ler.nextInt();
				a.setCpf(alteracaoInt);
				ler.nextLine();
			}
				
			if(escolha == "Nome") {
				System.out.print("Novo nome? ");
				alteracao = ler.nextLine().toUpperCase();
				a.setNome(alteracao);
			}
			
			if(escolha == "Endereco") {
				System.out.print("Novo endereco? ");
				alteracao = ler.nextLine().toUpperCase();
				a.setEndereco(alteracao);
			}
			
			if(escolha == "celular") {
				System.out.print("Novo celular? ");
				alteracaoInt = ler.nextInt();
				a.setCelular(alteracaoInt);	
				ler.nextLine();
			}
			
			if(escolha == "email") {
				System.out.print("Novo email? ");
				alteracao = ler.nextLine().toLowerCase().trim();
				a.setEmail(alteracao);
			}
	
			if(escolha == "matricula") {
				System.out.print("Nova Matrícula? ");
				alteracaoInt = ler.nextInt();
				a.setMatriculaAcademica(alteracaoInt);
				ler.nextLine();
			}
		}	
		ler.close();	
	}
	
	public static Pessoa ExcluirAluno(Scanner ler) {
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Endereço: ");
		String endereco = ler.nextLine();
		System.out.print("E-mail: ");
		String email = ler.nextLine();
		System.out.print("Celular: ");
		String celular = ler.nextLine();
		return new Aluno(nome, endereco, email, celular);
	}
	
	
	public static void CifrarTexto(Scanner ler) {
	}
	
	public static void DecifrarTexto(Scanner ler) {
	}
	
	
	@Override
	public String toString() {
		return 
		"Dados do Professor"
		+ System.lineSeparator()
		+ "-CPF: " + getCpf() 
		+ ". -Nome: " + getNome()
		+ ". -Endereço: " + getEndereco()
		+ ". -Celular: " + getCelular()
		+ ". -E-mail: " + getEmail() +".";
	}	
	

	
}
