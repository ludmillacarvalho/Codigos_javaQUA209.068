package principal;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_EstruturaCondicional {

	public static void main(String[] args) {
		
		
		final Locale ponto = new Locale("en", "us");
		Scanner leia = new  Scanner (System.in);
		
		//fa�a um programa que pe�a para o usu�rio entrar com um ano e dizer se esse ano � bissexto ou n�o.
		
		int ano;
		System.out.println("Digite o ano: ");
		ano = leia.nextInt();
		
		if (ano == ano/4) {
			System.out.println("ano bissexto");
		} else {
			System.out.println("n�o � ano bissexto.");
		}
		
		
		//fa�a um programa que entre com um n�mero e indique se ele � �mpar ou par.
		
		int numero;
		
		
		System.out.println("Digite um n�mero:");
		numero=leia.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("O n�mero � par");
		}
		else {
			System.out.println("O n�mero � �mpar");
		}
		
		
		//fa�a um programa que leia dois n�meros e mostre o maior deles.
		
		int primeiroNumero;
		int segundoNumero;
		
		System.out.println("Digite o primeiro n�mero:");
		primeiroNumero = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero:");
		segundoNumero = leia.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			System.out.println("N�mero 1 � maior.");
		}
		else {
			System.out.println("N�mero 2 � maior");
			
		}
		
		//fa�a um programa que leia 3 n�meros e mostre o maior deles
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Digite o primeiro n�mero: ");
		numero1=leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		numero2=leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		numero3=leia.nextInt();
		
		
		

        if((numero1>numero2) && (numero1>numero3))
        {
        System.out.print("O maior �: "+numero1);
        }
        if ((numero2>numero3) && (numero2>numero1))
        {
        System.out.print("O maior �: "+numero2);
        }
         if ((numero3>numero1) && (numero3>numero2))
         {
         System.out.print("O maior �: "+numero3);
         }
         
         
         leia.close();  
		
		}
}
		
		
		

		
		
		
		
		
		
		
	
