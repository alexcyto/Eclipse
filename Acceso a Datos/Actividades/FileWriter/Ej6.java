package FileWriter;


import java.io.FileWriter;
import java.io.IOException;

public class Ej6{
	
	public static void main(String[] args) throws IOException {
		
	    String[] caracteres = {"Hola", "Fistro", "que", "tal", ":)"};
		String archivo = "Actv3.txt";
		cadena(caracteres, archivo);
			
		}
	
	public static void cadena(String[] caracteres, String archivo) throws IOException{
		
	    FileWriter f = new FileWriter(archivo);
	    for(int i = 0; i < caracteres.length; i++) {
	    	f.write(caracteres[i]);
	    	
	    	if (i + 1 != caracteres.length) {
	    		f.write("*");
	    	}
	    }
	    f.close();
	}
	
}
