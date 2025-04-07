package dominio;

public class entradaInfantil extends Entrada implements ICosto{
	private static final double costoMayor8 = 500;
	private static final double costoMenor8 = 250;
	
	private boolean souvenir;
	private int edad;
	
	
	
	public entradaInfantil(String nombreShow, String fecha, String horario, int duracionAprox, boolean souvenir, int edad) {
		super(nombreShow, fecha, horario, duracionAprox);
		this.souvenir = souvenir;
		this.edad = edad;
	}

	public entradaInfantil() {};

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isSouvenir() {
		return souvenir;
	}

	public void setSouvenir(boolean souvenir) {
		this.souvenir = souvenir;
	}

	
	@Override
	public String toString() {
		if(souvenir) {
			return "ID Entrada: " + getIdEntrada() + ", Show: " + getNombreShow() + ", Fecha: " + getFecha() + ", Horario: " + getHorario() + ", Duracion: " + getDuracionAprox() + 
					" Souvenir: Si" + " Costo: "+ Sacar_Costo(); 
		}else {
			return "ID Entrada: " + getIdEntrada() + ", Show: " + getNombreShow() + ", Fecha: " + getFecha() + ", Horario: " + getHorario() + ", Duracion: " + getDuracionAprox() + 
					" Souvenir: No" + " Costo: "+ Sacar_Costo();
		}
	}

	@Override
	public double Sacar_Costo() {
		if(edad>=8) {
			return costoMayor8;
		} else {
			return costoMenor8;
		}
	}

}
