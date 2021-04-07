package entidades;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Aluno;
import entidades.Pessoa;

public class Professor extends Pessoa{
	
	private Integer matriculaFuncional;
	
	public Professor() {		
	}
	
	public Professor(Integer cpf, String nome, String endere�o, Integer celular, String email, String loginUsuario, String loginSenha, Integer matriculaFuncional) {
		super(cpf, nome, endere�o, celular, email, loginUsuario, loginSenha);
		this.matriculaFuncional = matriculaFuncional;
	}

	public Integer getMatriculaFuncional() {
		return matriculaFuncional;
	}

	public void setMatriculaFuncional(Integer matriculaFuncional) {
		this.matriculaFuncional = matriculaFuncional;
	}
	
	//M�todo para inclus�o de aluno
	public static Pessoa IncluirAluno(Scanner ler) {
		System.out.print("CPF: ");
		Integer cpf = ler.nextInt();		
		
		ler.nextLine();
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		
		System.out.print("Endere�o: ");
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
				
		System.out.print("Matr�cula Acad�mica: ");
		Integer matricula = ler.nextInt();
		ler.nextLine();				
		
		return new Aluno(cpf, nome, endereco, celular, email, login, senha, matricula);
	}	
	
	//M�todo para altera��o de aluno
	public static void AlterarAluno(Scanner ler, Pessoa[] pessoas) {		
		for (Pessoa p : pessoas) {
			Aluno a = (Aluno) p;
			
			System.out.println("Escolha o dado que deseja alterar: ");
			System.out.println("CPF; nome; endereco; celular; email; login;");
			
			String escolha = ler.nextLine().toLowerCase();;
			
			String alteracao;
			Integer alteracaoInt;
			
			if(escolha.equals("cpf")) {
				System.out.print("Novo CPF?: ");
				alteracaoInt = ler.nextInt();
				a.setCpf(alteracaoInt);
				ler.nextLine();
			}
				
			if(escolha.equals("nome")) {
				System.out.print("Novo nome?: ");
				alteracao = ler.nextLine();
				a.setNome(alteracao);
			}
			
			if(escolha.equals("endereco")) {
				System.out.print("Novo endereco?: ");
				alteracao = ler.nextLine();
				a.setEndereco(alteracao);
			}
			
			if(escolha.equals("celular")) {
				System.out.print("Novo celular?: ");
				alteracaoInt = ler.nextInt();
				a.setCelular(alteracaoInt);	
				ler.nextLine();
			}
			
			if(escolha.equals("email")) {
				System.out.print("Novo email?: ");
				alteracao = ler.nextLine();
				a.setEmail(alteracao);
			}
			
			if(escolha.equals("login")) {
				System.out.print("Novo login?: ");
				alteracao = ler.nextLine();
				a.setUsuario(alteracao);
			}
			
			if(escolha.equals("senha")) {
				System.out.print("Nova senha?: ");
				alteracao = ler.nextLine();
				a.setSenha(alteracao);
			}
	
			if(escolha.equals("matricula")) {
				System.out.print("Nova Matr�cula?: ");
				alteracaoInt = ler.nextInt();
				a.setMatriculaAcademica(alteracaoInt);
				ler.nextLine();
			}
		}	
	}
	
	//M�todo para exclus�o de aluno
	public static void ExcluirAluno(Scanner ler,  Pessoa[] pessoas) {		
		System.out.print("Qual aluno deseja excluir?");
		String nome = ler.nextLine();		
		for (int ident = 0; ident < pessoas.length; ident++) {
			if(pessoas[ident] != null && nome.equals(pessoas[ident].getNome())) {
				pessoas[ident] = null;
				System.out.println("Aluno exclu�do!");
			}	
		}
	}	
	
	//M�todo para cifrar o texto
	public static void CifrarTexto(Scanner ler) {
	}
	
	//M�todo para decifrar o texto
	public static void DecifrarTexto(Scanner ler) {
	}
	
	
	//M�todo de impress�o dos dados --Herdado de entidades.Instituicao
	@Override 
	public String toString() {
		return 
		"Dados do Professor"
		+ System.lineSeparator()
		+ "-CPF: " + getCpf() 
		+ ". -Nome: " + getNome()
		+ ". -Endere�o: " + getEndereco()
		+ ". -Celular: " + getCelular()
		+ ". -E-mail: " + getEmail() +".";
	}
}
