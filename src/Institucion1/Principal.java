package Institucion1;

import java.awt.HeadlessException;



import javax.swing.JOptionPane;



public class Principal {

	public static void main(String[] args) {
		
		
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
		
		
		institu1.addAlumnoaInstitucion(juan);
		institu1.addAlumnoaInstitucion(pedro);
		
		
	        boolean salir = false;
	        int opcion = 0; //Guardaremos la opcion del usuario
	 
	        while (!salir) {
	        	
	        	
	        	
	                String lectura = (String)JOptionPane.showInputDialog(
	        			null,"Seleccione Un Opcion","INSTITUCION", JOptionPane.QUESTION_MESSAGE, null,
	        						
	        			new Object[] {"Elige opcion",
      							      "1 Gestion de cursos" ,
      						       	  "2 Gestion de profesores", 
      							      "3 Gestion de alumnos" ,
      							      "4 Reporte institucional",
      							      "5 Salir"},"Administrador de instituciones educativas");
	        			
	                if (lectura == "1 Gestion de cursos"){opcion = 1;}
	                if (lectura == "2 Gestion de profesores"){opcion = 2;}
	                if (lectura == "3 Gestion de alumnos"){opcion = 3;}
	                if (lectura == "4 Reporte institucional"){opcion = 4;}
	                if (lectura == "5 Salir"){opcion = 5;}
	                
	                
	        	try{
				//Recoger una variable por consola
	        	 
	        	
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
	             	 	                     JOptionPane.showMessageDialog(null,"Elige una opcion");
	             	 	                }
	             	           } catch(HeadlessException | NumberFormatException e){
	            	            	JOptionPane.showMessageDialog(null,"Uoop! Error!");
	            	            }
	             	        }
	                  
	                        break;
	                    case 2:
	                        
	                    	boolean salir2 = false;
	             	        int opcion2; //Guardaremos la opcion del usuario
	             	 
	             	        while (!salir2) {
	             	        	
	             	        	
	             	        	String lectura1 = JOptionPane.showInputDialog(null,"************************\n"
             							+ "Elige opcion:\n"
             							+ "1 Alta de Profesor\n" 
             							+ "2 Baja de Profesor\n" 
             							+ "3 Consulta de Profesores\n" 
             							+ "4 Asignar Profesor a Curso\n" 
             							+  "5 Salir\n************************");
	             	 
	            
	             	            try {
	             	 
	             	            	opcion2 = Integer.parseInt(lectura1);
	             	 
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
	        		    			    		institu1.asignarProfesoraCurso(i);
	        		    			    	}
	             	                        break;   
	             	                    case 5:
	             	                        salir2 = true;
	             	                        break;
	             	                   default:
	             	 	                     JOptionPane.showMessageDialog(null,"Solo numeros entre 1 y 5");
	             	 	                }
	             	           } catch(HeadlessException | NumberFormatException e){
	            	            	JOptionPane.showMessageDialog(null,"Uoop! Error!");
	            	            }
	             	        }
	                    	
	             	        
	                        break;
	                    case 3:
	                    	boolean salir3 = false;
	             	        int opcion3; //Guardaremos la opcion del usuario
	             	 
	             	        while (!salir3) {
	             	        	
	             	        	
	             	        	String lectura1 = JOptionPane.showInputDialog(null,"************************\n"
             							+ "Elige opcion:\n"
             							+ "1 Alta de Alumno\n" 
             							+ "2 Baja de Alumno\n" 
             							+ "3 Consulta de Alumnos\n" 
             							+ "4 Asignar Alumnos a curso\n" 
             							+  "5 Salir\n************************");
	             	 
	            
	             	            try {
	             	 
	             	            	opcion3 = Integer.parseInt(lectura1);
	             	 
	             	                switch (opcion3) {
	             	                    case 1:
	             	                    	institu1.imprimirAlumnosInstitucion();;
	             	                    	institu1.addAlumnoaInstitucion();
	             	                        break;
	             	                    case 2:
	             	                    	institu1.imprimirAlumnosInstitucion();
	             	                    	institu1.removeAlumnoaInstitucion();
	             	                        break;
	             	                    case 3:
	             	                        institu1.imprimirAlumnosInstitucion(); 
	             	                        break;
	             	                   case 4:
	             	                	   	institu1.imprimirAlumnosInstitucion();
	             	                	   	int i = institu1.buscarAlumno();
	             	                	   	if (i!=-1){
	             	                	   		institu1.imprimirCursos();
	        		    			    		institu1.asignarAlumnoaCurso(i);
	        		    			    	}
	             	                        break;
	             	                  case 5:
	             	                        salir3 = true;
	             	                        break;
	             	                   default:
	             	 	                     JOptionPane.showMessageDialog(null,"Solo numeros entre 1 y 5");
	             	                                   }
	             	           } catch(HeadlessException | NumberFormatException e){
	            	            	JOptionPane.showMessageDialog(null,"Uoop! Error!");
	            	            	}
	             	        	}
	                        break;
	                    case 4:
	                    	institu1.imprimirCursosyAlumnos();	
	                    	break;
	                    	
	                    case 5:
 	                        salir = true;
 	                        break;
 	                    default:
 	                     JOptionPane.showMessageDialog(null,"Elige una opción");
 	                }
 	            } catch(HeadlessException | NumberFormatException e){
 	            	JOptionPane.showMessageDialog(null,"Uoop! Error!");
 	            }
	        	 		
 	        }
	       
	}
}