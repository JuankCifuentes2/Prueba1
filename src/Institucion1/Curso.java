package Institucion1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Curso {
	private int codigoCurso;
    private String nombreCurso;
    private Profesor profesor;
    
    private final ArrayList<Alumno> alumnoscurso ;

	public Curso(int codigoCurso, String nombreCurso) {
		super();
		this.codigoCurso = codigoCurso;
		this.nombreCurso = nombreCurso;
		this.alumnoscurso = new ArrayList<>() ;
		this.profesor = new Profesor(0, null, null);
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
	
	 
	 public Profesor getProfesor() {
		return profesor;
	}

	 
	 
	 
	 
	 
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	 
	 public void imprimir1Curso(){
	        
		 JOptionPane.showMessageDialog(null,"\n"
		 + "\nCodigo Curso "+ getCodigoCurso()
		 + "\nNombre Curso " + getNombreCurso()
		 + "\nProfesor" + getProfesor().getApellido());
	        
	}
	 
	 
	 public void imprimirCurso(){
	        
	        System.out.println("------------------------------");
	        System.out.println("Codigo Curso "+ getCodigoCurso());
	        System.out.println("Nombre Curso " + getNombreCurso());
	        System.out.println("Profesor" + getProfesor().getApellido());
	        
	}
	 
	 
	 public void imprimiralumnosCurso(){
		 
		 System.out.println("**************************************************************************************");
		
	        System.out.println("Nombre Curso "+ nombreCurso);
	          System.out.println("");
	        System.out.println("Codigo Curso " + codigoCurso);
	        System.out.println("");
	        System.out.println("Alumnos del curso");
	        
	        for(Alumno o : alumnoscurso){
	            
	            System.out.println(alumnoscurso.indexOf(o)+1);
	           
	        
	            o.imprimirAlumno();;
	        

	}
	
	 
	 }
	
}
    
    

