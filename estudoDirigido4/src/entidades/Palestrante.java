package entidades;

public class Palestrante extends Pessoa {

	private String curriculo;
	private Curso curso;
	
	public Palestrante() {
	}
	
	public Palestrante(String nome, String endereco, String email, String celular , String curso) {
		super(nome, endereco, email, celular);
		this.curriculo = curso;
	}
	
	public String getCurriculo() { 
		return curriculo; 
	}
	public void setCurriculo(String Curso) { 
		this.curriculo = curriculo; 
	}
	
	public Curso getCurso() { 
		return curso; 
	}
		
	public void setCurso(Curso Curso) {
		this.curriculo = curriculo;		
	}
	
	@Override
	public String toString() {
		return String.format("Palestrante: " + this.getNome()
				+ ", Endereço: " + this.getEndereco()
				+ ", Email: " + this.getEmail()
				+ ", Celular: " + this.getCelular()
				+ ", Curriculo: " + this.getCurriculo());
	}
}