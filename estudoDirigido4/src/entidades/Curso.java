package entidades;

public class Curso {

	private String titulo;
	private String categoria;
	private int duracao;
	private int anoProducao;
	private Diretor diretor;
	private Palestrante palestrante;


	public Curso() {
	}
	
	public Curso(String titulo,String categoria,int duracao,int anoProducao,Diretor diretor,Palestrante palestrante) {
		this.titulo = titulo;
		this.categoria = categoria;
		this.duracao= duracao;
		this.anoProducao = anoProducao;
		this.diretor = diretor;
		this.palestrante = palestrante;
	}
	
	public String getTitulo() {
		return titulo; 
	}
	public void setTitulo(String titulo) { 
		this.titulo = titulo;
	}
	public String getCategoria() {
		return categoria; 
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria; 
	}
	public int getDuracao() { 
		return duracao;
	}
	public void setDuracao(int duracao) { 
		this.duracao = duracao; 
	}
	public int getAnoProducao() {
		return anoProducao;
	}
	public void setAnoProducao(int anoProducao) {
		this.anoProducao = anoProducao;
	}
	public Diretor getDiretor() { 
		return diretor; 
	}
	public Palestrante getPalestrante() {
		return palestrante;
	}	
}