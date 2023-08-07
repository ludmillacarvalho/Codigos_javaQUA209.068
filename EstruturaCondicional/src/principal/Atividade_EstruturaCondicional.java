package principal;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_EstruturaCondicional {

	public static void main(String[] args) {
		
		
		final Locale ponto = new Locale("en", "us");
		Scanner leia = new  Scanner (System.in);
		
		//faça um programa que peça para o usuário entrar com um ano e dizer se esse ano é bissexto ou não.
		
		int ano;
		System.out.println("Digite o ano: ");
		ano = leia.nextInt();
		
		if (ano == ano/4) {
			System.out.println("ano bissexto");
		} else {
			System.out.println("não é ano bissexto.");
		}
		
		
		//faça um programa que entre com um número e indique se ele é ímpar ou par.
		
		int numero;
		
		
		System.out.println("Digite um número:");
		numero=leia.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
		
		
		//faça um programa que leia dois números e mostre o maior deles.
		
		int primeiroNumero;
		int segundoNumero;
		
		System.out.println("Digite o primeiro número:");
		primeiroNumero = leia.nextInt();
		
		System.out.println("Digite o segundo número:");
		segundoNumero = leia.nextInt();
		
		if (primeiroNumero > segundoNumero) {
			System.out.println("Número 1 é maior.");
		}
		else {
			System.out.println("Número 2 é maior");
			
		}
		
		//faça um programa que leia 3 números e mostre o maior deles
		
		int numero1;
		int numero2;
		int numero3;
		
		System.out.println("Digite o primeiro número: ");
		numero1=leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		numero2=leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		numero3=leia.nextInt();
		
		
		

        if((numero1>numero2) && (numero1>numero3))
        {
        System.out.print("O maior é: "+numero1);
        }
        if ((numero2>numero3) && (numero2>numero1))
        {
        System.out.print("O maior é: "+numero2);
        }
         if ((numero3>numero1) && (numero3>numero2))
         {
         System.out.print("O maior é: "+numero3);
         }
         
         
         leia.close();  
		
		}
}
		
		
		

		
		
		
		
		
		
		
	
