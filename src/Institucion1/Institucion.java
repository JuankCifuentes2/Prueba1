package Institucion1;

import java.util.ArrayList;
import java.util.Scanner;

public class Institucion {
	
    private String nombreInstitucion;
    
    public final ArrayList<Alumno> alumnos ;

	public Institucion(String nombreInstitucion) {
		
		this.setNombreInstitucion(nombreInstitucion);
		this.alumnos = new ArrayList<>() ;
		
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}
	
	
	public void addAlumnoaInstitucion (){
		
		Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre de Nuevo Alumno:");
        String nombre = teclado.next();
        System.out.println("Ingrese legajo:");
        int codigo = teclado.nextInt();
        Alumno alumnon = new Alumno(codigo,nombre,nombre);
        alumnos.add(alumnon);
    }
	
	    
	public void removeAlumnoaInstitucion(){
		
		Scanner teclado = new Scanner(System.in);
		
		 System.out.println("Ingrese legajo de Alumno a eliminar:");
	        int legajo = teclado.nextInt();
	        
	      for (int i = 0; i < alumnos.size(); i++) {
	    	  
	    int	a =	alumnos.get(i).legajo ;
	    	
	    	if (a == legajo) {
	    		
	    		
	    		alumnos.remove(i);
	    		
	    	}
	        
	}
	}
	
	
	
	
	 public void imprimirInstitucion(){
	        
	        System.out.println("Institucion ");
	        System.out.println("Nombre Institucion "+ nombreInstitucion);
	         
	        
	        for(Alumno o : alumnos){
	        	
	        	
	            o.imprimirAlumno();
	        
	}
	
	
	 }
    
}
    
	
	


