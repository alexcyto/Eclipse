package Metodos;

import java.util.*;

/*
 7.- Crea un método que al ingresar por teclado un número cualquiera, 
 muestre la cantidad de  números pares a partir del 2, por ejemplo: 
 si se  introduce 7, entonces se imprimirán los pares de el doble de 7:, 2, 4, 6, 8, 10, 12,14 
 o si se introduce 10 = 2, 4, 6, 8, 10, 12, 14, 16, 18, 20.
 */

public class NumerosPares {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void calcularPares() {
		System.out.println("Introduce un número");
		int numero = sc.nextInt();
		for(int i =2; i<=(numero*2); i=i+2) {
			if (numero%2==0) {
				System.out.println(i);				
			}else {
				System.out.println(i);
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		calcularPares();
	}

}
