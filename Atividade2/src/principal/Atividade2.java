package principal;

import java.util.Locale;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
	
		final Locale ponto = new Locale("en", "us");
		Scanner leia = new Scanner (System.in);
		
		
		
		
		System.out.print("Digite um n�mero: ");
		int numero = leia.nextInt();
		System.out.println("O n�mero informado foi: " + numero);
		
		
		
		
		
		
		leia.close();
		
		

	}

}
