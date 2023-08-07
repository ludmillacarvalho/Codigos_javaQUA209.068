package principal;

import java.util.Locale;
import java.util.Scanner;

public class MathELocale {

	public static void main(String[] args) {
		//Atalho para importar: crtl+shift+o
		
		final Locale ponto = new Locale("en", "us");
		Scanner leia = new Scanner (System.in);
		
		
	
		double altura = 0;
		double decimal = 10.333333;
		int numero = (int) decimal; 
		
		
		System.out.printf("Resultado: %.2f", decimal);
		altura = leia.useLocale(ponto).nextDouble();
		
		
		System.out.println("Resultado: " + (decimal + numero));
		
		
		System.out.println(Math.pow(2, 5));
		//pot�ncia
		
		System.out.println(Math.max(2, 10));
		//maior n�mero entre 2 n�meros vari�veis
		
		System.out.println(Math.min(2, 10));
		//menor n�mero entre 2 n�meros vari�veis
		
		System.out.println(Math.sqrt(16));
		//obter raiz quadradda
		
		System.out.println(Math.round(decimal));
		//arredondar n�meros
		
		System.out.println(Math.PI);
		// n�mero PI armazenado
		
		
        
		
		
		
		
		
		leia.close();
        
	}

}
