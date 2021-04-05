package entidades;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Aluno;
import entidades.Pessoa;

public class Professor extends Pessoa{
	
	private Integer matriculaFuncional;
	
	public Professor() {		
	}
	
	public Professor(Integer cpf, String nome, String endereço, Integer celular, String email, String loginUsuario, String loginSenha, Integer matriculaFuncional) {
		super(cpf, nome, endereço, celular, email, loginUsuario, loginSenha);
		this.matriculaFuncional = matriculaFuncional;
	}

	public Integer getMatriculaFuncional() {
		return matriculaFuncional;
	}

	public void setMatriculaFuncional(Integer matriculaFuncional) {
		this.matriculaFuncional = matriculaFuncional;
	}
	
	
	public static Pessoa IncluirAluno(Scanner ler) {
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
		
		System.out.print("Login: ");
		String login = ler.nextLine();
				
		System.out.print("Senha: ");
		String senha = ler.nextLine();
				
		System.out.print("Matrícula Acadêmica: ");
		Integer matricula = ler.nextInt();
		ler.nextLine();				
		
		return new Aluno(cpf, nome, endereco, celular, email, login,senha, matricula);
	}
	
	public static void AlterarAluno(Scanner ler, Pessoa[] pessoas) {		
		
		for (Pessoa p : pessoas) {
			Aluno a = (Aluno) p;
			
			System.out.println("Escolha o dado que deseja alterar: ");
			System.out.println("CPF; nome; endereco; celular; email; login; senha; matricula");
			
			String escolha = ler.nextLine().toLowerCase();;
			
			String alteracao;
			Integer alteracaoInt;
			
			if(escolha == "cpf") {
				System.out.print("Novo CPF?: ");
				alteracaoInt = ler.nextInt();
				a.setCpf(alteracaoInt);
				ler.nextLine();
			}
				
			if(escolha == "nome") {
				System.out.print("Novo nome?: ");
				alteracao = ler.nextLine().toUpperCase();
				a.setNome(alteracao);
			}
			
			if(escolha == "endereco") {
				System.out.print("Novo endereco?: ");
				alteracao = ler.nextLine().toUpperCase();
				a.setEndereco(alteracao);
			}
			
			if(escolha == "celular") {
				System.out.print("Novo celular?: ");
				alteracaoInt = ler.nextInt();
				a.setCelular(alteracaoInt);	
				ler.nextLine();
			}
			
			if(escolha == "email") {
				System.out.print("Novo email?: ");
				alteracao = ler.nextLine().toLowerCase().trim();
				a.setEmail(alteracao);
			}
			
			if(escolha == "logins") {
				System.out.print("Novo login?: ");
				alteracao = ler.nextLine().toLowerCase().trim();
				a.setUsuario(alteracao);
			}
			
			if(escolha == "senha") {
				System.out.print("Nova senha?: ");
				alteracao = ler.nextLine().toLowerCase().trim();
				a.setSenha(alteracao);
			}
	
			if(escolha == "matricula") {
				System.out.print("Nova Matrícula?: ");
				alteracaoInt = ler.nextInt();
				a.setMatriculaAcademica(alteracaoInt);
				ler.nextLine();
			}
		}	
	}
	
	public static void ExcluirAluno(Scanner ler,  Pessoa[] pessoas) {		
		System.out.print("Qual aluno deseja excluir?");
		String nome = ler.nextLine().toUpperCase();		
		for (int ident = 0; ident < pessoas.length; ident++) {
			if(pessoas[ident] != null && nome.equals(pessoas[ident].getNome())) {
				pessoas[ident] = null;
				System.out.println("A!");
			}	
		}
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
