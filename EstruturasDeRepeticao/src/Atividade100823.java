import java.util.Scanner;

public class Atividade100823 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		 
		
		double altura = 0;
		double media = 0;
		int contador = 0;
		
		for(contador =1; contador < 11; contador ++) {
			System.out.println("Digite a altura: ");
			altura=sc.nextDouble();
			media=media + altura;
			
			
		}
			System.out.println("A média das alturas é: "+ media/10);
		
		
		
		sc.close();
		
	
		
				

	}

}
