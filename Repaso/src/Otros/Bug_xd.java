package Otros;

import java.util.Scanner;

public class Bug_xd {

	//Escriu un programa en el que te demani el nom d�usuari per consola, si el nom �s admin mostra usuari correcte i sin� usuari incorrecte.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca su nombre de usuario:");
		
		String usuario = sc.next();
		
		if(usuario == "admin"){
			System.out.println("Usuari correcte");
		}
		if(usuario != "admin")
				System.out.println("Usuari incorrecte");
			}
		}
		

	


