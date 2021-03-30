package entidades;

public class Terceirizado extends Funcionario {
	
	private Double valorAdicional ;

	public Terceirizado() {		
	}
	
	public Terceirizado(String nome, Integer horas, Double valorHora, Double valorAdicional) {
		super(nome, horas, valorHora);
		this.valorAdicional = valorAdicional;
	}

	public Double getValorAdicional() {
		return valorAdicional;
	}

	public void setValorAdicional(Double valorAdicional) {
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double Pagamento() {
		return (super.getValorHora() * super.getHoras()) + (valorAdicional * 1.1);
	}
	
}
