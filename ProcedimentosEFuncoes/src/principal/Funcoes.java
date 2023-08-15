package principal;

public class Funcoes {

	public static void main(String[] args) {
     
		/* Funcoes representam um processamento ou processo;
		 * o que identifica uma fun��o s�o os parenteses
		 * System.out.println() � um exemplo de funcao/procedimento
		 */

		mostrarMensagem();
		mostrarMensagemComParametro(18);
		int recebeCalcular = calcular(50,40);
		System.out.println("Recebeu: " + recebeCalcular);
		
	
	}
	static void mostrarMensagem() {
		System.out.println("Minha primeira fun��o");
	}
    
	static void mostrarMensagemComParametro (int idade) {
		System.out.println("Minha idade �: " + idade);
	}

    static int calcular(int x, int y) {
    	
    	return x + y;
    } 
    
    }
    

