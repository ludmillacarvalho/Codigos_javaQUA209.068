import java.util.Scanner;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		
		/* Uma estrutura de repetição repete 
		 * determinado bloco de código enquanto
		 *  uma condição for satisfeita 
		 */
		
		/* for = até; utilizado quando sabemos a quantidade de vezes que será necessário  repetir o bloco
		*/
		
		for(int contador = 0; contador < 10; contador++) {
		System.out.println("contador está valendo: " + contador); 
	}
		
		/* while= enquanto
		 * geralmente usado quando não sabemos a quantidade de vezes que será executado determinado comando
	
		 */
		
		
		Scanner leia = new Scanner (System.in);
		
		
		int contador = 0;
		char opcao;
		
		
		/*System.out.println("Deseja entrar no loop s/n:");
		opcao = leia.next().charAt(0);
		
		
		while(opcao =='S') {
			System.out.println("contador valendo: " + contador);
			contador++;
			System.out.println("Deseja entrar no loop s/n:");
			opcao = leia.next().charAt(0);
			
			
		}
		
		/*do while= executa pelo menos 1 vez
		 *  temos a garantia de que será executado ao menos uma vez
		 */
		
		do {
		System.out.println("Contador valendo:" + contador);
		contador++;
		System.out.println("Deseja continuar no loop: s/n");
		opcao= leia.next().charAt(0);
		} while (opcao == 's');
		
		
		
		
		leia.close();
}
	
	
	

}