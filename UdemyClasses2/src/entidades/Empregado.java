package entidades;

public class Empregado {
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	public double salarioLiquido() {
		return salarioBruto - imposto;
	}
	
	public void aumentarSalario(double porcentagem) {
		salarioBruto =+ salarioBruto + (salarioBruto*porcentagem/100);  
	} 
	
	public String toString(){
		return  nome
				+ ", R$ "
				+ salarioLiquido(); 
	}
}