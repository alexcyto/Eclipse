package M�todosB�sicos;

import java.io.File;

public class M�todosB�sicos {
	
public static void main(String[] args) {
	File f=new File("ejemplo1.txt"); //hay que crear un archivo que se llame as� en la ubicaci�n del proyecto, (Teor�a), 
									 //s� esta bien pondr� que existira exist=true
	System.out.println("Name: "+f.getName());
	System.out.println("Exist: "+f.exists());
	System.out.println("Relative path: "+f.getPath());
	System.out.println("Absolute path: "+f.getAbsolutePath());
}
}

//otros m�todos:

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