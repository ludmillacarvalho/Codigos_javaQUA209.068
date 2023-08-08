package principal;

import java.util.Locale;
import java.util.Scanner;

public class Atividade_EstruturaCondicional {

	public static void main(String[] args) {
		
		
		final Locale ponto = new Locale("en", "us");
		Scanner leia = new  Scanner (System.in);
		
		//faça um programa que peça para o usuário entrar com um ano e dizer se esse ano é bissexto ou não.
		
		int ano;
		System.out.println("Digite o ano pra saber se é bissexto: ");
		ano = leia.nextInt();
		
		if (ano % 4 == 0 && ano % 100 !=0) {
			System.out.println("ano bissexto");
		} 
		else if ( ano % 400 == 0) {
			System.out.println(" ano bissexto.");
		}
		else {
			System.out.println("não é ano bissexto");
		}
		
		
		//faça um programa que entre com um número e indique se ele é ímpar ou par.
		
		int numero = 0;
		
		
		System.out.println("Digite um número:");
		numero=leia.nextInt();
		
		if (numero %2 == 0) {
			System.out.println("O número é par");
		}
		else {
			System.out.println("O número é ímpar");
		}
		
		
		//faça um programa que leia dois números e mostre o maior deles.
		
		int primeiroNumero = 0;
		int segundoNumero = 0;
		
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
		
		// system.out.println("Maior número é: " + Math.max(primeiroNumero, segundoNumero));
		
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
		
		
		

        if(numero1>numero2 && numero1>numero3){
        
        System.out.print("O maior é: "+numero1);
        }
        if (numero2>numero1 && numero2>numero3){
        
        System.out.print("O maior é: "+numero2);
        }
         if (numero3>numero1 && numero3>numero2){
         
         System.out.println("\n O maior número é: "+numero3);
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
        	 System.out.println("Aluno de recuperação! média:" + media);
         }else if (media > 7 && media <10) {
        	 System.out.println("Aluno aprovado! media: " + media);
         } else {
        	 System.out.println("Aluno aprovado com honras! media:" + media + " Parabéns seu merda, não fez mais que a sua obrigação!");
         }
         
         
         
         
         
         
         
         leia.close();  
		
		}
}
		
		
		

		
		
		
		
		
		
		
	
