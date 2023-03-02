package operaciones;

public class Piloto {
	
		private String Nombre;
		private int Edad;
		private String Cargo;
		
		public Piloto(String nombre, int edad, String cargo) {
			this.Nombre = nombre;
			this.Edad = edad;
			this.Cargo = cargo;
		}

		public String getNombre() {
			return Nombre;
		}

		public void setNombre(String nombre) {
			Nombre = nombre;
		}

		public int getEdad() {
			return Edad;
		}

		public void setEdad(int edad) {
			Edad = edad;
		}

		public String getCargo() {
			return Cargo;
		}

		public void setCargo(String cargo) {
			Cargo = cargo;
		}
		
		
		

	}


