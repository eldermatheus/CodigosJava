package entidades;

public class Aluno extends Pessoa{
	
	private String curso;
	private int complementoHoras;
	private int estagioHoras;
	private boolean projetoConclusao;
	
	public Aluno(String cpf, String matricula, String nome,	String telefone, String email, String curso) {
		super(cpf,matricula,nome,telefone,email);
		this.complementoHoras = complementoHoras;
		this.estagioHoras = estagioHoras;
		this.projetoConclusao = projetoConclusao;
		this.curso = curso;
	}
	
	public void Estudar() {
		System.out.println("Estudar...");
	}
	public void Cursar() {
		System.out.println("Cursar...");
	}
	public void Formar() {
		System.out.println("Formar...");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
