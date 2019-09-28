package Institucion1;




public class Alumno extends Persona implements Presentacion {//SUBCLASE O CLASE HIJA

	    public final int dni;

	    public Alumno(int dni, String nombre, String apellido) {
	        super(nombre, apellido);
	        this.dni = dni;
	    }

		public int getdni() {
			return dni;
		}
	
	
public String imprimirAlumnos(){
	return ("\n"
			 + "\nNombre Alumno "+ getNombre()+ " " + getApellido()
			 + "\nDni Alumno " + getdni());       
		}

	 }

