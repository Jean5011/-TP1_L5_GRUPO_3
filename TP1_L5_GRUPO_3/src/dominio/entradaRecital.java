package dominio;

import java.util.ArrayList;
import java.util.Arrays;

public class entradaRecital extends Entrada implements ICosto{
	private static final int costoVip = 1500;
	private static final int costoGeneral = 800;
	
	public static final String Rock = "Rock";
	public static final String HeavyMetal = "Heavy metal";
	public static final String Reggaeton = "reggaeton";
	public static final String Trap = "Trap";
	public static final String Latinos = "Latinos";
	public static final String Pop = "Pop";
	
	private String nombreBanda ;
	private String genero;
	private String[] bandaSoporte;
	private boolean esVip;
	
	public entradaRecital(String nombreShow, String fecha, String horario, int duracionAprox, String nombreBanda, String genero, String[] bandaSoporte, Boolean esVip) {
		super(nombreShow, fecha, horario, duracionAprox);
		this.nombreBanda = nombreBanda;
		this.genero = genero;
		this.bandaSoporte = bandaSoporte;
		this.esVip = esVip;
	}
	
	public entradaRecital() {}

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

	public String[] getBandaSoporte() {
		return bandaSoporte;
	}

	public void setBandaSoporte(String[] bandaSoporte) {
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
		return "ID Entrada: " + getIdEntrada() + ", Show: " + getNombreShow() + ", Fecha: " + getFecha() + ", Horario: " + getHorario() + ", Duracion: " + getDuracionAprox() +
				" Banda: " + nombreBanda + ", Genero: " + genero + ", Bandas de Soporte: " + Arrays.toString(bandaSoporte)
				+ ", VIP: " + esVip + " Costo: "+ Sacar_Costo();
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
}
