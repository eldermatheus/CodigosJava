package entidades;

public class ContaPremium extends Conta {
	private Double limiteEmprestimo;

	public ContaPremium() {
		super();
	}

	public ContaPremium(Integer numero, String titular, double saldo, Double limiteEmprestimo) {
		super(numero, titular, saldo);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double valor) {
		if (valor <= limiteEmprestimo) {
			saldo += valor - 10.0;
		}
	}
}