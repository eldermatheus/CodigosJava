package poo;

import java.util.Random;

public class Carro {
	//Atributos
	String cor; 
	int ano; 	
	
	// Métodos
	void ligar() {
		System.out.println("Motor ligado!!!");
	}
	void desligar() {
		System.out.println("Motor desligado!!!");
	}
	void acelerar() {
		System.out.println("Vruuummm...");
	}		
	
	//Construtor 1
	public Carro() {
		Random gerador = new Random();
		int chassi = gerador.nextInt(1000);
		System.out.println("Chassi: " + chassi);
	}
	
	//Construtor 2
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}	
}