package operaciones;

//import java.util.Objects;

public class Avion {
	
	static int numeroAviones = 0;
	
    private int numeroPasajeros;
    private String aeroLineas;
    private Piloto piloto;  
      
	public Piloto getPiloto() {
		return piloto;
	}
	public void setPiloto(Piloto piloto) {
		this.piloto = piloto;
	}
	public Avion(int numeroPasajeros, String aeroLineas) {
		this.numeroPasajeros = numeroPasajeros;
		this.aeroLineas = aeroLineas;
		numeroAviones++;
	
	}
	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}
	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}
	public String getAeroLineas() {
		return aeroLineas;
	}
	public void setAeroLineas(String aeroLineas) {
		this.aeroLineas = aeroLineas;
		
	}
//	@Override
//	public int hashCode() {
//		return Objects.hash(numeroPasajeros);
//	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avion other = (Avion) obj;
		return numeroPasajeros == other.numeroPasajeros;
	}
      
}
