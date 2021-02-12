package exercicios;

import java.util.Scanner;

public class ExcercicioFuncao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero1 = ler.nextInt();
		int numero2 = ler.nextInt();
		int numero3 = ler.nextInt();

		// Função que retorna o maior número
		int maior = max(numero1, numero2, numero3);

		// Função que escreve o resultado
		mostraResultado(maior);

		ler.close();
	}

	public static int max(int numero1, int numero2, int numero3) {
		int auxiliar;
		if (numero1 >= numero2 && numero1 >= numero3) {
			auxiliar = numero1;
		} else

		if (numero2 >= numero1 && numero2 >= numero3) {
			auxiliar = numero2;
		} else {
			auxiliar = numero3;
		}
		return auxiliar;
	}

	public static void mostraResultado(int valor) {
		System.out.println("Maior = " + valor);
	}

}
