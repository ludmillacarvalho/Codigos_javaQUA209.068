package principal;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		
		//Faça um Programa que peça dois números e imprima a soma;
		
		Scanner leia = new Scanner (System.in);
		/*
		//int numero1;
		
		//int numero2;
		
		//leia.nextInt();
		
		System.out.println("Digite o primeiro número:");
		int numero1 = leia.nextInt();
		System.out.println("Digite o segundo número:");
		int numero2 = leia.nextInt();
		int soma = numero1 + numero2;
		System.out.println("Resultado: " + soma);
		*/
		
		//Faça um Programa que peça as 4 notas bimestrais e mostre a média;
		/*
		double nota1;
		double nota2;
	    double nota3;
		double nota4;
		
		System.out.println("Digite a nota do primeiro bimestre: ");
		nota1 = leia.nextDouble();
		System.out.println("Digite a nota do segundo bimestre: ");
		nota2 = leia.nextDouble();
		System.out.println("Digite a nota do terceiro bimestre: ");
		nota3 = leia.nextDouble();
		System.out.println("Digite a nota do quarto bimestre: ");
		nota4 = leia.nextDouble();
		
		double calculo = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.println("Sua média é: " + calculo);
		
		*/
		 
		
		/*
		//Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
		//  Calcule e mostre o total do seu salário no referido mês (sem descontos e impostos);
	  */
		
		
		double salario;
		double horas;
	
		
		
		System.out.print("Digite as horas trabalhadas no mês de Agosto: ");
		horas = leia.nextDouble();
		System.out.print("Digite o valor recebido por hora no mês de Agosto: ");
		salario = leia.nextDouble();
	    double salarioFinal = salario * horas; 
		System.out.println("Você recebeu um total de: " + salarioFinal +  " no mês de Agosto");
		
		
		/*
		 // Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		 C = 5 * ((F-32) / 9)
		 */
		 
		  double F;
		  double C;
		  
		  
		  System.out.println("Digite a temperatura em Fahrenheit: ");
		  F = leia.nextDouble();
		  C =  5*(F-32)/9;
		  System.out.println("Resultado em Celcius: " + C + "C");
		  
		  
		  /*
		   // Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		 */
		  
		double Celsius;
		double Fahrenheit;
		
		System.out.println("Digite a temperatura em Celsius: ");
		C = leia.nextDouble();
		F = C * 1.8 + 32;
		System.out.println("Resultado em Fahrenheit " + F);
		
		
		
		   
		  
	
		   
		  
		  
		  
		  
		  
		  
		  
		  
		  
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
		
	}

}
