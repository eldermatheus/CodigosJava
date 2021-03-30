package entidades;

public class ContaPoupanca extends Conta{
	
	private Double taxaJuros;
	
	public ContaPoupanca() {
		super();
	}	
	
	public ContaPoupanca(Integer numero, String titular, Double saldo, Double taxaJuros) {
		super(numero, titular, saldo);
		this.taxaJuros = taxaJuros;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	
	public void atualizarSaldo() {
		saldo += saldo * taxaJuros;
	}
	
	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

}
