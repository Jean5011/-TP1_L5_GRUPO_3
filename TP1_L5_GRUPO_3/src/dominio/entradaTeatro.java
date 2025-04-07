package dominio;

import java.util.ArrayList;
import java.util.Arrays;

public class entradaTeatro extends Entrada implements ICosto{
	private static final double costo = 1350.50;
	
	public static final String Drama ="Drama";
	public static final String Teatro = "Teatro";
	public static final String Comedia = "Comedia";
	
	private String genero;
	private String[] actoresPrincipales;
	
	public entradaTeatro(String nombreShow, String fecha, String horario, int duracionAprox, String genero,
			String[] actoresPrincipales) {
		super(nombreShow, fecha, horario, duracionAprox);
		this.genero = genero;
		this.actoresPrincipales = actoresPrincipales;
	}

	public entradaTeatro() {};

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String[] getActoresPrincipales() {
		return actoresPrincipales;
	}

	public void setActoresPrincipales(String[] actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}

	@Override
	public String toString() {
		return "ID Entrada: " + getIdEntrada() + ", Show: " + getNombreShow() + ", Fecha: " + getFecha() + ", Horario: " + getHorario() + ", Duracion: " + getDuracionAprox() +
				" Genero: " + genero + ", Actores Principales: " + Arrays.toString(actoresPrincipales) + " Costo: "+ Sacar_Costo();
	}

	@Override
	public double Sacar_Costo() {
		return costo;
	}



}
