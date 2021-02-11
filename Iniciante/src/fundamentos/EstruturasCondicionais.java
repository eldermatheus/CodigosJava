package fundamentos;

public class EstruturasCondicionais {
	public static void main(String[] args) {

		// Uso do if else
		String resposta = "Homem";
		resposta = resposta.toLowerCase();
		int idade = 17;

		if (resposta == "homem" && idade >= 18) {
			System.out.println("Alistamento Obrigatório.");
		} else

		if (resposta == "homem" && idade < 18) {
			System.out.println("Alistamento fora da idade.");
		} else
			System.out.println("Livre do Alistamento.");
	}
}