import java.util.Scanner;

public class AtividadeEstruturaDeRepeticao {

	public static void main(String[] args) {
		
     Scanner sc = new Scanner (System.in);
     
     /*Fa�a um programa que pe�a uma nota, entre 0 e 10.
      * Mostre uma mensagem caso o valor seja inv�lido e continue
      * pedindo at� que o usu�rio informe o valor v�lido.
     
     */
     
        int contador = 0;
        int nota;
        char opcao;
        
       
        
        
        System.out.println(" Digite uma nota entre 0 e 10: ");
        nota = sc.nextInt();
        
        while (nota <= 0 || nota  >= 10 ) {
        System.out.println("Nota inv�lida");
         System.out.println("Digite uma nota entre 0 e 10: ");
         nota= sc.nextInt();
        } 
        
        
        
        /* Fa�a um programa que imprima na tela os n�meros de 1 a 20, um abaixo do outro
         * Depois modifique o programa para que ele mostre os n�meros um ao lado do outro
         */
       
        
        
       
        
        for( contador = 1; contador < 21; contador++) {
        	System.out.println( contador);
        	
        }
        for(contador = 1; contador < 21; contador ++) {
        	System.out.print("  " + contador );
        }
        
       
        
        
        /* Fa�a um programa que imprima na tela apenas os n�meros 
         * �mpares entre 1 e 50
         */
        
        for ( nota= 1; nota <= 50; nota ++ ) {
        	if (nota % 2 != 0 ) {
    	   System.out.println("   " + nota);
       }
        	    }
        
        /* contador += 2;
         * contador -= 2;
         * contador *= 2;
         * contador /= 2;
         * contador %= 2;
         * a++ � incrementado ap�s a execu��o da linha;
         * ++a � incrementado antes a execu��o da linha;
         * 
         */
        
        
        	
        	
        	
    
    	sc.close();
    	
     

	}

}
