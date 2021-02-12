package estudodirigido;

public class Onibus extends Veiculo {
	private String tipoOnibus;
	private int janelasEmergencia;
	
	public Onibus(String placa, int anoFabricacao, String anoModelo, String cor, String chassi,int quilometragem, double valorDiaria) {
		super(placa, anoFabricacao, anoModelo, cor, chassi, quilometragem, valorDiaria);
	}
	
	public String getTipoOnibus() {
		return tipoOnibus;
	}
	
	public void setTipoOnibus(String tipoOnibus) {
		this.tipoOnibus = tipoOnibus;
	}	
	
	public int getJanelasEmergencia() {
		return janelasEmergencia;
	}
	
	public void setTipoCorrente(int janelasEmergencia) {
		this.janelasEmergencia = janelasEmergencia;
	}
			
}
