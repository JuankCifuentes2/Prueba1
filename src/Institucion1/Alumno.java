package Institucion1;

import java.util.Scanner;


public class Alumno extends Persona{//SUBCLASE O CLASE HIJA

	    private final int legajo;

	    public Alumno(String nombre, String apellido, int legajo) {
	        super(nombre, apellido);
	        this.legajo = legajo;
	    }

		public int getLegajo() {
			return legajo;
		}
	

		
	                  
	            
		
		
		
public void imprimirAlumno(){
	        
	        System.out.println("------------------------------");
	        System.out.println("Nombre Alumno "+ getNombre());
	        System.out.println("Codigo Alumno " + getLegajo());
	        System.out.println("");
	        
	}
	
	    
	    
	 }

