package Institucion1;

import java.util.ArrayList;

public class Curso {
	private int codigoCurso;
    private String nombreCurso;
    
    private final ArrayList<Alumno> alumnoscurso ;

	public Curso(int codigoCurso, String nombreCurso) {
		super();
		this.codigoCurso = codigoCurso;
		this.nombreCurso = nombreCurso;
		this.alumnoscurso = new ArrayList<>() ;
	}

	public int getCodigoCurso() {
		return codigoCurso;
	}

	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
   
    
	
	 public void addAlumnoaCurso (Alumno alumno){
	        alumnoscurso.add(alumno);
	    }
	
	
	 public void imprimirCurso(){
	        
	        System.out.println("Curso ");
	        System.out.println("Nombre Curso "+ nombreCurso);
	          System.out.println("");
	        System.out.println("Codigo Curso " + codigoCurso);
	        System.out.println("");
	        
	        for(Alumno o : alumnoscurso){
	            
	            System.out.println(alumnoscurso.indexOf(o)+1);
	        
	            o.imprimirAlumno();;
	        

	}
	
	 
	 }
	
}
    
    

