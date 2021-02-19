package aplicacao;

import java.util.Scanner;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		Produto produto = new Produto();
		int qtde; 
		
		System.out.println("Entre com os dados do produto:");
		System.out.println("Nome: ");
		produto.nome = ler.nextLine();
		System.out.println("Preco: ");
		produto.preco = ler.nextDouble();
		System.out.println("Quantidade em estoque: ");
		produto.quantidade = ler.nextInt();
		
		//Adição de produtos
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