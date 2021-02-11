package poo;

public class Ferrari {

	public static void main(String[] args) {
		Carro ferrari = new Carro();
		
		ferrari.cor = "Vermelha";
		ferrari.ano = 2020;
		System.out.println("Cor:" + ferrari.cor);
		System.out.println("Ano:" + ferrari.ano);
		System.out.println("");
		
		ferrari.ligar();
		ferrari.acelerar();
	}
}