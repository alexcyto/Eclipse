package Metodos;

//6.-Diseñe un método en el que se pida ingresar por teclado su genero (M o F),
//para luego digitar su nombre que le corresponde a un varón o mujer.

import java.util.*;

public class Genero {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
			
		System.out.println("Introduce tu género (M o F)");
		String opcion = sc.next();
		 switch (opcion) {
			case "M":
				System.out.println("Introduce tu nombre");
				String nombreM = sc.next();
				System.out.println("Nombre: " + nombreM);
				System.out.println("Sexo: " + opcion);
				break;
				
			case "F":
				System.out.println("Introduce tu nombre");
				String nombreF = sc.next();
				System.out.println("Nombre: " + nombreF);
				System.out.println("Sexo: " + opcion);
				break;
				
			default:
				System.out.println("Debes introducir tu sexo!");									
		 }
		}
	
	
	public static void main(String []Args) {
		
		menu();
	}

}
