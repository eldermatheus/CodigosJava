package fundamentos;
import java.util.Scanner;

public class ExercícioLacoWhile {
	public static void main(String[] args) {
					
		Scanner ler = new Scanner(System.in);
		int numero = ler.nextInt();
		int soma = 0; 
		
		while (numero != 0) {
			soma = soma + numero;
			numero = ler.nextInt();					
		}
		System.out.println(soma);
		
		ler.close();
	}
}
