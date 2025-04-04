package dominio;

import java.util.ArrayList;

public class entradaTeatro extends Entrada{
	private static final double costo = 1350.50;
	
	private String genero;
	private ArrayList<String> actoresPrincipales;
	
	public entradaTeatro(String nombreShow, String fecha, String horario, int duracionAprox, int costo, String genero,
			ArrayList<String> actoresPrincipales) {
		super();
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

	public ArrayList<String> getActoresPrincipales() {
		return actoresPrincipales;
	}

	public void setActoresPrincipales(ArrayList<String> actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}

	@Override
	public String toString() {
		return "entradaTeatro [genero=" + genero + ", actoresPrincipales=" + actoresPrincipales + "]";
	}

	@Override
	public double Sacar_Costo() {
		return costo;
	}

}
