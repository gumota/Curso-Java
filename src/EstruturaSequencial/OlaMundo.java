package EstruturaSequencial;

import java.util.Locale;

public class OlaMundo {

	public static void main(String[] args) {

//		int y = 32;
		double x = 19.74638;
		

		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x);
		
		System.out.println("Resultado = " + x + " METROS");
		System.out.printf("Resultado = %.4f METROS", x);
		
//		System.out.println("Olá Mundo");
//		System.out.println("Bom dia");
//		System.out.println(y);
	}

}
