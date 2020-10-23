package PadreHijo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SPU01E01Alex_Mari {
     public static void main(String[] args) {
          try {
             System.out.println("Creando proceso...");
             Process p = Runtime.getRuntime().exec("gambas3"); //creo el prroceso
             BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream()));
             System.out.println(br); //printea el error de ejecución si ocurriese
             System.out.println("Proceso en ejecución");
             p.waitFor();

             System.out.println("Proceso terminado");
          } catch (Exception ex) {
             ex.printStackTrace();	//printea el error de que no ha encontrado el proceso si ocurriese
          }
       }

}