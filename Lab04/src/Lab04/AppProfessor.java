package Lab04;

public class AppProfessor {

	public static void main(String[] args) {
		Professor professor1 = new Professor(1324,"Elder",100.00);
	
		
		System.out.println(professor1.getMatricula() + " - " + professor1.getNome() +" - " 
		+ professor1.getCargaHoraria() + " - "+ professor1.getsalario());
		
	
	}
}

