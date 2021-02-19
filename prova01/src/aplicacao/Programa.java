package aplicacao;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import entidades.Pessoa;
import entidades.Mae;
import entidades.Medico;
import entidades.Medicamento;


public class Programa {

	public static void main(String[] args) {
		//Instanciando
		Scanner ler = new Scanner(System.in);		
		ArrayList<Pessoa> Pessoa = new ArrayList();
		ArrayList<Medicamento> Medicamento = new ArrayList();
		int resp = 1;
		
		while (resp != 9) {
			System.out.println("");
			System.out.println("=======================================");
			System.out.println("|1 - Incluir um Médico		      |");
			System.out.println("|2 - Incluir uma Mãe 		      |");
			System.out.println("|3 - Incluir um Bebê 	    	      |");
			System.out.println("|4 - Incluir um Medicamento 	      |");	
			System.out.println("|5 - Listar pessoas cadastradas	      |");
			System.out.println("|6 - Listar medicamentos cadastrados  |");
			System.out.println("|9 - Sair			      |");
			System.out.println("=======================================");
			resp = ler.nextInt();
		
			if (resp == 1) {
				//Adiciona médico
				System.out.print("Nome:");
				ler.nextLine();
				String nome = ler.nextLine();
				System.out.print("Data de nascimento:");
				//ler.nextLine();
				String dataDeNascimento = ler.nextLine();				
				System.out.print("CRM:");
				//ler.nextLine();
				String crm = ler.nextLine();				
				System.out.print("Endereço:");
				ler.nextLine();
				String endereco = ler.nextLine();				
				System.out.print("Telefone Celular:");
				int telefoneCelular = ler.nextInt();
				Pessoa.add(new Medico(nome, dataDeNascimento, crm, endereco, telefoneCelular));				
			}
			
			if (resp == 2) {
				//Adiciona mãe
				System.out.print("Nome:");
				ler.nextLine();
				String nome = ler.nextLine();
				System.out.print("Data de nascimento:");
				ler.nextLine();
				String dataDeNascimento = ler.nextLine();
				System.out.print("Sobrenome:");
				ler.nextLine();
				String sobrenome = ler.nextLine();
				System.out.print("Endereço:");
				ler.nextLine();
				String endereco = ler.nextLine();
				System.out.print("Telefone:");
				ler.nextLine();
				int telefone = ler.nextInt();
				Pessoa.add(new Mae(nome, dataDeNascimento, sobrenome, endereco, telefone));	
			}
			
			if (resp == 3) {
				//Adiciona bebê
				System.out.print("Nome:");
				ler.nextLine();
				String nome = ler.nextLine();
				System.out.print("Data de nascimento:");
				ler.nextLine();
				String dataDeNascimento = ler.nextLine();
				Pessoa.add(new Pessoa(nome, dataDeNascimento));
			}
			
			if (resp == 4) {
				//Adiciona medicamento
				System.out.print("Nome:");
				ler.nextLine();
				String descricao = ler.nextLine();
				System.out.print("Quantidade Estoque:");
				int quantidadeEmEstoque = ler.nextInt();
				System.out.print("Unidade Medida:");
				ler.nextLine();
				String unidadeMedida = ler.nextLine();
				Medicamento.add(new Medicamento(descricao, quantidadeEmEstoque, unidadeMedida));
			}
			
			if (resp == 5) {
				for (Pessoa p : Pessoa) {
					System.out.println(
						"Nome: " + p.getNome() +
						", Data de Nascimento : " + p.getdataDeNascimento());
					}
			}
				
			if (resp == 6) {
				for (Medicamento m : Medicamento) {
					System.out.println(
					": " + m.getDescricao() +
					", : " + m.getQuantidadeEmEstoque() +
					", " + m.getUnidadeMedida()); 
					}
			} 
					
		} ler.close();
	}
}
