package Metodos;

//5.5.- En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los 1000 en las áreas de frutas, verduras 
//y abarrotes. ¿ Cual sera el total que pagara una persona por su compra ?,
//se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a pagar….

import java.util.Scanner;

public class Compras {
	
	public static void comprarProducto() {
		System.out.println("Intoduce el nombre del cliente");
		String cliente = sc.next();
		System.out.println("Introduce el nombre del producto");
		String producto = sc.next();
		System.out.println("Introduce el precio del producto");
		int precio = sc.nextInt();
		System.out.println("Introduce la cantidad");
		int cantidad = sc.nextInt();
		
		int total = precio * cantidad;
		
		if (total>1000) {
			System.out.println("Nombre: " + cliente);
			System.out.println("Producto: " + producto);
			System.out.println("Precio:" + precio);
			System.out.println("Cantidad: " + cantidad);
			
			
			System.out.println("Aplicando descuento....");
			System.out.println("Total: " + total);
			System.out.println("Descuento: " + (total - ((total*80))/100));
			System.out.println("Total con descuento:" + (total*80)/100);
		}else {
			System.out.println("Nombre: " + cliente);
			System.out.println("Producto: " + producto);
			System.out.println("Precio:" + precio);
			System.out.println("Cantidad: " + cantidad);
			System.out.println("Total: " + total);
		}
		
	}
	
	
	
	static Scanner sc = new Scanner(System.in);
	
	public static void menu() {
		
		System.out.println("MENU");
		System.out.println("Elige una opción");
		System.out.println("1= Frutas");
		System.out.println("2= Verduras");
		System.out.println("3= Abarrotes");
		
		int opcion = sc.nextInt();
		
		switch (opcion) {
		
		case 1:
			comprarProducto();
			break;
		case 2:
			comprarProducto();
			break;
		case 3:
			comprarProducto();
			break;
			
		
		}
	}
	
	public static void main(String[]Args) {
		
	menu();
	}

}
