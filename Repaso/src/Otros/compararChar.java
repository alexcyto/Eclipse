package Otros;

import java.io.IOException;

public class compararChar {

	public static void main(String[] args) throws IOException {
		
		char car1, car2;
        System.out.print("Introduzca primer car�cter: ");
        car1 = (char)System.in.read(); //lee un car�cter
        
        System.in.read();  //saltar el intro que ha quedado en el buffer  
        
        
        System.out.print("Introduzca segundo car�cter: ");
        car2 = (char)System.in.read(); //lee el segundo car�cter
        
        //ejemplo de inicializar un objeto
        Character c1 = new Character(car1);
        Character c2 = new Character(car2);
        
        //esto esta bien pero no funciona porque java es una mierda
        //el equals solo funciona para comparar objetos
        if(c1.equals(c2)){
           System.out.println("Son iguales");   
        }else{
           System.out.println("No son iguales");
        }        
    }
}
