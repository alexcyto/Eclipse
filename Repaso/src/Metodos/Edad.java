package Metodos;

import java.util.Scanner;

public class Edad {
	
	static Scanner sc = new Scanner(System.in);

	public static void mostrarDatos() {
		System.out.println("Introduce el nombre");
		String nombre = sc.next();
		System.out.println("Introduce el apellido");
		String apellido = sc.next();
		System.out.println("Introduce la edad");
		int edad = sc.nextInt();
		System.out.println(nombre +" " + apellido +" " + edad);
			if (edad >= 18) {
				System.out.println("Es mayor de edad");
			}else {
				System.out.println("Es menor de edad");
			}
	}

	public static void main(String[] args) {
		
		mostrarDatos();
		
	}

}
