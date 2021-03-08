package aplicacao;

import java.util.Scanner;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int qtde; 
		
		System.out.println("Entre com os dados do produto:");
		System.out.println("Nome: ");
		String nome = ler.nextLine();
		System.out.println("Preco: ");
		double preco = ler.nextDouble();
		System.out.println("Quantidade em estoque: ");
		int quantidade = ler.nextInt();
		
		Produto produto = new Produto(nome, preco, quantidade);
		
		//Alterações para 
		produto.setNome("Computador");
		produto.setPreco(2800.00);
		System.out.println("Os dados atualizados são: "+ produto.getNome() + " " + produto.getPreco());
		
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