package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import entidades.Pessoa;
import entidades.Aluno;
import entidades.Professor;
import entidades.Turma;
import entidades.Instituicao;


public class Programa {
	
	public static void main(String[] args) throws ParseException {
		//Instanciando objetos
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
		
					
		Instituicao instituicao = new Instituicao(12346, "Instituto Federal de Tencnolgoia","IFS", "Rua A N� 1", 34313431, "ifs@academico.com");
		Professor professor = new Professor(56789, "Sidney", "Rua B N� 2", 34313432, "sidney@academico.com", 11111);
		Turma turma = new Turma("1� Turma CCOMP", formato.parse("02/01/2020"), formato.parse("30/04/2021"), "teste", "Aluno1");
		
		
		Scanner ler = new Scanner(System.in);		
		Pessoa[] pessoa = new Pessoa[1];
		char resp = 0;

		//Programa principal
		while (resp != 'x' && resp != 'X') {
			Menu();
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
				Professor.IncluirAluno(ler);				
			}
			
			if (resp == '5') {
				Professor.AlterarAluno();
			}
			
			if (resp == '6') {
				Professor.ExcluirAluno(ler);
			}

			if (resp == '7') {
				Pessoa.ListarPessoas(pessoa);	
			}

			if (resp == '8') {
				//Cifrar texto 
				Professor.CifrarTexto(ler);
			}

			if (resp == '9') {
				//Decifrar o texto 
				Professor.DecifrarTexto(ler);
			}
		} 	
		ler.close();
	}
	
	public static void Menu() {
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
	}
}
