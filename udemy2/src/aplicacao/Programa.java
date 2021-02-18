package aplicacao;

import java.util.Scanner;
import entidades.Empregado;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Empregado empregado = new Empregado();

		//Leitura de dados
		System.out.println("Nome: ");
		empregado.nome = ler.nextLine();
		System.out.println("Salario Bruto: ");
		empregado.salarioBruto = ler.nextDouble();
		System.out.println("Imposto: ");
		empregado.imposto = ler.nextDouble();

		//Exibe dados
		System.out.println();
		System.out.println(empregado);
		
		//Incremento do salário
		double percentual;
		System.out.println("Qual a porcentagem para incrementar?");
		percentual = ler.nextDouble();
		empregado.aumentarSalario(percentual);
		
		//Saída atualizada
		System.out.println();
		System.out.println("Dados atualizados: "+empregado);
		ler.close();
	}
}
