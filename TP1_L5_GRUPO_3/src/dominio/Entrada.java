package dominio;

public abstract class Entrada {
	private int idEntrada;
	private String nombreShow;
	private String fecha;
	private String horario;
	private int duracionAprox;
	private int costo;
	
	private static int cont=0;
	
	public Entrada(String nombreShow, String fecha, String horario, int duracionAprox, int costo) {
		super();
		cont++;
		this.idEntrada = cont;
		this.nombreShow = nombreShow;
		this.fecha = fecha;
		this.horario = horario;
		this.duracionAprox = duracionAprox;
		this.costo = costo;
	}
	
	public Entrada() {
		cont++;
	}

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

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	@Override
	public String toString() {
		return "Entrada [idEntrada=" + idEntrada + ", nombreShow=" + nombreShow + ", fecha=" + fecha + ", horario="
				+ horario + ", duracionAprox=" + duracionAprox + ", costo=" + costo + "]";
	}
	
}
