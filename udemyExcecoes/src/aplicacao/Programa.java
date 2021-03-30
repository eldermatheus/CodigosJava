package aplicacao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		// try catch
		
		Scanner ler = new Scanner(System.in);
		
		try {
			String[] vetor = ler.nextLine().split(" ");
			int posicao = ler.nextInt();
			System.out.println(vetor[posicao]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posicao inválida!");
		}
		catch(InputMismatchException e) {
			System.out.println("Erro de entrada!");
		}
		
		System.out.println("Fim do programa!");		
		
		ler.close();
	}
}
