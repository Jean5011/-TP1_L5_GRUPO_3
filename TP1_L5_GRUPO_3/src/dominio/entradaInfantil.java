package dominio;

public class entradaInfantil extends Entrada{
	private static final double costoMayor8 = 500;
	private static final double costoMenor8 = 250;
	
	private boolean souvenir;
	private int edad;
	
	
	
	public entradaInfantil(String nombreShow, String fecha, String horario, int duracionAprox, boolean souvenir, int edad) {
		super();
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
		return "entradaInfantil [souvenir=" + souvenir + "]";
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
