package entidades;

public class Aluno extends Pessoa{
	
	private Integer matriculaAcademica;
	private static String chaveRecuperacaoAluno;

	public Aluno() {		
	}

	public Aluno(String cpf, String nome, String endereco, Integer celular, String email, String loginUsuario, String loginSenha, Integer matriculaAcademica, String chaveRecuperacaoAluno) {
		super(cpf, nome, endereco, celular, email, loginUsuario, loginSenha);
		this.matriculaAcademica = matriculaAcademica;
		this.chaveRecuperacaoAluno = chaveRecuperacaoAluno;
	}

	public Integer getMatriculaAcademica() {
		return matriculaAcademica;
	}

	public void setMatriculaAcademica(Integer matriculaAcademica) {
		this.matriculaAcademica = matriculaAcademica;
	}
	
	public static String getChaveRecuperacaoAluno() {
		return chaveRecuperacaoAluno;
	}
	
}
