package poo;

public class Fusca {

	public static void main(String[] args) {
		Carro fusca = new Carro();
		
		fusca.cor = "Vermelho";
		fusca.ano = 2020;
		System.out.println("Cor:" + fusca.cor);
		System.out.println("Ano:" + fusca.ano);
		System.out.println("");
		
		fusca.ligar();
		fusca.acelerar();
	}
}