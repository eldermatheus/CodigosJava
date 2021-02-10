package Lab04;

public class Professor {
	private Integer matricula;
	private String nome;
	public Integer cargaHoraria;
	public Double salario;
	
	
	public Professor(Integer matricula, String nome, Integer cargaHoraria, Double salarioHora) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cargaHoraria = cargaHoraria;
		this.salario = salarioHora *  cargaHoraria;
	}
	
	public Professor(Integer matricula, String nome, Double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	
	//get/set matrícula
	public Integer getMatricula() {
		return matricula;
	}
	
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	
	//get/set nome
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//get/set cargaHoraria
	public Integer getCargaHoraria() {
		return cargaHoraria;
	}
	
	public void setCargaHoraria(Integer cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	
	//get/set 
	public Double getsalario() {
		return salario;
	}
	
	public void setsalario(Double salario) {
		this.salario = salario;
	}
	
}
