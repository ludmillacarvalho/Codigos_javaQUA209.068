package principal;

public class PrintfEOperadores {

	public static void main(String[] args) {
		
		String nome = "Ludmilla carvalho";
		int idade = 31;
		double altura = 1.65;
		boolean verdadeiro = true;
		boolean falso = false;
		char opcao = 's';
	    int idade2 = 17;
		String diaSemana = "Sexta";
		int  diasSemana = 7;
		
		System.out.printf("%s, tem %d, e sua altura �: %.2f ", nome, idade, altura);
		//para o tipo char usa %c
		
		/* Operadores de compara��o
		 * > maior que
		 * < menor que
		 * >= maior ou igual a 
		 * <= menor ou igual a 
		 * != diferente
		 * == igual 
		 */

		/*Operadores l�gicos
		 * && significa E
		 * || significa OU
		 * ! significa Nega��o
		 */
		
		
		
		
	


      //bloco de execu��o condicional
	  //um �nico IF � uma estrutura simples
	  //if e else estrutura composta
	  //if e else � uma estrutura encadeada
	  //podemos ter estruturas dentro de cada if/if else

      if (verdadeiro) {
    	 System.out.println(10);
    	 
      }else {
    	  System.out.println(20);
      }
      
   
      
      
      
      if(opcao == 'S' && idade2 >=18) {
    	  System.out.println("pode entrar na festa");
    	  
      }else { 
    	  System.out.println("volta pra casa!");
     }
      
     if(diaSemana =="Segunda") {
    	 System.out.println("Segunda-feira");
    	 
     } else if (diaSemana =="terca") {
    	 System.out.println("Ter�a-feira");
    
     } else if(diaSemana =="Sexta") {
    	 System.out.println("Sexta-feira");
     
     } else {
    	 System.out.println("N�o corresponde a um dia da semana!");
     }
     

	
	switch (diasSemana) {
 case 1:
	System.out.println("Domingo");
	break;
	
case 2:
	System.out.println("Segunda");
	break;
	
case 3:
	System.out.println("Ter�a");
	break;
	
case 4:
	System.out.println("Quarta");
	break;
	
case 5:
	System.out.println("Quinta");
	break;
	
case 6:
	System.out.println("Sexta");
	break;
	
case 7:
	System.out.println("S�bado");
	break;
	
	default:
		System.out.println("N�o corresponde a um dia da semana");
   break; 	
	}


	}
}

	
  


      

