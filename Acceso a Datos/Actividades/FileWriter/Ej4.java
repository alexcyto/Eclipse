package FileWriter;


//Escriu un programa que rebi el nom d’un arxiu que guarda una sèrie de quantitats
//enteres positives i mostra per pantalla la seva suma. 
//Els nombres estan separats per un espai en blanc.
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ej4 {

public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);
		  int total = 0;
		  
		  try {			  
		   System.out.println("Escribe el nombre del archivo seguido de .txt:");
		   File fichero = new File(sc.next()); 
		   sc = new Scanner(fichero); 
		   
		   while (sc.hasNext()) {
		    total = total + sc.nextInt(); 
		   }
		   
		   System.out.println("La suma de todos los números es:" + total);
		  }
		  catch(Exception e) {
		   System.out.println("Archivo no encontrado");
		  }
		 }
}