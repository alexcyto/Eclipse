package PadreHijoEjemplo;

public class Sumador3 {
	
	public int sumar(int n1, int n2) {
		int resultado = 0;
		for(int i=n1;i<=n2;i++) {
			resultado = resultado +i;
		}
		return resultado;
		
	}

	public static void main(String[] args) {
		
		Sumador3 s = new Sumador3();
		int n1 = Integer.parseInt(args[0]);
		int n2 = Integer.parseInt(args[1]);
		int resultado = s.sumar(n1,n2);
		System.out.println(resultado);

	}

}
