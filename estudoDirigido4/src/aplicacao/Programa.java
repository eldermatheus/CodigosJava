package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.Pessoa;
import entidades.Diretor;
import entidades.Palestrante;
import entidades.Curso;
import entidades.Proprietario;
import entidades.Produtora;


public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Proprietario proprietario = new Proprietario();
		Produtora produtora = new Produtora();
		
		try {
			Pessoa[] pessoas = new Pessoa[5];
			int resp = 0; 
			while(resp != 9) {
				
				System.out.println("===============================");
				System.out.println("       P R O D U T O R A       ");
				System.out.println("===============================");
				System.out.println("Digite a sua opção:");
				System.out.println("1 - Incluir um ator");
				System.out.println("2 - Alterar um ator");
				System.out.println("3 - Excluir um ator");
				System.out.println("4 - Incluir um diretor");
				System.out.println("5 - Listar pessoas cadastradas");
				System.out.println("9 - Sair");
								
				
				if (resp == 1) {
					Produtora.IncluirUmAtor(ler);
				}
				if (resp == 2) {
					Produtora.AlterarUmAtor(ler);
				}
				if(resp == 3) {
					Produtora.AlterarUmAtor(ler);
				}
				if (resp == 4) {
					 Produtora.IncluirUmDiretor(ler);
				}
				if (resp == 5) {
					Produtora.ListarPessoas(pessoas);
				}
			}
		}
		catch(InputMismatchException error) {
			System.out.println("Valor válido!");
		}
		catch(NumberFormatException error) {
			System.out.println("Número fora do range!");
		}
		ler.close();
	}	
}