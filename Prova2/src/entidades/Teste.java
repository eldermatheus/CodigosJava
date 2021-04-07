package testes;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

import testes.Pessoa;


public class teste {
	
	public static void main(String[] args) throws ParseException {
			Scanner ler = new Scanner(System.in);
			
			ArrayList<Pessoa> Pessoa = new ArrayList();		
			
			
			Pessoa pessoa = new Pessoa(123, "elder");
			
			
			String alteracao;
			Integer alteracaoInt;
			
			System.out.println("Escolha o dado que deseja alterar: ");
			System.out.println("CPF; nome; endereco; celular; email; login; senha; matricula");
			
			String escolha = ler.nextLine().toLowerCase();
			
			
			
			
			if(escolha.equals("nome") ) { System.out.println("Dado alterado: nome");
			
				/*for (Pessoa p : Pessoa) {
					System.out.println(
						"Nome: " + p.getNome() +						
						"\rCPF" + p.getCpf());
				} */										
			}
			
			if(escolha.equals("cpf") ) { System.out.println("Dado alterado: cpf");
			}
			/*if(escolha == "cpf") {
				System.out.print("Novo CPF?: ");
				alteracaoInt = ler.nextInt();
				System.out.print(alteracaoInt);
				ler.nextLine();
			}
				
			if(escolha == "nome") {
				System.out.print("Novo nome?: ");
				alteracao = ler.nextLine();
				System.out.print(alteracao);
			}*/
			
			ler.close();
		}	
	}




package testes;

public class Pessoa {
	private Integer cpf;	
	private String nome;
	
	public Pessoa() {		
	}
	
	public Pessoa(Integer cpf, String nome) {
		
		this.cpf = cpf;
		this.nome = nome;
	}
	public Integer getCpf() {
		return cpf;
	}
	public void setCpf(Integer cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
