package menu;
import java.util.*;

//meses de 30 dias = 4, 6, 9, 11
//meses de 31 dias = 1,3,5,7,8,10,12
//meses de 28 dias = 2

public class mes {
	
	static Scanner sc = new Scanner(System.in);
		

	public static void main(String[] args) {

		System.out.println("Introduce un número de mes");
		int mes = sc.nextInt();
		
		switch(mes) {
		case 1:
			System.out.println("Enero");
		case 2:
			System.out.println("Febrero");
		case 3:
			System.out.println("Marzo");
		case 4:
			System.out.println("Mayo");
		case 5:
			System.out.println("Abril");
		case 6:
			System.out.println("Junio");
		case 7:
			System.out.println("Julio");
		case 8:
			System.out.println("Agosto");
		case 9:
			System.out.println("Septiembre");
		case 10:
			System.out.println("Octubre");
		case 11:
			System.out.println("Noviembre");
		case 12:
			System.out.println("Diciembre");
			
			
			//||=or
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("Tiene 30 dias");
			
		}else if(mes == 2) {
			System.out.println("Tiene 28 dias");
		}else {
			System.out.println("Tiene 31 dias");
		}
		
		
	   }
	}

}
