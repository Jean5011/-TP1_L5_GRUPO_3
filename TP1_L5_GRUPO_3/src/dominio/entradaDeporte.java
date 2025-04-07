package dominio;

public class entradaDeporte extends Entrada implements ICosto{
	private static final double costoFutbol = 300;
	private static final double costoRugby = 450;
	private static final double costoHockey = 380;
	private double precioConRegargo = 0;
	
	private String deporte;
	private boolean esInternacional;

	public entradaDeporte(String nombreShow, String fecha, String horario, int duracionAprox, String deporte,
			boolean esInternacional) {
		super(nombreShow, fecha, horario, duracionAprox);
		this.deporte = deporte;
		this.esInternacional = esInternacional;
	}
	

	public entradaDeporte() {}


	public String getDeporte() {
		return deporte;
	}

	public void setDeporte(String deporte) {
		this.deporte = deporte;
	}

	public boolean isEsInternacional() {
		return esInternacional;
	}

	public void setEsInternacional(boolean esInternacional) {
		this.esInternacional = esInternacional;
	}

	@Override
	public double Sacar_Costo() {
		switch (deporte) {
		case "Futbol":
			if(esInternacional) {
				return precioConRegargo = costoFutbol * 0.30;
			}
		break;
		case "Rugby":
			if(esInternacional) {
				return precioConRegargo = costoRugby * 0.30;
			}
			break;
			
		case "Hockey":
			if(esInternacional) {
				return precioConRegargo = costoHockey * 0.30;
			}
			break;
		}
		return 0;
	}

	@Override
	public String toString() {
		return "ID Entrada: " + getIdEntrada() + ", Show: " + getNombreShow() + ", Fecha: " + getFecha() + ", Horario: " + getHorario() + ", Duracion: " + getDuracionAprox() + 
				" Deporte: " + deporte + " Costo: "+ Sacar_Costo();
	}

}
