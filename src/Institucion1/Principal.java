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
	         //Guardaremos la opcion del usuario
	 
	        while (!salir) {
	        	int opcion = 5;
	                String lectura = (String)JOptionPane.showInputDialog(
	        			null,"Seleccione Un Opcion","INSTITUCION", JOptionPane.QUESTION_MESSAGE, null,
	        						
	        			new Object[] {
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
	             	         //Guardaremos la opcion del usuario
	             	 
	             	        while (!salir1) {
	             	        	int opcion1=4;
	             	        	
	             	        	String lectura1 = (String)JOptionPane.showInputDialog(
	            	        			null,"Seleccione Un Opcion","CURSOS", JOptionPane.QUESTION_MESSAGE, null,
	            	        						
	            	        			new Object[] {
	                  							      "1 Alta de Curso" ,
	                  						       	  "2 Baja de Curso", 
	                  							      "3 Consulta de Cursos" ,
	                  							      "4 Salir"},"GESTION DE CURSOS");
	            	        			
	            	                if (lectura1 == "1 Alta de Curso"){opcion1 = 1;}
	            	                if (lectura1 == "2 Baja de Curso"){opcion1 = 2;}
	            	                if (lectura1 == "3 Consulta de Cursos"){opcion1 = 3;}
	            	                if (lectura1 == "4 Salir"){opcion1 = 4;}
	             	 
	            	                try {
	             	 
	             	            	
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
	             	         //Guardaremos la opcion del usuario
	             	 
	             	        while (!salir2) {
	             	        	int opcion2=5;
	             	        
	             	        	  String lectura2 = (String)JOptionPane.showInputDialog(
	             		        			null,"Seleccione Un Opcion","INSTITUCION", JOptionPane.QUESTION_MESSAGE, null,
	             		        						
	             		        			new Object[] {
	             	      							      "1 Alta de Profesor" ,
	             	      						       	  "2 Baja de Profesor", 
	             	      							      "3 Consulta de Profesores" ,
	             	      							      "4 Asignar Profesor a Curso",
	             	      							      "5 Salir"},"Administrador de instituciones educativas");
	             		        			
	             		                if (lectura2 == "1 Alta de Profesor"){opcion2 = 1;}
	             		                if (lectura2 == "2 Baja de Profesor"){opcion2 = 2;}
	             		                if (lectura2 == "3 Consulta de Profesores"){opcion2 = 3;}
	             		                if (lectura2 == "4 Asignar Profesor a Curso"){opcion2 = 4;}
	             		                if (lectura2 == "5 Salir"){opcion2 = 5;}
	             	        	
	             	        	
	             	            try {
	             	 
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
	             	       	//Guardaremos la opcion del usuario
	             	 
	             	        while (!salir3) {
	             	        	
	             	        	int opcion3=5;
		             	        
	             	        	  String lectura3 = (String)JOptionPane.showInputDialog(
	             		        			null,"Seleccione Un Opcion","INSTITUCION", JOptionPane.QUESTION_MESSAGE, null,
	             		        						
	             		        			new Object[] {
	             	      							      "1 Alta de Alumno" ,
	             	      						       	  "2 Baja de Alumno", 
	             	      							      "3 Consulta de Alumnos" ,
	             	      							      "4 Asignar Alumnos a curso",
	             	      							      "5 Salir"},"Administrador de instituciones educativas");
	             		        			
	             		                if (lectura3 == "1 Alta de Alumno"){opcion3 = 1;}
	             		                if (lectura3 == "2 Baja de Alumno"){opcion3 = 2;}
	             		                if (lectura3 == "3 Consulta de Alumnos"){opcion3 = 3;}
	             		                if (lectura3 == "4 Asignar Alumnos a curso"){opcion3 = 4;}
	             		                if (lectura3 == "5 Salir"){opcion3 = 5;}
	             	        	
	            
	             	            try {
	             	 
	             	            	
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