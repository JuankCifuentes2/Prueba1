package Institucion1;


	public class Profesor extends Persona{//SUBCLASE O CLASE HIJA

	    public final int dni;

	   
	    
		public Profesor(int dni, String nombre, String apellido) {
			super(nombre, apellido);
			this.dni = dni;
		}



		public int getDni() {
			return dni;
		}

public String imprimirProfesor(){
	return ("\n"
	 + "\nNombre Profesor "+ getNombre()+ " " + getApellido()
	 + "\nDni Profesor " + getDni());       
}
		
}