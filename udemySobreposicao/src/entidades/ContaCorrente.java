package entidades;

public class ContaCorrente extends Conta {
	
	private Double limiteEmprestimo;
	
	public ContaCorrente() {
		super();
	}

	public ContaCorrente(Integer numero, String titular, Double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
	
	//Checa se emprestimo está dentro do limite
	public void limite(double valor) {
		if (valor <= limiteEmprestimo) {
			saldo += valor - 10.0;
		}
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		saldo -= 2.0;
	}
	
}
