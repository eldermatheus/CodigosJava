package servicos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.commons.codec.binary.Base64;

public class CriptoDecripto {

	public void Criptografa() {

		String helloWorld = "Teste";

		helloWorld = Base64.encodeBase64String(helloWorld.getBytes());

		PrintWriter pw;

		try {
			pw = new PrintWriter(new FileOutputStream("C:\\Users\\USUARIO\\Desktop\\Arquivo.txt"));
			pw.write(helloWorld);
			pw.flush();
			pw.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void Descriptografa() throws Throwable {
		StringBuilder sb = new StringBuilder();
		String conteudo = new String();
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\USUARIO\\Desktop\\Arquivo.txt"));
		
		while(br.ready()) {
		
		sb.append(br.readLine());
		sb.append("\r\n");
		}
		conteudo = sb.toString();
		br.close();
		
		System.out.println("O conteudo do arquivo é: " + conteudo);
		
	}
	
	
}
