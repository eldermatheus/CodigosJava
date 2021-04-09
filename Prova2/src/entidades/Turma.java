package entidades;

import java.util.Date;

public class Turma {
		
	private String titulo; 
	private Date dataInicio; 
	private Date dataTermino;
	private String professor;
	private String aluno;
	
	public Turma() {		
	}
	
	public Turma(String titulo, Date dataInicio, Date dataTermino, String professor, String aluno) {		
		this.titulo = titulo;
		this.dataInicio = dataInicio;
		this.dataTermino = dataTermino;
		this.professor = professor;
		this.aluno = aluno;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataTermino() {
		return dataTermino;
	}

	public void setDataTermino(Date dataTermino) {
		this.dataTermino = dataTermino;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public String getAluno() {
		return aluno;
	}

	public void setAluno(String aluno) {
		this.aluno = aluno;
	}

	@Override
	public String toString() {
		return String.format("Título: " + this.getTitulo()
				+ ", Data de início: " + this.getDataInicio()
				+ ", Data de término: " + this.getDataTermino()
				+ ", Professor: " + this.getProfessor()
				+ ", Aluno: " + this.getAluno());
	}	
}
