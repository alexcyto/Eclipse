package Metodos;

import java.util.Scanner;

/*
1.- Crear un método que muestre los datos (nombre, apellido y la edad) de un usuario, ingresado por teclado.
*/

//2.- Diseñe un método que imprima los datos de una persona ingresados por teclado e indicar si es mayor o menor de edad.

//3.- En un método mostrar la tabla de multiplicar de cualquier numero ingresado por teclado.

//4.-Elabore un método que simule el proceso de subir a un piso en un ascensor, donde el numero de piso es ingresado por teclado.


//5.5.- En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los 1000 en las áreas de frutas, verduras 
//y abarrotes. ¿ Cual sera el total que pagara una persona por su compra ?,
//se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a pagar….



public class Ascensor {
	
	static Scanner sc = new Scanner(System.in);

	
	public static void ascensorSube() throws InterruptedException {

		System.out.println("A que piso quieres subir?");
		int piso = sc.nextInt();
		System.out.println("En que piso est�s?");
		for(int i = sc.nextInt(); i<=piso; i++) {
			Thread.sleep(1000);
			System.out.println("Piso" + i);
			
		}
	}
	
	public static void ascensorBaja() throws InterruptedException {
		System.out.println("A que piso quieres bajar?");
		int piso = sc.nextInt();
		System.out.println("En que piso estas?");
		for(int i=sc.nextInt(); i>=piso; i--) {
			Thread.sleep(1000);
			System.out.println("Piso" + i);
		}
	}


	
	public static void main(String[]Args) throws InterruptedException {
				
		ascensorBaja();
		ascensorSube();
	}

}


