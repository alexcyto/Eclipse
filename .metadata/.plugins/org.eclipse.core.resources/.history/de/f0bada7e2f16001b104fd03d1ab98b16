package Metodos;

/*1) Crea una aplicaci�n que nos calcule el �rea de un circulo, 
 * cuadrado o triangulo.
 * 
 *   Crea un m�todo por cada figura para 
 *   calcular cada �rea, este devolver� un n�mero real.

Aqu� te mostramos que necesita cada figura:

Circulo: (radio^2)*PI
Triangulo: (base * altura) / 2
Cuadrado: lado * lado
*/



import java.util.Scanner;

public class Ej1 {
	
	public static double areaCirculo(double radio) {
		double resultado = Math.pow(radio, 2) * Math.PI;
		System.out.println("El area es: " + resultado);
		return resultado;
	}
	
	public static double areaTriangulo(double base, double altura) {
		double resultado = ((base * altura)/2);
		System.out.println("El area es: " + resultado);
		return resultado;
	}
	
	public static double areaCuadrado(double lado1, double lado2) {
		double resultado = (lado1 * lado2);
		System.out.println("El area es: " + resultado);
		return resultado;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que are quieres calcular? triangulo/circulo/cuadrado");
		String pregunta = sc.next();
		
		switch(pregunta) {
		case "triangulo":
			System.out.println("Introduce la base y la altura");
			areaTriangulo(sc.nextDouble(), sc.nextDouble());
			break;
		case "cuadrado":
			System.out.println("Introduce el lado1 y el lado2");
			areaCuadrado(sc.nextDouble(), sc.nextDouble());
			break;
		case "circulo":
			System.out.println("Introduce el r�dio del circulo");
			areaCirculo(sc.nextDouble());
			break;
		default:
			System.out.println("Error");		
		}
		System.out.println("Fin");

	}
	
	

}
