package fundamentos;

import java.util.Scanner;

public class ExercicioLacoIf {
	
	public static void main(String[] args) {
		
		int salarioHora = 50;  
		double horasEsperadas = 176.00;
		
		Scanner ler = new Scanner(System.in);
		System.out.println("Quais suas horas semanais?");
		int horasTrabalhadasSemana = ler.nextInt();
		
		double salarioTotal = salarioHora * horasTrabalhadasSemana;
		double cargaHorariaMes = horasTrabalhadasSemana * 4.5;
		double horasDevendo = horasEsperadas - cargaHorariaMes;
		
		ler.close();
		
		
		if (cargaHorariaMes >= horasEsperadas) {
			System.out.println("Sua carga horária foi: "+cargaHorariaMes+" horas"
					+ " e seu salário foi de: R$"+salarioTotal+". Você está regular.");
		}
		
		else {
			System.out.println("Sua carga horária foi: "+cargaHorariaMes+" horas."
					+ " e seu salário foi de: R$"+salarioTotal);
			System.out.println(". Você está devendo:"+horasDevendo+" horas.");
		}
	}
}