package entidades;

public class Quarto {
	private int codigo;
	private int tipoQuarto;
	private int numeroCamas; 
	private int tipoCama;
	private boolean reservado;
	
	//
	public boolean getReservaQuarto(){
		return reservado;
	}
	
	//Faz a reserva
	public void setReservaQuarto(int codigoQuarto){
		this.reservado = true;
	}
	
	 
	
	
}