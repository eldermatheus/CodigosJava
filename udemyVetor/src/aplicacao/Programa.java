package aplicacao;

import java.util.Scanner;

public class Programa {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		double soma = 0.0;
		int n = ler.nextInt();
		
		double[] vect = new double[n];
		for (int i = 0; i < n; i++) {
			vect[i] = ler.nextDouble();
			soma += vect[i];
		}		
		
		double media = soma / n;
		System.out.printf("Preço médio: %.2f%n", media);
		ler.close();
		
		/*Exemplo For Each
		String[] vect = new String[] {"Maria","Bob","Alex"};
		
		for(String obj: vect) {
			System.out.println(obj);
		}
		*/
	}
}