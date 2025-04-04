package dominio;

import java.util.ArrayList;

public class entradaRecital extends Entrada{
	private static final int costoVip = 1500;
	private static final int costoGeneral = 800;
	
	private String nombreBanda ;
	private String genero;
	private ArrayList<String> bandaSoporte;
	private boolean esVip;
	
	
	public entradaRecital(String nombreShow, String fecha, String horario, int duracionAprox, int costo,
			String nombreBanda, String genero, ArrayList<String> bandaSoporte, boolean esVip) {
		super();
		this.nombreBanda = nombreBanda;
		this.genero = genero;
		this.bandaSoporte = bandaSoporte;
		this.esVip = esVip;
	}
	
	public entradaRecital() {};

	@Override
	public double Sacar_Costo() {
		if(esVip) {
			return costoVip;
		} else {
			return costoGeneral;
		}
	}

	public String getNombreBanda() {
		return nombreBanda;
	}

	public void setNombreBanda(String nombreBanda) {
		this.nombreBanda = nombreBanda;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public ArrayList<String> getBandaSoporte() {
		return bandaSoporte;
	}

	public void setBandaSoporte(ArrayList<String> bandaSoporte) {
		this.bandaSoporte = bandaSoporte;
	}

	public boolean isEsVip() {
		return esVip;
	}

	public void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}

	@Override
	public String toString() {
		return "entradaRecital [nombreBanda=" + nombreBanda + ", genero=" + genero + ", bandaSoporte=" + bandaSoporte
				+ ", esVip=" + esVip + "]";
	}
	
	
}
