package Metodos;
 

//Longitud de la circunferencia = 2*PI*Radio,
//Area de la circunferencia = PI*Radio^2 

public class RadioAreaCircunferencia {
	
	public static void areaC(int radio) {
		double formula = Math.pow((Math.PI * radio), 2);
		System.out.println("El area de este circulo es " + formula);
		
	}
	
	public static void longitudC(int radio) {
		double formula = 2*Math.PI*radio;
		System.out.println("La longitud de este circulo es " + formula);
	}

	public static void main(String[] args) {
		
		areaC(5);
		longitudC(5);

	}

}
