package estudodirigido;

public class Moto extends Veiculo {
	private String tipoMoto;
	private String tipoCorrente;
	
	public Moto(String placa, int anoFabricacao, String anoModelo, String cor, String chassi,int quilometragem, double valorDiaria) {
		super(placa, anoFabricacao, anoModelo, cor, chassi, quilometragem, valorDiaria);
	}
	public String getTipoMoto() {
		return tipoMoto;
	}
	
	public void setTipoMoto(String tipoMoto) {
		this.tipoMoto = tipoMoto;
	}	
	
	public String getTipoCorrente() {
		return tipoCorrente;
	}
	
	public void setTipoCorrente(String tipoCorrente) {
		this.tipoCorrente = tipoCorrente;
	}
			
}
