package exercicio;

//Classes aninhadas
class Par {
	private Chave chave; 
	private Valor valor; 

	public Par(Chave chave, Valor valor) { 
		this.chave = chave;
		this.valor = valor;
	}

	static class Chave { 
		private String nome; 
		public Chave(String nome) { 
			this.nome = nome; } 
	} 

	protected static class Valor { 
		private int valor; 
		public Valor(int valor) { 
			this.valor = valor; 
		} 
	}
}

public class Teste {
	public static void main(String[] args) { 
		Par.Chave chave = new Par.Chave("Nota"); 
		Par.Valor valor = new Par.Valor(10); 
		Par par = new Par(chave, valor); 
	} 
}
