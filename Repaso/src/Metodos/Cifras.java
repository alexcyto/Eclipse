package Metodos;

/*
 9.- En este ejercicio se debe mostrar el mensaje “Ha ingresado un numero de un dígito�?,
  si el numero ingresado esta en el rango del 1 al 9, 
  si ingresa un numero de 2 dígitos mostrar el mensaje; “Ha ingresado un numero de dos dígitos�?, 
  de la misma manera si es de 3 dígitos.


 */


public class Cifras {
	
	public static void cifras(int numero) {
		if (numero >9 && numero <100) {
			System.out.println(numero + " Es un número de 2 cifras");
		}
		if (numero >0 && numero <10) {
			System.out.println(numero + " Es un número de 1 cifra");
		}
		if (numero >99 && numero <1000) {
			System.out.println(numero + " Es un número de 3 cifras");
		}
		
	}

	public static void main(String[] args) {
		
		cifras(9);
		cifras(56);
		cifras(758);

	}

}
