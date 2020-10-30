package Metodos;

import java.io.IOException;
import java.util.*;

public class LetraMayuscula {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		char caracter;
		System.out.print("Introduzca un carácter: ");
						//método para leer un caracter por scanner en java
        caracter = (char) System.in.read(); 
        	
        	//metodo para ver si el caracter es mayuscula
        if(Character.isUpperCase(caracter)) {
        	System.out.println("Está en mayúscula");
        }else {
        	System.out.println("Está en minúscula");
        }

		

	}

}
