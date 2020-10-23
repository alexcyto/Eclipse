package FileWriter;

import java.io.*;
import java.util.Scanner;

//Escriviu un m�tode que rebi un array de cadenes de car�cters i escrigui el seu contingut 
//a un arxiu que el seu nom tamb� es rebr� per par�metre. Les cadenes quedaran separades en l'arxiu por un asterisc

public class Ej5 {

     // M�todo
     public static void escribeArray(String[] palabras, String nombre){
          // Propiedades
          FileWriter fich = null;
         
          // C�digo
          try{
                fich = new FileWriter(nombre);
                for(int i = 0; i < palabras.length; i++){
                     fich.write(palabras[i]);
                     // Condicion que evita insertar un * al final del todo
                     if (i + 1 != palabras.length)
                          fich.write("*");
                }
                // Muestra por pantalla proceso finalizado
                System.out.println("Palabras insertadas correctamente");
          }
          catch(IOException e){
                e.printStackTrace();
          }
          finally{
                try{
                     fich.close();
                }
                catch(IOException e){
                     e.printStackTrace();
                }
          }
     }
    
     public static void main(String[] args) {

          // C�digo de prueba ya que el ejercicio solo pide el m�todo
          String[] palabras = new String[]{"Uno", "Dos", "Tres"};
          escribeArray(palabras, "pruebaArrays.txt");
     }
}