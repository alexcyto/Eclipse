package Otros;

import java.io.IOException;

public class leerNumChar {

	public static void main(String[] args) throws IOException {

		char car;
		
		System.out.println("Introduce un caracter");
		car = (char) System.in.read();
			//m�todo que mira si un caracter es un numero (obviamente solo puede ser un numero de una cifra porque es un caracter)
		if(Character.isDigit(car)) {
			System.out.println("Es un numero");
		}else {
			System.out.println("No es un numero");
			
			//forma 2
		if(car>=0 && car<=9) {
			System.out.println("Es un numero");
		}else {
			System.out.println("No es un numero");
		}
		}
	}

}
