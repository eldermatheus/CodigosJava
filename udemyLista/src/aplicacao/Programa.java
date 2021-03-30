package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Funcionario;
import entidades.Terceirizado;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int totalFuncionarios = 0;
		Scanner ler = new Scanner(System.in);
		ArrayList<Funcionario> Funcionario = new ArrayList();		
		System.out.println("Qual o número de funcionarios?");
		int n = ler.nextInt(); 
		
		for(int i=1; i <=n ; i++) {
			
			ler.nextLine();
			System.out.println("Terceirizado?");
			char resp = ler.nextLine().charAt(0);
			
			if (resp == 'y') {
				
				System.out.print("Nome: ");				
				String nome = ler.nextLine();
				
				System.out.print("Horas: ");
				Integer horas = ler.nextInt();
				
				System.out.print("Valor por hora: ");
				Double valorHora = ler.nextDouble();
				
				System.out.print("Valor adicional por hora: ");
				Double valorAdicional = ler.nextDouble();
				
				Funcionario.add(new Terceirizado(nome, horas, valorHora, valorAdicional));
			} 
			else {
				System.out.print("Nome: ");
				String nome = ler.nextLine();
				
				System.out.print("Horas: ");
				Integer horas = ler.nextInt();
				
				System.out.print("Valor por hora: ");
				Double valorHora = ler.nextDouble();
				
				Funcionario.add(new Funcionario(nome, horas, valorHora));
			}
		}
		
		System.out.println("==============================");
		System.out.println("Pagamentos:");		
		for (Funcionario f : Funcionario) {
			System.out.println(
					f.getNome() + " - $" + f.Pagamento());
		}		
		ler.close();
	}

}
