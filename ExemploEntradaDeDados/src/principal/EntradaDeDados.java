package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		
		
		//leitura de dados tipo String (conjunto de caracteres)
		
		System.out.print("Por favor, digite seu nome: ");
		String nome = leia.nextLine();
		System.out.print("Digite a sua idade: ");	
		int idade = leia.nextInt();
		System.out.print("Digite sua altura: "); 
		double altura = leia.nextDouble();
		System.out.print("Qual o sexo (m/f): ");
		char sexo = leia.next().charAt(0);
		
		System.out.println("O nome digitado foi :  " + nome); 
		System.out.println("A idade digitada foi: " + idade); 
		System.out.println("A altura digitada foi:" + altura);
		System.out.println("O sexo digitado foi: " + sexo);
		
		
		
		
		
		
		
		
		leia.close();
		
		

	}

}
