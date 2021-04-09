package entidades;

public class Aluno extends Pessoa{
	
	private Integer matriculaAcademica;

	public Aluno() {		
	}
	
	public Aluno(String cpf, String nome, String endereco, Integer celular, String email, String loginUsuario, String loginSenha, Integer matriculaAcademica, String chaveRecuperacao) {
		super(cpf, nome, endereco, celular, email, loginUsuario, loginSenha, chaveRecuperacao);
		this.matriculaAcademica = matriculaAcademica;
	}

	public Integer getMatriculaAcademica() {
		return matriculaAcademica;
	}

	public void setMatriculaAcademica(Integer matriculaAcademica) {
		this.matriculaAcademica = matriculaAcademica;
	}
}
