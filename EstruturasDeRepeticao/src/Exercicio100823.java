import java.util.Scanner;

public class Exercicio100823 {

	public static void main(String[] args) {
		/* Fa�a um programa que receba um operador (+,-,/,*)
		 * e um n�mero e mostre a tabuada conforme os dados
		 * de entrada(numero nao pode ser maior que 10 e nem menor que 0)
		 */
		
		
		Scanner sc = new Scanner (System.in);
		int contador =0;
		char operacao;
		int numero = 0;
		
		System.out.println("Qual o tipo da opera��o (+, -, /, *)");
		operacao=sc.next().charAt(0);
		
		System.out.println("Qual o n�mero que deseja realizar a tabuada?");
		numero = sc.nextInt();
		
		switch (operacao) {
		case '+':
		for (contador =1; contador <=10; contador ++) {
			System.out.println(numero + "+" + contador + "=" + ( contador + numero));
			} 
		break;
		
		case '-':
			int aux = numero;
			for(contador =1; contador <=10; contador ++) {
				System.out.println((aux + contador) + "-" +  numero + "=" + ((aux +contador )- numero));
			
	
		}
			break;
		
				
		
		
		

	}

}
}
