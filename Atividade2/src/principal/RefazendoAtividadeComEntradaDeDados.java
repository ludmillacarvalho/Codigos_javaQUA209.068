package principal;

import java.util.Scanner;

public class RefazendoAtividadeComEntradaDeDados {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		
		
		System.out.print("Digite o primeiro n�mero: ");
		int numero1 = leia.nextInt();
		
		
		System.out.print("Digite o segundo n�mero: ");
		int numero2 = leia.nextInt();
		
		
		System.out.print("Digite o nome: ");
		String nome = leia.nextLine();
		leia.nextLine();
	
		
		System.out.print("Digite uma op��o de letra: ");
		char opcaoDeLetra  = leia.next().charAt(0);
	
		System.out.print("Digite o primeiro nome: ");
		String primeiroNome = leia.nextLine();
		leia.nextLine();
		
		System.out.print("Digite o segundo nome : ");
		String segundoNome = leia.nextLine();
		
		
		
		System.out.println("O n�mero digitado foi: " + numero1);
		System.out.println("O n�mero digitado foi: " + numero2);
		System.out.println("O nome digitado foi: " + nome);
		System.out.println("A op��o digitada foi : " + opcaoDeLetra);
		System.out.println("O primeiro nome digitado foi: " + primeiroNome);
		System.out.println("O segundo nome digitado foi: " + segundoNome);
		
		
		
		
		
		leia.close();
		

	}

};
