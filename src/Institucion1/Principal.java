package Institucion1;

import java.awt.HeadlessException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		Institucion institu1 = new Institucion ("Sena");
		
		
		 
		Curso castellano = new Curso(1,"castellano");
		Curso ingles = new Curso(2,"ingles");
		
		
		Alumno juan = new Alumno (1,"Cifuentes","Juan");
		Alumno pedro = new Alumno (2,"Alvarez","Pedro");
		
	
		Profesor jorge = new Profesor (1,"Perez","Jorge");
		Profesor armando = new Profesor (2,"Casas","Armando");
		
		
		
		ingles.addAlumnoaCurso(juan);
		
		ingles.addAlumnoaCurso(pedro);
		
		castellano.addAlumnoaCurso(pedro);
		
		castellano.addAlumnoaCurso(juan);
		
		institu1.addACursoaInstitucion(ingles);
		institu1.addACursoaInstitucion(castellano);
		
		institu1.addProfesoraInstitucion(jorge);
		institu1.addProfesoraInstitucion(armando);
		
		
		
	
		
		
	        boolean salir = false;
	        int opcion; //Guardaremos la opcion del usuario
	 
	        while (!salir) {
	        	
	        	
	        	
	        	String lectura = JOptionPane.showInputDialog(null,"************************\n"
	        			              							+ "Elige opcion:\n"
	        			              							+ "1 - Gestion de cursos\n" 
	        			              							+ "2 - Gestion de profesores\n" 
	        			              							+ "3 - Gestion de alumnos \n" 
	        			              							+ "4 - Reporte institucional\n"
	        			              							+  "5.- Salir\n************************");
	        	
	        	
	        	try{
				//Recoger una variable por consola
	        	 opcion = Integer.parseInt(lectura);
	        	
	                switch (opcion) {
	                    case 1:
	                    	
	                    	boolean salir1 = false;
	             	        int opcion1; //Guardaremos la opcion del usuario
	             	 
	             	        while (!salir1) {
	             	 
	             	            
	             	 
	             	           String lectura1 = JOptionPane.showInputDialog(null,"************************\n"
             							+ "Elige opcion:\n"
             							+ "1 Alta de Curso\n" 
             							+ "2 Baja de Curso\n" 
             							+ "3 Consulta de Cursos\n" 
             							+  "4.- Salir\n************************");

	             	            
	             	            try {
	             	 
	             	            	opcion1 = Integer.parseInt(lectura1);
	             	 
	             	                switch (opcion1) {
	             	                    case 1:
	             	                    	institu1.imprimirCursos();
	             	                    	institu1.addCursoaInstitucion();
	             	                        break;
	             	                    case 2:
	             	                    	institu1.imprimirCursos();
	             	                    	institu1.removeCursoaInstitucion();
	             	                        break;
	             	                    case 3:
	             	                        institu1.imprimirCursos();
	             	                        break;
	             	                    case 4:
	             	                        salir1 = true;
	             	                        break;
	             	                    default:
	             	                        System.out.println("Solo n�meros entre 1 y 4");
	             	                }
	             	            }  catch(Exception e){
	             	            	JOptionPane.showMessageDialog(null,"Uoop! Error!");
	             	            }
	             	        }
	                    	
	                    	
	                        break;
	                    case 2:
	                        
	                    	boolean salir2 = false;
	             	        int opcion2; //Guardaremos la opcion del usuario
	             	 
	             	        while (!salir2) {
	             	 
	             	            System.out.println("1 Alta de Profesor");
	             	            System.out.println("2 Baja de Profesor");
	             	            System.out.println("3 Consulta de Profesores");
	             	            System.out.println("4 Asignar Profesor a Curso");
	             	            System.out.println("5 Salir");
	             	 
	             	            try {
	             	 
	             	                System.out.println("Escribe una de las opciones");
	             	                opcion2 = sn.nextInt();
	             	 
	             	                switch (opcion2) {
	             	                    case 1:
	             	                    	institu1.imprimirProfesoresInstitucion();
	             	                    	institu1.addProfesoraInstitucion();
	             	                        break;
	             	                    case 2:
	             	                    	institu1.imprimirProfesoresInstitucion();
	             	                    	institu1.removeProfesoraInstitucion();
	             	                        break;
	             	                    case 3:
	             	                        institu1.imprimirProfesoresInstitucion();
	             	                        break;
	             	                   case 4:
	             	                	   	institu1.imprimirProfesoresInstitucion();
	             	                	   	int i = institu1.buscarProfesor();
	             	                	   	if (i!=-1){
	             	                	   		institu1.imprimirCursos();
	        		    			    		institu1.asignarProfesor(i);
	        		    			    	}
	             	                        break;   
	             	                    case 5:
	             	                        salir2 = true;
	             	                        break;
	             	                    default:
	             	                        System.out.println("Solo n�meros entre 1 y 4");
	             	                }
	             	            } catch (InputMismatchException e) {
	             	                System.out.println("Debes insertar un n�mero");
	             	                sn.next();
	             	            }
	             	        }
	                    	
	             	        
	             	        
	                        break;
	                    case 3:
	                        institu1.removeAlumnoaInstitucion();
	                        break;
	                    case 4:
 	                        salir = true;
 	                        break;
 	                    default:
 	                     JOptionPane.showMessageDialog(null,"Solo n�meros entre 1 y 4");
 	                }
 	            } catch(HeadlessException | NumberFormatException e){
 	            	JOptionPane.showMessageDialog(null,"Uoop! Error!");
 	            }
 	        }
	
	}
}