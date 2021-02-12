package estudodirigido;

public class Veiculo {
		private String placa;
		private int anoFabricacao;
		private String anoModelo;
		private String cor;
		private String chassi;
		private int quilometragem;
		private double valorDiaria;
		
		public Veiculo(String placa, int anoFabricacao, String anoModelo, String cor, String chassi,int quilometragem, double valorDiaria) { 
			super();
			this.placa = placa;
			this.anoFabricacao = anoFabricacao;
			this.anoModelo = anoModelo;
			this.cor = cor;
			this.chassi = chassi;
			this.quilometragem = quilometragem;
			this.valorDiaria = valorDiaria;
		}	
		
		public String getPlaca() {
			return placa;
		}
		
		public void setPlaca(String placa) {
			this.placa = placa;
		}
		
		
		public int getanoFabricacao() {
			return anoFabricacao;
		}
		
		public void setanoFabricacao(int anoFabricacao) {
			this.anoFabricacao = anoFabricacao;
		}
		
		
		public String getAnoModelo() {
			return anoModelo;
		}
		
		public void setAnoModelo(String anoModelo) {
			this.anoModelo = anoModelo;
		}
		
		public String getCor() {
			return cor;
		}
		
		public void setCor(String cor) {
			this.cor = cor;
		}
		
		public String getChassi() {
			return chassi;
		}
		
		public void setChassi(String chassi) {
			this.chassi = chassi;
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
		
}