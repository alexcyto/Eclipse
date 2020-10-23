package PadreHijoEjemplo;

import java.io.File;

public class LanzadorProceso{
	
	public void lanzarSumador(Integer n1, Integer n2, String fichResultado) {
		String clase="C:\\Users\\jmari\\eclipse-workspace\\Servicios y Procesos\\src\\PadreHijo\\Sumador3.java";
		ProcessBuilder pb;
		try {
			pb = new ProcessBuilder("java",clase, n1.toString(), n2.toString());
			pb.redirectError(new File("errores.txt"));
			pb.redirectOutput(new File(fichResultado));
			pb.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		
		LanzadorProceso l = new LanzadorProceso();
		l.lanzarSumador(1, 5, "resultado1.txt");
		l.lanzarSumador(6, 10, "resultado2.txt");
		
		}

	}


