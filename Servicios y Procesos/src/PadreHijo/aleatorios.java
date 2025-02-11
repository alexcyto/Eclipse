/*
 * PruebaRuntime.java
 *
 * Created on 17 de abril de 2005, 15:43
 */

package PadreHijo;

import java.io.*;
import java.util.Scanner;

/**
 * Ejemplo simple de arranque de un programa externo desde java.
 * @author  Chuidiang
 */
public class aleatorios {
	
	Scanner sc = new Scanner(System.in);
    
    /** Creates a new instance of PruebaRuntime */
    public aleatorios() 
    {
        try
        {
            // Se lanza el ejecutable.
            Process p=Runtime.getRuntime().exec ("C:\\Users\\PC\\Desktop\\aleatorios");
            
            // Se obtiene el stream de salida del programa
            InputStream is = p.getInputStream();
            
            /* Se prepara un bufferedReader para poder leer la salida m�s comodamente. */
            BufferedReader br = new BufferedReader (new InputStreamReader (is));
            
            // Se lee la primera linea
            String aux = br.readLine();
            
            // Mientras se haya leido alguna linea
            while (aux!=null){
                // Se escribe la linea en pantalla
                System.out.println (aux);
                
                // y se lee la siguiente.
                aux = br.readLine();
            }
            
            
            
        } 
        catch (Exception e)
        {
            // Excepciones si hay alg�n problema al arrancar el ejecutable o al leer su salida.*/
            e.printStackTrace();
        }
    }
    
    /**
     * Crea la clase principal que ejecuta el comando dir y escribe en pantalla
     * lo que devuelve dicho comando.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new aleatorios();
    }
}

