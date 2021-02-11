package fundamentos;

import java.util.Scanner;

public class entradaDeDados {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int nota1;

		System.out.println("Informe sua primeira nota: ");
		nota1 = ler.nextInt();

		System.out.println("sua nota:" + nota1);

		ler.close();
	}

}