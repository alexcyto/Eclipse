package FileWriter;

//importo las librer�as necesarias
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ej1 {
public static void main(String[] args) throws IOException {
FileWriter f=new FileWriter(new File("Actv1.txt")); //inicializo el filewriter en el archivo example.txt
f.write("<Libros><Libro><T�tulo>El capote</T�tulo></Libro></Libros>"); //le digo lo que tiene que escribir
f.close(); //lo cierro
}
}