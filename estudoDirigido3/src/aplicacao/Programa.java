package aplicacao;

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Pessoa;
import entidades.Aluno;
import entidades.Professor;

public class Programa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<Pessoa> Pessoa = new ArrayList();				
		int resp = 0;
		while(resp != 9) {
			System.out.println("");
			System.out.println("Digite a sua opção:");
			System.out.println("=======================================");
			System.out.println("|1 - Incluir um aluno|");
			System.out.println("|2 - Alterar um aluno|");
			System.out.println("|3 - Excluir um aluno|");	
			System.out.println("|4 - Incluir um professor|");
			System.out.println("|5 - Listar pessoas cadastradas|");
			System.out.println("|9 - Sair			      |");
			System.out.println("=======================================");
			resp = ler.nextInt();
				if (resp == 1) {
					System.out.print("matrícula: ");
					ler.nextLine();
					String matricula = ler.nextLine();
					System.out.print("nome: ");
					String nome = ler.nextLine();
					System.out.print("cpf: ");
					String cpf = ler.nextLine();
					System.out.print("email: ");
					String email = ler.nextLine();
					System.out.print("telefone: ");
					String telefone = ler.nextLine();
					System.out.print("Curso: 1=Ciencia da Computacao 2=Logistica");
					int escolha = ler.nextInt();
					
				}
				else if (resp == 2) {
					System.out.print("Informe a matrícula: ");
					ler.nextLine();
					String matricula = ler.nextLine();
					for (Pessoa p : Pessoa) {
						if (p != null && matricula.equals(p.getMatricula())) {
							System.out.println("O que deseja alterar?");
							System.out.println("1 - Nome; 2 - CPF; 3 - e-mail; 4 - Telefone;");
							int alt = ler.nextInt();
							String novo;
							switch (alt) {
							case 1:
								System.out.print("Novo nome: ");
								ler.nextLine();
								novo = ler.nextLine();
								p.setNome(novo);
								break;
							case 2:
								System.out.print("Novo CPF: ");
								ler.nextLine();
								novo = ler.nextLine();
								p.setCpf(novo);
								break;
							case 3:
								System.out.print("Novo e-mail: ");
								ler.nextLine();
								novo = ler.nextLine();
								p.setEmail(novo);
								break;
							case 4:
								System.out.print("Novo telefone: ");
								ler.nextLine();
								novo = ler.nextLine();
								p.setTelefone(novo);
								break;
							default:
								System.out.println("Insira uma opção válida!");	
							}
						}
					}
				}
				else if (resp == 3) {
				
				}
				
				else if (resp == 4) {
					System.out.print("Nº matrícula: ");
					ler.nextLine();
					String matricula = ler.nextLine();
					System.out.print("Nome: ");
					String nome = ler.nextLine();
					System.out.print("CPF: ");
					String cpf = ler.nextLine();
					System.out.print("E-mail: ");
					String email = ler.nextLine();
					System.out.print("Telefone: ");
					String telefone = ler.nextLine();
					System.out.print("Carga Horária(Semanal): ");
					int cargaHoraria = ler.nextInt();
					System.out.print("Área de formação: ");
					ler.nextLine();
					String areaFormacao = ler.nextLine();
				}
				else if (resp == 5) {
					
				}
				else {
					System.out.println("Não existe essa opção!");
				}
			}
		ler.close();
	}
	

}