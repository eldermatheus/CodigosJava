package estudodirigido;

import java.util.Scanner;

public class AppLocadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int resp = 1;
				
		while (resp != 9) {
			System.out.println("1 - Incluir um Veículo");
			System.out.println("2 - Incluir uma Moto");
			System.out.println("3 - Incluir um Carro");
			System.out.println("4 - Incluir um Ônibus");
			System.out.println("5 - Incluir veículos cadastrados");
			System.out.println("9 - Sair");
			resp = ler.nextInt();
		}
		ler.close();
	}	
}
