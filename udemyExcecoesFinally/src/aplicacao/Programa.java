package aplicacao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Programa {

	public static void main(String[] args) {
		// try catch com Finally
		
		File file = new File("C:\\Users\\USUARIO\\Desktop\\in.txt");
		Scanner ler = null;
		
		try {
			ler = new Scanner(file);
			while (ler.hasNextLine()) {
				System.out.println(ler.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro ao abrir o arquivo: " + e.getMessage());
		}
		finally {
			if (ler != null) {
				ler.close();
			}
			System.out.println("Finally block executed");
		}
	}
}
