package dominio;

public class recitales extends  Entrada{
	private String NombreBanda ;
	private String Genero;
	private String TipoCosto; /// vip = $1500 o general $800
	
	
	
	public recitales(String nombreShow, String fecha, String horario, int duracionAprox, String nombreBanda,
			String genero, String tipoCosto) {
		super(nombreShow, fecha, horario, duracionAprox, Sacar_Costo(tipoCosto));
		NombreBanda = nombreBanda;
		Genero = genero;
		TipoCosto = tipoCosto;
	}

	public String getNombreBanda() {
		return NombreBanda;
	}

	public void setNombreBanda(String nombreBanda) {
		NombreBanda = nombreBanda;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public String getTipoCosto() {
		return TipoCosto;
	}

	public void setTipoCosto(String tipoCosto) {
		this.TipoCosto = tipoCosto;
	}

	
	public static int Sacar_Costo(String entrada) 
	{
		if(entrada.toUpperCase().equals("VIP")) {
			return 1500;
		}
		else if(entrada.toUpperCase().equals("GENERAL")) {
			return 800;
		}
		return  0;
	}
	
	
	@Override
	public String toString() {
		return super.toString() + " NombreBanda=" + NombreBanda + ", Genero=" + Genero + ", Tipo Costo=" + TipoCosto;
	}
	
}
