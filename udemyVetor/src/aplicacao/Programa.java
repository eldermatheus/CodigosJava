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
		System.out.printf("AVERAGE HEIGHT: %.2f%n", media);
		ler.close();
	}
}