package fundamentos;

public class EstruturasRepeticao {
	public static void main(String[] args) {		
		
		//Uso do "for"
		for(int i=1; i<=10; i++) {
			System.out.println("");			
			for(int j=1; j<=10; j++) 		
				System.out.println(i + " * " + j +" = " + (i*j));
		}
		
		//Uso do "while"
		int contador = 1;
		
		while(contador <= 10) {
			System.out.println("*" + contador);
			contador += 1;
		} 
				
		//Uso do "Do while"
		char resposta = 'N';
		
		do { System.out.println("Deseja jogar novamente?");
		} while (resposta == 'S');
		
		System.out.println("O jogo acabou.");
	}
}