package MétodosBásicos;

import java.io.File;

public class MétodosBásicos {
	
public static void main(String[] args) {
	File f=new File("ejemplo1.txt"); //hay que crear un archivo que se llame así en la ubicación del proyecto, (Teoría), 
									 //sí esta bien pondrá que existira exist=true
	System.out.println("Name: "+f.getName());
	System.out.println("Exist: "+f.exists());
	System.out.println("Relative path: "+f.getPath());
	System.out.println("Absolute path: "+f.getAbsolutePath());
}
}

//otros métodos:

//getName()
//- getParent()
//- getPath()
//- getAbsolutePath()
//- isFile()
//- renameTo(File dest)
//- delete()


//getName()
//- listFiles()
//- mkdir()
//- delete()
//- exists()