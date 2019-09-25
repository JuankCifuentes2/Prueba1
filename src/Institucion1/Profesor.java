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

		
public void imprimirProfesor(){
	        
	        System.out.println("------------------------------");
	        System.out.println("Nombre Profesor " + getNombre() + " " + getApellido());
	        System.out.println("Codigo Profesor " + getDni());
	        System.out.println("");
	        
	}
	
		
}