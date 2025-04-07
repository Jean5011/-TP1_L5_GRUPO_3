package dominio;

public class Principal {

	public static void main(String[] args) {
		Entrada eR = new entradaRecital("Lolapalooza", "12/03/2015", "5PM", 2, "SodaStereo", entradaRecital.Rock, new String[] {"Las Pastillas del Abuelo", "Queen"}, false);	
		Entrada eR2 = new entradaRecital("Lolapalooza", "13/03/2015", "3PM", 2, "The Weeknd", entradaRecital.Pop, new String[] {"Sabrina Carpenter"}, true);
		
		Entrada eT = new entradaTeatro("El dilema del Perro", "22/08/2025", "10PM", 3, entradaTeatro.Drama, new String[] {"Mario, Juan, Martina"});
		
		Entrada eD = new entradaDeporte("River v Boca", "18/12/2018", "10PM", 4, "Futbol", true);
		Entrada eD2 = new entradaDeporte("Argentina v Nueva Zelanda", "23/03/2019", "5PM", 3, "Rugby", true);
		Entrada eD3 = new entradaDeporte("Quilmes v Berazategui", "03/05/2022", "3PM", 2, "Hockey", false);
		
		Entrada eI = new entradaInfantil("Paw patrol", "14/09/2024", "6PM", 2, true, 10);
		Entrada eI2 = new entradaInfantil("Peppa pig", "06/04/2023", "2PM", 1, false, 5);
		
		Entrada[] entradas = new Entrada[8];
		entradas[0] = eR;
		entradas[1] = eR2;
		entradas[2] = eT;
		entradas[3] = eD;
		entradas[4] = eD2;
		entradas[5] = eD3;
		entradas[6] = eI;
		entradas[7] = eI2;
		
		for (Entrada e : entradas) {
			System.out.println(e.toString());
		}
	}
}
