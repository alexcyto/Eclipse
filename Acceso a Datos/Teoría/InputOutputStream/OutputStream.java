package InputOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStream {
public static void main(String[] args) throws IOException {
	FileOutputStream f;
	f=new FileOutputStream(new File("example_fo.txt"));
	String text = "This is the text to write.";
	byte[] bytes = text.getBytes();
	f.write(bytes);
	f.close();
}
}

//Se usa para escribir bytes de forma secuencial pero toma todo lo que le pongamos como un String