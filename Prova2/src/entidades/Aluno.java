package entidades;

public class Aluno extends Pessoa{
	
	private Integer matriculaAcademica;

	public Aluno() {		
	}
	
	public Aluno(Integer cpf, String nome, String endereco, Integer celular, String email, String loginUsuario, String loginSenha, Integer matriculaAcademica) {
		super(cpf, nome, endereco, celular, email, loginUsuario, loginSenha);
		this.matriculaAcademica = matriculaAcademica;
	}

	public Integer getMatriculaAcademica() {
		return matriculaAcademica;
	}

	public void setMatriculaAcademica(Integer matriculaAcademica) {
		this.matriculaAcademica = matriculaAcademica;
	}
	
	
	
	
}
