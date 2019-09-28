package Institucion1;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Curso implements Presentacion {
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
		 		if (alumnoscurso.size()<10) {
		 			alumnoscurso.add(alumno);
		 		}
		 		else {
		 			JOptionPane.showMessageDialog(null,"Este curso se encuentra lleno con 10 alumnos");
					
				}
	    }
	
	 
	 public Profesor getProfesor() {
		return profesor;
	}

	 
	 
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}


	 
	 public String imprimirCurso(){
		return ("\n"
		 + "\nCodigo Curso "+ getCodigoCurso()
		 + "\nNombre Curso " + getNombreCurso()
		 + "\nProfesor" + getProfesor().getApellido());        
	}
	 
	
	 public String imprimirAlumnos(){
		 String Salida = "--------------------------------"
				 		+ "\nNombre Curso"+ nombreCurso
						+ "\nCodigo Curso" + codigoCurso
						+ "\nProfesor asignado " + getProfesor().getApellido()
						+ "\nAlumnos del curso";
						
	        for(Alumno o : alumnoscurso){
	            
	        	Salida += "\n" + o.imprimirAlumnos();
	           
	        		}
	        
	        return Salida;
	 		 
	 }
	
}
    
    

