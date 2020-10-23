package RandomAccessFile;

import java.io.File;
import java.io.RandomAccessFile;
import java.io.IOException;

public class RandomAccessFileEx{
public static void main(String[] args) throws IOException {
RandomAccessFile f;
f=new RandomAccessFile(new File("example.txt"),"rw");
f.seek(5); //posición en la que empieza, aqui es despues de 5 letras
f.write("CHANGE_TXT".getBytes()); // Esto es lo que se escribirá
byte[] bytes = new byte[8];
f.read(bytes); // Read
f.close();
}
}

//sirve para leer y escribir a la vez