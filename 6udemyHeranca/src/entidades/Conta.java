package entidades;

public class Conta {
	private Integer numero;
	private String titular;
	protected double saldo;
	
	public Conta() {
		
	}

	public Conta(Integer numero, String titular, double saldo) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//saca e desconta 5 de taxa
	public void sacar(double valor) {
		saldo -= valor + 5.0;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	
	
}
