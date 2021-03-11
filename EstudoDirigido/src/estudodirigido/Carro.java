package estudodirigido;

public class Carro extends Veiculo {
	private String tipoCarro;
	private int portaMalas;
	
	public Carro(String placa, int anoFabricacao, int anoModelo, String cor, String chassi,int quilometragem, double valorDiaria) {
		super(placa, anoFabricacao, anoModelo, cor, chassi, quilometragem, valorDiaria);
	}
	
	public String getTipoCarro() {
		return tipoCarro;
	}
	
	public void setTipoCarro(String tipoCarro) {
		this.tipoCarro = tipoCarro;
	}	
	
	public int getPortaMalas() {
		return portaMalas;
	}
	
	public void setPortaMalas(int portaMalas) {
		this.portaMalas = portaMalas;
	}
			
}
