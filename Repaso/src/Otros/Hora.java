package Otros;

import java.util.*;

public class Hora {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Introduce hora");
		int hora = sc.nextInt();
		System.out.println("Introduce minutos");
		int minutos = sc.nextInt();
		System.out.println("Introduce segundos");
		int segundos = sc.nextInt();
		
		if(hora<=24 && hora>=0 && minutos<=59 && minutos>=0 && segundos<=59 && segundos>=0) {
			System.out.println("Hora correcta: " + hora +":" +minutos + ":" + segundos);
		}else {
			System.out.println("Hora incorrecta");
			
		}
	}

}
