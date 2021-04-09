package entidades;

import java.util.Scanner;


public class Professor extends Pessoa{
	
	private Integer matriculaFuncional;
	
	public Professor() {		
	}
	
	public Professor(String cpf, String nome, String endereço, Integer celular, String email, String loginUsuario, String loginSenha, Integer matriculaFuncional, String chaveRecuperacao) {
		super(cpf, nome, endereço, celular, email, loginUsuario, loginSenha, chaveRecuperacao);
		this.matriculaFuncional = matriculaFuncional;
	}

	public Integer getMatriculaFuncional() {
		return matriculaFuncional;
	}

	public void setMatriculaFuncional(Integer matriculaFuncional) {
		this.matriculaFuncional = matriculaFuncional;
	}
	
	//Método para inclusão de aluno
	public static Pessoa IncluirAluno(Scanner ler) {
		System.out.print("CPF: ");
		String cpf = ler.nextLine();		
		
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
		
		System.out.print("Chave de recuperação da capsula? ");
		String chaveRecuperacao = ler.nextLine();
		
		return new Aluno(cpf, nome, endereco, celular, email, login, senha, matricula, chaveRecuperacao);
	}	
	
	//Método para alteração de aluno
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
				alteracao = ler.nextLine();
				a.setCpf(alteracao);
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
				System.out.print("Nova Matrícula?: ");
				alteracaoInt = ler.nextInt();
				a.setMatriculaAcademica(alteracaoInt);
				ler.nextLine();
			}
		}	
	}
	
	//Método para exclusão de aluno
	public static void ExcluirAluno(Scanner ler,  Pessoa[] pessoas) {		
		System.out.print("Qual aluno deseja excluir?");
		String nome = ler.nextLine();		
		for (int ident = 0; ident < pessoas.length; ident++) {
			if(pessoas[ident] != null && nome.equals(pessoas[ident].getNome())) {
				pessoas[ident] = null;
				System.out.println("Aluno excluído!");
			}	
		}
	}	
	
	//Método de impressão dos dados --Herdado de entidades.Instituicao
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
