package entidades;

public class Professor extends Pessoa{
	
	private String area;
	private int cargaHoraria; 
	
	public Professor(String cpf, String matricula, String nome,	String telefone, String email, String area, int cargaHoraria) {
		super(cpf,matricula,nome,telefone,email);
		this.area = area;
		this.cargaHoraria = cargaHoraria;
	}
	
	
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}



	public void Ensinar() {
		System.out.println("Ensinar...");
	}
	public void Pesquisar() {
		System.out.println("Pesquisar...");
	}
	
}
	
	
	