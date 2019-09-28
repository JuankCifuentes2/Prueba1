package Institucion1;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Institucion {
	
	Scanner teclado = new Scanner(System.in);
	
    private String nombreInstitucion;
    
    public final ArrayList<Alumno> alumnos ;
    public final ArrayList<Curso> cursos ;
    public final ArrayList<Profesor> profesores ;

	public Institucion(String nombreInstitucion) {
		
		this.setNombreInstitucion(nombreInstitucion);
		this.alumnos = new ArrayList<>() ;
		this.cursos = new ArrayList<>() ;
		this.profesores = new ArrayList<>() ;
	}

	public String getNombreInstitucion() {
		return nombreInstitucion;
	}

	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}
	
	public void addAlumnoaInstitucion (Alumno alumno){
        alumnos.add(alumno);
    }
	
	
	public void addAlumnoaInstitucion (){
        String nombre = JOptionPane.showInputDialog(null,"Ingrese Nombre de Nuevo Alumno:");
        String apellido = JOptionPane.showInputDialog(null,"Ingrese Apellido de Nuevo Alumno:");
        String lectura = JOptionPane.showInputDialog(null,"Ingrese dni de Nuevo Alumno");			
        int dni = Integer.parseInt(lectura);
        Alumno alumnon = new Alumno(dni,nombre,apellido);
        alumnos.add(alumnon);
    }
	
	    
	public void removeAlumnoaInstitucion(){
		String lectura = JOptionPane.showInputDialog(null,"Ingrese dni de Alumno a eliminar");			
        int dni = Integer.parseInt(lectura);
	     
	      for (int i = 0; i < alumnos.size(); i++) {
	    	  
	    	  int	a =	alumnos.get(i).dni ;
	    	
	    	  if (a == dni) {
	    		alumnos.remove(i);
	    	}
	      }
		}
	
	public void addProfesoraInstitucion (Profesor profesor){
        profesores.add(profesor);
    }
	
	public void addProfesoraInstitucion (){
        String nombre = JOptionPane.showInputDialog(null,"Ingrese Nombre de Nuevo Profesor:");
        String apellido = JOptionPane.showInputDialog(null,"Ingrese Apellido de Nuevo Profesor:");
        String lectura = JOptionPane.showInputDialog(null,"Ingrese dni de Nuevo Profesor");			
        int dni = Integer.parseInt(lectura);
        Profesor profesor = new Profesor(dni,nombre,apellido);
        profesores.add(profesor);
    }
	
	
	public void removeProfesoraInstitucion(){
	
		String lectura = JOptionPane.showInputDialog(null,"Ingrese dni del Profesor a eliminar");			
        int dni = Integer.parseInt(lectura);
       
        	for (int i = 0; i < profesores.size(); i++) {
   	  
        		int	a =	profesores.get(i).dni ;
   	
        		if (a == dni) {
    		   profesores.remove(i);
        		}
       			}
			}
	

	public void addACursoaInstitucion (Curso curso){
	        cursos.add(curso);
	    }
	
	
	public void addCursoaInstitucion (){
        int y = -1;
        String lectura1 = JOptionPane.showInputDialog(null,"Ingrese codigo de curso");			
        int codigo = Integer.parseInt(lectura1);
        
        for (int j = 0; j < cursos.size() ; j++) {
				    	  
		    int	b = cursos.get(j).getCodigoCurso() ;
		    			    	
		    if (b == codigo) {
		    					JOptionPane.showMessageDialog(null,"Este codigo de curso ya existe");
                                  y = y+1;
                                   }  	
		    		 				}	 
        						if (y == -1) {	
				    	   String nombre = JOptionPane.showInputDialog(null,"Ingrese nombre de Curso nuevo:");	
                           Curso curson = new Curso(codigo,nombre);
                             cursos.add(curson);
                                   }	
        
		}
	
		
	public void removeCursoaInstitucion(){
		String lectura = JOptionPane.showInputDialog(null,"Ingrese codigo de Curso a eliminar:");			
        int codigo = Integer.parseInt(lectura);
			for (int i = 0; i < cursos.size(); i++) {
		    	  int	a =	cursos.get(i).getCodigoCurso() ;
		    	  if (a == codigo) {
		    		cursos.remove(i);
		    	}
		      }
			}
		
		
		 
	 public int buscarProfesor(){
			 int x = 0;
			 int y = -1;
			 String lectura = JOptionPane.showInputDialog(null,"Ingrese dni de Profesor a asignar:");			
		        int dni = Integer.parseInt(lectura);
			
		      for (int i = 0; i < profesores.size() ; i++) {
		    	  
		    	  	int	a =	profesores.get(i).getDni() ;
		    	  	if (a == dni) {
		    					y = i;
		    					x = x + 1;
		    			    	}	    	
		    				}
		      	if (x == 0) {
		      		JOptionPane.showMessageDialog(null,"Este dni no esta registrado");
		      		}
		      return y;
		    }
		 
		
	public void asignarProfesoraCurso(int i){
			 		int y = -1;
			 		 String lectura = JOptionPane.showInputDialog(null,"Ingrese Curso a asignar profesor elegido");			
				        int codigo = Integer.parseInt(lectura);
		    		
		    		 for (int j = 0; j < cursos.size() ; j++) {
				    	  
		    			    int	b =	cursos.get(j).getCodigoCurso() ;
		    			    	
		    			    	if (b == codigo) {
		    			    		y = y +1 ;
		    			    		cursos.get(j).setProfesor(profesores.get(i));
		    			    	}  	
		    		 		}	 
		    		 if (y == -1) {	
		    			 JOptionPane.showMessageDialog(null,"Este codigo de curso no se encuentra registrado");
				   
		    			}	 
		    	   }
		    	
		   
	 public int buscarAlumno(){
		 int x = 0;
		 int y = -1;
		 String lectura = JOptionPane.showInputDialog(null,"Ingrese dni de Alumno a asignar:");			
	        int dni = Integer.parseInt(lectura);
		
	      for (int i = 0; i < alumnos.size() ; i++) {
	    	  
	    	  	int	a =	alumnos.get(i).getdni() ;
	    	  	if (a == dni) {
	    					y = i;
	    					x = x + 1;
	    			    	}	    	
	    				}
	      	if (x == 0) {
	      		JOptionPane.showMessageDialog(null,"Este dni no esta registrado");
	      		}
	      return y;
	    }
	
	
	 public void asignarAlumnoaCurso(int i){
	 		int y = -1;
	 		 String lectura = JOptionPane.showInputDialog(null,"Ingrese Curso a asignar Alumno elegido");			
		        int codigo = Integer.parseInt(lectura);
 		
 		 for (int j = 0; j < cursos.size() ; j++) {
		    	  
 			    int	b =	cursos.get(j).getCodigoCurso() ;
 			    	
 			    	if (b == codigo) {
 			    		y = y +1 ;
 			    		cursos.get(j).addAlumnoaCurso(alumnos.get(i));;
 			    	}  	
 		 		}	 
 		 if (y == -1) {	
 			 JOptionPane.showMessageDialog(null,"Este codigo de curso no se encuentra registrado");
		   
 			}	 
 	   }
	
		 
	 public void imprimirCursos(){	
		String Salida= "Cursos de la Institucion"
						+"\n" 
                        +"\n";
                       
					for(Curso o : cursos){
						Salida += o.imprimirCurso(); 
					}
                      JOptionPane.showMessageDialog(null, Salida);            
		 }
                 
	 
		 public void imprimirCursosyAlumnos(){
			 String Salida= "Institucion "
					 		+"\n"
					 		+ nombreInstitucion;
					 		
		        for(Curso o : cursos){
		            Salida += "\n" + o.imprimirAlumnos();           
		}
		        JOptionPane.showMessageDialog(null, Salida);
	 }
		 
		  
		 
	 public void imprimirAlumnosInstitucion(){
	        
		 String Salida= "Alumnos de la Institucion"
						+"\n" 
						+"\n";
	        
	        for(Alumno o : alumnos){
				Salida += o.imprimirAlumnos(); 
			}
              JOptionPane.showMessageDialog(null, Salida);            
	 	}
	 
	 
	 
	 public void imprimirProfesoresInstitucion(){	
			String Salida= "Profesores de la Institucion"
							+"\n" 
	                        +"\n";
	                       
						for(Profesor o : profesores){
							Salida += o.imprimirProfesor(); 
						}
	                      JOptionPane.showMessageDialog(null, Salida);            
			 }
	 
	        }
    
	
	


