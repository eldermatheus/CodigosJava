package aplicacao;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Aluno;
import entidades.Instituicao;
import entidades.Pessoa;
import entidades.Professor;
import entidades.Turma;
import servicos.CriptoDecripto;


public class Programa {
	
	public static void main(String[] args) throws ParseException {
		//Instanciando objetos
			SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
			Instituicao instituicao = new Instituicao(12346, "Instituto Federal de Tencnolgoia","IFS", "Rua A Nº 1", 34313431, "ifs@academico.com");
		
			Professor professor = new Professor("56789", "Sidney", "Rua B Nº 2", 34313432, "sidney@academico.com", "usu@rio1", "senha1234",11111, "4321");
			
			Aluno aluno = new Aluno();
			
			Turma turma = new Turma("1ª Turma CCOMP", formato.parse("02/01/2020"), formato.parse("30/04/2021"), "teste", "Aluno1");		
		
		//Abrindo o Scanner e criando o vetor
			Scanner ler = new Scanner(System.in);	
			
		
			Pessoa[] pessoa = new Pessoa[1];
			Date data = new Date(System.currentTimeMillis());
			char resp = 0;
			int contador = 0;

		//Programa principal
			try {
				while (resp != 'x' && resp != 'X') {
			
				System.out.println("");
				System.out.println("=========================================");
				System.out.println("|1 - Dados da IES 			|");
				System.out.println("|2 - Dados da turma			|");
				System.out.println("|3 - Dados do professor			|");
				System.out.println("|4 - Incluir um aluno			|");	
				System.out.println("|5 - Alterar um aluno			|");
				System.out.println("|6 - Excluir um aluno			|");
				System.out.println("|7 - Listar pessoas			|");
				System.out.println("|8 - Cifrar texto			|");
				System.out.println("|9 - Decifrar texto			|");
				System.out.println("|X - Sair				|");
				System.out.println("=========================================");		
			
				resp = ler.nextLine().charAt(0);
		
				if (resp == '1') {	
					//Dados da IES
					System.out.println(instituicao);
				}
				
				if (resp == '2') {
					//Dados da turma
					System.out.println(turma);
				}
				
				if (resp == '3') {
					//Dados da professor
					System.out.println(professor);
				}
				
				if (resp == '4') {
					pessoa[contador] = Professor.IncluirAluno(ler);								
				}
				
				if (resp == '5') {
					Professor.AlterarAluno(ler, pessoa);
				}
				
				if (resp == '6') {
					Professor.ExcluirAluno(ler, pessoa);
				}
	
				if (resp == '7') {
					Pessoa.ListarPessoas(pessoa);	
				}
	
				if (resp == '8') {
					CriptoDecripto.CifrarTexto(ler);					
				}
	
				if (resp == '9') {
					
					//Checa se é a data certa para abrir a capsula
					/*if(data.before(turma.getDataTermino())) {
					System.out.println("Ainda não é a data para abrir a cápsula!");	
					}
					else	*/				
					CriptoDecripto.DecifrarTexto(ler);					
				}
				
				if (resp == '0') {
									
					System.out.println(Professor.getChaveRecuperacaoProfessor());
					System.out.println(Aluno.getChaveRecuperacaoAluno());
				}
			}
		} 			
		// Tratamento de exceções
		catch(InputMismatchException error) {
			System.out.println("Valor inválido!");
		}
		catch(NumberFormatException error) {
			System.out.println("Número fora do range!");
		}				
		catch(NullPointerException error) {	
			System.out.println("A lista de pessoas está vazia!");
		}
			
		ler.close();
		System.out.println("Fim do programa!");
	}	
}
