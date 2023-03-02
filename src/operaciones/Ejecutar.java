package operaciones;

public class Ejecutar {

	public static void main(String[] args) {
		Avion avion = new Avion(5, "Rayaner");
		System.out.println(avion.numeroAviones);
		Avion avion2 = new Avion(5, "AirEurope");
		System.out.print(avion.numeroAviones);
		System.out.print(avion.equals(avion2));
		
		Piloto piloto = new Piloto("Luis Miguel", 30, "piloto");
		avion.setPiloto(piloto);
	}

}
