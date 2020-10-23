package InputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream{
public static void main(String[] args) throws IOException {
FileInputStream f;
f=new FileInputStream(new File("example_fo.txt"));
int data=f.read();
while(data != -1) {
System.out.print((char)data);
System.out.print("-");
data=f.read();
}
}
}

//se usa para leer bytes de forma secuencial