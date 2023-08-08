import java.util.Scanner;

public class AtividadeEstruturaDeRepeticao {

	public static void main(String[] args) {
		
     Scanner leia = new Scanner (System.in);
     
     /*Faça um programa que peça uma nota, entre 0 e 10.
      * Mostre uma mensagem caso o valor seja inválido e continue
      * pedindo até que o usuário informe o valor válido.
     
     */
     
        int contador = 0;
        int nota;
        char opcao;
        
       
        
        
        do {System.out.println(" Digite a nota: ");
        nota = leia.nextInt();
        }
        while (nota < 0 || nota  > 10 );
        
        
        /* Faça um programa que imprima na tela os números de 1 a 20, um abaixo do outro
         * Depois modifique o programa para que ele mostre os números um ao lado do outro
         */
       
        
        
       
        
        for( contador = 0; contador <= 20; contador++) {
        	System.out.print( contador + "  ");
        	
        }
        
        /* Faça um programa que imprima na tela apenas os números 
         * ímpares entre 1 e 50
         */
        
        for (nota= 1; nota <= 50; nota ++ ) {
       if (nota % 2 != 0 ) {
    	   System.out.println(nota + "  ");
       }
        	    }
        
        
        
        	
        	
        	
        	
    
    	
    	
     

	}

}
