package servicos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

import org.apache.commons.codec.binary.Base64;

import entidades.Professor;
import entidades.Aluno;

public class CriptoDecripto {

	public static void CifrarTexto(Scanner ler) {
		System.out.println("Qual a mensagem a ser criptografada?");
		String mensagemPura = ler.nextLine();
		String mensagemCriptografada = Base64.encodeBase64String(mensagemPura.getBytes());
		BufferedWriter pw;
		
		try {
			//Cria o arquivo 
			File arquivo = new File("C:\\Users\\elder\\Desktop\\Arquivo.txt");
			arquivo.createNewFile();
			FileWriter fw = new FileWriter(arquivo, true);
	        BufferedWriter bw = new BufferedWriter(fw);
	        
	        //Escreve mensagem no arquivo
			pw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("C:\\Users\\elder\\Desktop\\Arquivo.txt"),"UTF8"));
			pw.write(mensagemCriptografada);
			pw.flush();
			pw.close();
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public static void DecifrarTexto(Scanner ler) {
		try {
		    //Leitura do caminho do arquivo  
			FileReader arq = new FileReader("C:\\Users\\elder\\Desktop\\Arquivo.txt");
		    BufferedReader lerArquivo = new BufferedReader(arq);

		    //Leitura do conteúdo
		    String linha = lerArquivo.readLine();
		    
		    //Tratamento de linha nulla
		    if (linha.equals(null)) {
		    }
		    
		    //Validar as chaves de recuperacao
		    System.out.println("Qual a chave de recuperação do aluno?");
		    String chaveAlunoTeste = ler.nextLine();		    
		    
		    System.out.println("Qual a chave de recuperação do professor?");
		    String chaveProfessorTeste = ler.nextLine();
		    
		    		    		   		    
		    if (Professor.getChaveRecuperacaoProfessor().equals(chaveProfessorTeste) && Aluno.getChaveRecuperacaoAluno().equals(chaveAlunoTeste)) {
			    
		    	byte [] primeiraCriptografia = Base64.decodeBase64(linha);
			    String primeiraMsgDecodificacao = new String(primeiraCriptografia);			    
			    //
			    byte [] segundaCriptografia = Base64.decodeBase64(primeiraMsgDecodificacao);
			    String mensagemFinalDecodificada = new String(segundaCriptografia);			    
				
			    primeiraMsgDecodificacao
			    System.out.println(mensagemFinalDecodificada);		
		    	
		    } else 		    	
		    	System.out.println("As chaves de recuperação estão erradas!");
		      
		} catch (IOException e) {
	        System.err.printf("Erro na abertura do arquivo!");
	    } catch (NullPointerException e) {
	        System.err.printf("Arquivo vazio!");		
		}
	}		
}

