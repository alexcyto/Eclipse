package Metodos;

import java.util.*;

public class tablaMultiplicar {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void tablaMultiplicar() {
		
		System.out.println("Introduce un numero para sacar su tabla");
		int numero = sc.nextInt();
		System.out.println(numero + "x1=" + numero * 1);
		System.out.println(numero + "x2=" + numero * 2);
		System.out.println(numero + "x3=" + numero * 3);
		System.out.println(numero + "x4=" + numero * 4);
		System.out.println(numero + "x5=" + numero * 5);
		System.out.println(numero + "x6=" + numero * 6);
		System.out.println(numero + "x7=" + numero * 7);
		System.out.println(numero + "x8=" + numero * 8);
		System.out.println(numero + "x9=" + numero * 9);
		System.out.println(numero + "x10=" + numero * 10);

	}
	
	public static void tablaMultiplicar2(int numero) {
		
	System.out.println("Introduce un numero para sacar su tabla");
	System.out.println(numero + "x1=" + numero * 1);
	System.out.println(numero + "x2=" + numero * 2);
	System.out.println(numero + "x3=" + numero * 3);
	System.out.println(numero + "x4=" + numero * 4);
	System.out.println(numero + "x5=" + numero * 5);
	System.out.println(numero + "x6=" + numero * 6);
	System.out.println(numero + "x7=" + numero * 7);
	System.out.println(numero + "x8=" + numero * 8);
	System.out.println(numero + "x9=" + numero * 9);
	System.out.println(numero + "x10=" + numero * 10);
	}

	public static void main(String[] args) {

		tablaMultiplicar();
		tablaMultiplicar2(9);

	}

}
