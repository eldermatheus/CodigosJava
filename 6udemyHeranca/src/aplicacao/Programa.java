package aplicacao;

import entidades.Conta;
import entidades.ContaPremium;
import entidades.ContaPoupanca;

public class Programa {
	public static void main(String[] args) {
	
		Conta acc = new Conta(1, "Elder Matheus", 1000);
		ContaPremium bacc = new ContaPremium(2,"Teste", 2000, 250);
		
		//Exemplos de UPCASTING		
		Conta acc1 = bacc;
		Conta acc2 = new ContaPremium(3,"Maria",5000,300);
		Conta acc3 = new ContaPoupanca(4,"Joao",1700,200);
		
		//Exemplos de DOWNCASTING
		ContaPremium acc4 = (ContaPremium) acc2;
			acc4.emprestimo(100.0);

		// ContaPremium acc5 = (ContaPremium)acc3;
		if (acc3 instanceof ContaPremium) {
			ContaPremium acc5 = (ContaPremium)acc3;
			acc5.emprestimo(200.0);
			System.out.println("Empréstimo");
		}
		
		if(acc3 instanceof ContaPoupanca) {
			ContaPoupanca acc5 = (ContaPoupanca)acc3;
			acc5.atualizarSaldo();
			System.out.println("Atualizado!");
		}
	}
}
