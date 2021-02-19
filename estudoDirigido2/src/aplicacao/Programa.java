package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Pessoa;
import entidades.Colaborador;

public class Programa {

	public static void main(String[] args) {
		//Instanciando
		Scanner ler = new Scanner(System.in);		
		ArrayList<Pessoa> Pessoa = new ArrayList();
		int resp = 1;
		
		
		while (resp != 9) {
			System.out.println("1 - Incluir colaborador");
			System.out.println("2 - Incluir hóspede");
			System.out.println("3 - Alterar dados hóspede");
			System.out.println("4 - Vericar disponibilidade de quarto");	
			System.out.println("5 - Fazer reserva de quarto");
			System.out.println("6 - Listar dados");
			System.out.println("9 - Sair");
			System.out.println("");
			resp = ler.nextInt();
		
			if (resp == 1) {
				//Cadastro de colaborador
				System.out.print("Nome:");
				String nome = ler.next();
				System.out.print("RG:");
				int rg = ler.nextInt();
				System.out.print("CPF:");
				int cpf = ler.nextInt();
				System.out.print("Enredeço:");
				String endereco = ler.next();
				System.out.print("Telefone:");
				int telefone = ler.nextInt();
				System.out.print("Celular:");
				int celular = ler.nextInt();
				System.out.print("Email:");
				String email = ler.next();
				Pessoa.add(new Pessoa(nome, rg, cpf, endereco, telefone, celular, email));
			}
			
			if (resp == 2) {
				//Cadastro de hóspede
				System.out.print("Nome:");
				String nome = ler.next();
				System.out.print("RG:");
				int rg = ler.nextInt();
				System.out.print("CPF:");
				int cpf = ler.nextInt();
				System.out.print("Enredeço:");
				String endereco = ler.next();
				System.out.print("Telefone:");
				int telefone = ler.nextInt();
				System.out.print("Celular:");
				int celular = ler.nextInt();
				System.out.print("Email:");
				String email = ler.next();
				Pessoa.add(new Pessoa(nome, rg, cpf, endereco, telefone, celular, email));
			}
			
			if (resp == 3) {
				//Alterar dados hóspede
			}
			
			if (resp == 4) {
				//Vericar disponibilidade de quarto
			}
			
			if (resp == 5) {
				//Fazer reserva de quarto
			}
				
				
				
			if (resp == 6) {
				for (Pessoa p : Pessoa) {
					System.out.println(
						p.getNome()  + " "
						+ p.getRg() + " "
						+ p.getCpf() + " "
						+ p.getEndereco() + " "
						+ p.getTelefone() + " "
						+ p.getCelular() + " " 
						+ p.getEmail());
							}
			}
		
		
			ler.close();
		}
	}
}
