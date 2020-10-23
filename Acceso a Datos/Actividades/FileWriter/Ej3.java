package FileWriter;

//Dissenya  un programa que escrigui els primers 100 nombres natural en un fitxer de text.

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ej3 {
	
public static void main(String[] args) throws IOException {
	
FileWriter f=new FileWriter(new File("Ej2.txt"));

for(int i=0;i<=100; i = i+1) {
	f.write(i + " " );
}
f.close();
}
}

