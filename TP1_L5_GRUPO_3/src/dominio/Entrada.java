package dominio;

public abstract class Entrada {
	private int idEntrada;
	private String nombreShow;
	private String fecha;
	private String horario;
	private int duracionAprox;
	
	private static int cont=0;
	
	public Entrada(String nombreShow, String fecha, String horario, int duracionAprox) {
		cont++;
		this.idEntrada = cont;
		this.nombreShow = nombreShow;
		this.fecha = fecha;
		this.horario = horario;
		this.duracionAprox = duracionAprox;
	}
	
	public Entrada() {
		cont++;
	}
	
	public abstract double Sacar_Costo();

	public int getIdEntrada() {
		return idEntrada;
	}

	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public String getNombreShow() {
		return nombreShow;
	}

	public void setNombreShow(String nombreShow) {
		this.nombreShow = nombreShow;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public int getDuracionAprox() {
		return duracionAprox;
	}

	public void setDuracionAprox(int duracionAprox) {
		this.duracionAprox = duracionAprox;
	}

	@Override
	public String toString() {
		return "Entrada: idEntrada=" + idEntrada + ", nombreShow=" + nombreShow + ", fecha=" + fecha + ", horario="
				+ horario + ", duracionAprox=" + duracionAprox;
	}
	
}
