package inicio;

import java.util.Scanner;

public class lacoIfElse {
	private static Scanner scanner;

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Informe sua primeira nota: ");
		float nota1 = scanner.nextFloat();
		
		System.out.println("sua nota:"+nota1);
	}

}