package FileWriter;

//importo las librerías necesarias
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ej2 {
public static void main(String[] args) throws IOException {
FileWriter f=new FileWriter(new File("Actv2.txt")); //inicializo el filewriter en el archivo Actv2.txt
f.write("<libros>\r\n"
		+ "	<libro publicado_en=\"1605\">\r\n"
		+ "		<autor>Cerbantes</autor>\r\n"
		+ "		<texto>hola</texto>\r\n"
		+ "	</libro>\r\n"
		+ "\r\n"
		+ "	<libro publicado_en=\"1943\">\r\n"
		+ "		<autor>Antoine de Saint-Exupéry</autor>\r\n"
		+ "		<texto>adiós</texto>	\r\n"
		+ "	</libro>\r\n"
		+ "	\r\n"
		+ "	<libro publicado_en=\"1995\">\r\n"
		+ "		<autor>Carlos Ruiz Zafón</autor>\r\n"
		+ "		<texto>hasta luego</texto>	\r\n"
		+ "	</libro>\r\n"
		+ "</libros>"); //le digo lo que tiene que escribir
f.close(); //lo cierro
}
}