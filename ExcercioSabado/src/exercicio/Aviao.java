package exercicio;

public class Aviao {
		
		private int anoFabricacao;
		private String cor;
		private int quilometragem;
		private double valorDiaria;
		
		public Aviao() {
		}
		
		public Aviao(int anoFabricacao, String cor, int quilometragem, double valorDiaria) { 
			super();
			this.anoFabricacao = anoFabricacao;
			this.cor = cor;
			this.quilometragem = quilometragem;
			this.valorDiaria = valorDiaria;
		}	
		
		public int getAnoFabricacao() {
			return anoFabricacao;
		}
		
		public void setAnoFabricacao(int anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
		}
				
		public String getCor() {
			return cor;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}
		
		public int getQuilometragem() {
			return quilometragem;
		}
		
		public void setQuilometragem(int quilometragem) {
			this.quilometragem = quilometragem;
		}
		
		public double getValorDiaria() {
			return valorDiaria;
		}
		
		public void setValorDiaria(double valorDiaria) {
			this.valorDiaria = valorDiaria;
		}
				
		public void voar() {
			System.out.println("Levantando voo");
		}
		
		
}