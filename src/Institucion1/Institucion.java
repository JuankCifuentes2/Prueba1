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
	
	
	public void addAlumnoaInstitucion (){
        System.out.println("Ingrese Nombre de Nuevo Alumno:");
        String nombre = teclado.next();
        System.out.println("Ingrese Apellido de Nuevo Alumno:");
        String apellido = teclado.next();
        System.out.println("Ingrese legajo:");
        int codigo = teclado.nextInt();
        Alumno alumnon = new Alumno(codigo,nombre,apellido);
        alumnos.add(alumnon);
    }
	
	    
	public void removeAlumnoaInstitucion(){
		
		 System.out.println("Ingrese legajo de Alumno a eliminar:");
	        int legajo = teclado.nextInt();
	        
	      for (int i = 0; i < alumnos.size(); i++) {
	    	  
	    	  int	a =	alumnos.get(i).legajo ;
	    	
	    	  if (a == legajo) {
	    		
	    		alumnos.remove(i);
	    	}
	      }
		}
	
	
	public void addProfesoraInstitucion (Profesor profesor){
        profesores.add(profesor);
    }
	
	
	
	public void addProfesoraInstitucion (){
        System.out.println("Ingrese Nombre de Nuevo Profesor:");
        String nombre = teclado.next();
        System.out.println("Ingrese Apellido de Nuevo Profesor:");
        String apellido = teclado.next();
        System.out.println("Ingrese dni:");
        int dni = teclado.nextInt();
        Profesor profesor = new Profesor(dni,nombre,apellido);
        profesores.add(profesor);
    }
	
	
	public void removeProfesoraInstitucion(){
	
		System.out.println("Ingrese dni del Profesor a eliminar:");
       int dni = teclado.nextInt();
       
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
        System.out.println("Ingrese codigo de curso:");
        int codigo = teclado.nextInt();
        
        
        for (int j = 0; j < cursos.size() ; j++) {
				    	  
		    			    int	b = cursos.get(j).getCodigoCurso() ;
		    			    	
		    			    	if (b == codigo) {
		    			    		System.out.println ("Este codigo de curso ya se encuentra registrado");
                                                        y = y+1;
                                                }  	
		    		 		}	 
		    		 if (y == -1) {	
				    	  
                                          System.out.println("Ingrese nombre de Curso nuevo:");
                                                    String nombre = teclado.next();
                                                    Curso curson = new Curso(codigo,nombre);
                                                    cursos.add(curson);
                                         }	
        
		}
	
	
		
	public void removeCursoaInstitucion(){
			 System.out.println("Ingrese codigo de Curso a eliminar:");
		        int codigo = teclado.nextInt();
		        
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
			 System.out.println("Ingrese dni de Profesor a asignar:");
		        int dni = teclado.nextInt();
		        
		      for (int i = 0; i < profesores.size() ; i++) {
		    	  
		    	  	int	a =	profesores.get(i).getDni() ;
		    	  	if (a == dni) {
		    					y = i;
		    					x = x + 1;
		    			    	}	    	
		    				}
		      	if (x == 0) {
		    	  System.out.println ("Este dni no esta registrado");
		      		}
		      return y;
		    }
		 
		
	public void asignarProfesor(int i){
			 		int y = -1;
		    		System.out.println("Ingrese Curso a asignar profesor elegido");
		    		int codigo = teclado.nextInt();
		    		
		    		
		    		 for (int j = 0; j < cursos.size() ; j++) {
				    	  
		    			    int	b =	cursos.get(j).getCodigoCurso() ;
		    			    	
		    			    	if (b == codigo) {
		    			    		y = y +1 ;
		    			    		cursos.get(j).setProfesor(profesores.get(i));
		    			    	}  	
		    		 		}	 
		    		 if (y == -1) {	
				    	  System.out.println ("Este codigo de curso no se encuentra registrado");
		    		 
		    			}	 
		    	   }
		    	
		   
		 public void imprimir1Profesor(int a){
			 profesores.get(a).imprimirProfesor();
		 }
		 
	
		 public void imprimir2Cursos(){
			 System.out.println("Cursos de la Institucion");
			 System.out.println("");
		        for(Curso o : cursos){
		        	
		            o.imprimirCurso();        
		}
		 }
	
		 public void imprimir1Cursos(){
			 JOptionPane.showMessageDialog(null,"\n"
					+ "\nCursos de la Institucion");
		        for(Curso o : cursos){
		        	
		            o.imprimirCurso();        
		}
		
		 }
		 
	 public void imprimirCursos(){
			
		String Salida= "Cursos de la Institucion"
				+"\n" 
                                +"\n" ;
                       for( int i = 0 ; i  < cursos.size(); i++){
                        Salida += "\nCodigo Curso: "+ cursos.get(i).getCodigoCurso();
                        Salida += "\nNombre Curso: "+ cursos.get(i).getNombreCurso();
                        Salida += "\n";
                       }
                        
                      JOptionPane.showMessageDialog(null, Salida);  
                        
		 }
                 
		 
		 
		 public void imprimirCursosyAlumnos(){
			 
			 System.out.println("Institucion ");
		        System.out.println("Nombre Institucion "+ nombreInstitucion);
		        for(Curso o : cursos){
		            o.imprimiralumnosCurso();        
		}
	 }
		 
		  
		 
	 public void imprimirAlumnosInstitucion(){
	        
	        System.out.println("Institucion ");
	        System.out.println("Nombre Institucion "+ nombreInstitucion);
	        System.out.println("Alumnos de la institucion");
	        
	        for(Alumno o : alumnos){
	             o.imprimirAlumno();     
	}
	 }
	 
	 
	 public void imprimirProfesoresInstitucion(){
		        
		        System.out.println("Institucion ");
		        System.out.println("Nombre Institucion "+ nombreInstitucion);
		        System.out.println("Profesores de la institucion");
		        
		        for(Profesor o : profesores){
		            o.imprimirProfesor();
		        
		        } 
		        }	
	        }
    
	
	


