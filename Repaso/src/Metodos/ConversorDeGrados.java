package Metodos;

public class ConversorDeGrados {
	
	public static void Centigrados_a_Farenheit(int grados_centigrados) {
		int formula = 32 + ( 9 * grados_centigrados / 5);
		System.out.println(grados_centigrados + "�C = "  + formula + "�F");
		
	}

	public static void main(String[] args) {
		
		Centigrados_a_Farenheit(30);
	}

}
