package Institucion1;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Institucion institu1 = new Institucion ("Sena");
		
		
		
		
		
		
		 Scanner sn = new Scanner(System.in);
	        boolean salir = false;
	        int opcion; //Guardaremos la opcion del usuario
	 
	        while (!salir) {
	 
	            System.out.println("1. Opcion 1");
	            System.out.println("2. Opcion 2");
	            System.out.println("3. Opcion 3");
	            System.out.println("4. Salir");
	 
	            try {
	 
	                System.out.println("Escribe una de las opciones");
	                opcion = sn.nextInt();
	 
	                switch (opcion) {
	                    case 1:
	                    	institu1.addAlumnoaInstitucion();
	                        break;
	                    case 2:
	                        institu1.imprimirInstitucion();
	                        break;
	                    case 3:
	                        institu1.removeAlumnoaInstitucion();
	                        break;
	                    case 4:
	                        salir = true;
	                        break;
	                    default:
	                        System.out.println("Solo números entre 1 y 4");
	                }
	            } catch (InputMismatchException e) {
	                System.out.println("Debes insertar un número");
	                sn.next();
	            }
	        }
		
		
		
		
		
		

	}

}
