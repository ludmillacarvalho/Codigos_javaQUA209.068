package principal;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		
		//Fa�a um Programa que pe�a dois n�meros e imprima a soma;
		
		Scanner leia = new Scanner (System.in);
		/*
		//int numero1;
		
		//int numero2;
		
		//leia.nextInt();
		
		System.out.println("Digite o primeiro n�mero:");
		int numero1 = leia.nextInt();
		System.out.println("Digite o segundo n�mero:");
		int numero2 = leia.nextInt();
		int soma = numero1 + numero2;
		System.out.println("Resultado: " + soma);
		*/
		
		//Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia;
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
		System.out.println("Sua m�dia �: " + calculo);
		
		*/
		 
		
		/*
		//Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s.
		//  Calcule e mostre o total do seu sal�rio no referido m�s (sem descontos e impostos);
	  */
		
		
		double salario;
		double horas;
	
		
		
		System.out.print("Digite as horas trabalhadas no m�s de Agosto: ");
		horas = leia.nextDouble();
		System.out.print("Digite o valor recebido por hora no m�s de Agosto: ");
		salario = leia.nextDouble();
	    double salarioFinal = salario * horas; 
		System.out.println("Voc� recebeu um total de: " + salarioFinal +  " no m�s de Agosto");
		
		
		/*
		 // Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		 C = 5 * ((F-32) / 9)
		 */
		 
		  double F;
		  double C;
		  
		  
		  System.out.println("Digite a temperatura em Fahrenheit: ");
		  F = leia.nextDouble();
		  C =  5*(F-32)/9;
		  System.out.println("Resultado em Celcius: " + C + "C");
		  
		  
		  /*
		   // Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
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
