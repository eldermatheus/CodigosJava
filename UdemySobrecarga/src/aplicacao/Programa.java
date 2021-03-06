package aplicacao;

import java.util.Scanner;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int qtde; 
		
		System.out.println("Entre com os dados do produto:");
		System.out.print("Nome: ");
		String nome = ler.nextLine();
		System.out.print("Preco: ");
		double preco = ler.nextDouble();		
		
		Produto produto = new Produto(nome, preco);
		
		System.out.println("Dados dos produtos: " + produto);
		
		//Adição de produtos
		System.out.println();
		System.out.println("Insira a quantidade de produtos adicionados:");
		qtde = ler.nextInt();		
		produto.adicionarProduto(qtde);
		
		//Remoção de produtos
		System.out.println("Insira a quantidade de produtos removidos:");
		qtde = ler.nextInt();
		produto.removerProduto(qtde);
		
		//Exibe o saldo
		System.out.println();
		System.out.println("Updated data: " + produto);
		
		ler.close();
	}
}