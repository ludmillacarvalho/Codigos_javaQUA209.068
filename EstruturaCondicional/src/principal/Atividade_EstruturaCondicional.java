package principal;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_EstruturaCondicional {

	public static void main(String[] args) {
		
		
		final Locale ponto = new Locale("en", "us");
		Scanner leia = new  Scanner (System.in);
		
		//fa�a um programa que pe�a para o usu�rio entrar com um ano e dizer se esse ano � bissexto ou n�o.
		
		int ano;
		System.out.println("Digite o ano pra saber se � bissexto: ");
		ano = leia.nextInt();
		
		if (ano % 4 == 0 && ano % 100 !=0) {
			System.out.println("ano bissexto");
		} 
		else if ( ano % 400 == 0) {
			System.out.println(" ano bissexto.");
		}
		else {
			System.out.println("n�o � ano bissexto");
		}
		
		
		//fa�a um programa que entre com um n�mero e indique se ele � �mpar ou par.
		
		int numero = 0;
		
		
		System.out.println("Digite um n�mero:");
		numero=leia.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("O n�mero � par");
		}
		else {
			System.out.println("O n�mero � �mpar");
		}
		
		
		//fa�a um programa que leia dois n�meros e mostre o maior deles.
		
		int primeiroNumero = 0;
		int segundoNumero = 0;
		
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
		
		// system.out.println("Maior n�mero �: " + Math.max(primeiroNumero, segundoNumero));
		
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
		
		
		

        if(numero1>numero2 && numero1>numero3){
        
        System.out.print("O maior �: "+numero1);
        }
        if (numero2>numero1 && numero2>numero3){
        
        System.out.print("O maior �: "+numero2);
        }
         if (numero3>numero1 && numero3>numero2){
         
         System.out.println("\n O maior n�mero �: "+numero3);
         }
         
         
         
         // exercicio 5
         
         char sexo;
        
         System.out.println("Digite o sexo (m/f): ");
         sexo=leia.next().charAt(0);
         
         if(sexo == 'm') {
        	 System.out.println("o sexo digitado foi masculino " + sexo);
         }else {
        	 System.out.println("\n h o sexo digitado foi feminino " + sexo);
         }
         
 
         
         //exercicio 6
         
         double nota1 = 0;
         double nota2 = 0;
         double nota3 = 0;
         double nota4 = 0;
         double media = 0;
         
         System.out.println("Entre com a primeira nota: ");
         nota1 = leia.nextDouble();
         
         System.out.println("Entre com a segunda nota: ");
         nota2 =leia.nextDouble();
         
         System.out.println("Entre com a terceira nota: ");
         nota3 = leia.nextDouble();
         
         System.out.println("Entre com a quarta nota: ");
         nota4 = leia.nextDouble();
         
         media = (nota1 + nota2 + nota3 + nota4) / 4;
          
         if (media < 6) {
        	 System.out.println("Aluno reprovado");
         } else if (media >= 6 && media < 7) {
        	 System.out.println("Aluno de recupera��o! m�dia:" + media);
         }else if (media > 7 && media <10) {
        	 System.out.println("Aluno aprovado! media: " + media);
         } else {
        	 System.out.println("Aluno aprovado com honras! media:" + media + " Parab�ns seu merda, n�o fez mais que a sua obriga��o!");
         }
         
         
         
         
         
         
         
         leia.close();  
		
		}
}
		
		
		

		
		
		
		
		
		
		
	
