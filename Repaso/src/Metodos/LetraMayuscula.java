package Metodos;

import java.io.IOException;
import java.util.*;

public class LetraMayuscula {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		
		char caracter;
		System.out.print("Introduzca un car�cter: ");
						//m�todo para leer un caracter por scanner en java
        caracter = (char) System.in.read(); 
        	
        	//metodo para ver si el caracter es mayuscula
        if(Character.isUpperCase(caracter)) {
        	System.out.println("Est� en may�scula");
        }else {
        	System.out.println("Est� en min�scula");
        }

		

	}

}
