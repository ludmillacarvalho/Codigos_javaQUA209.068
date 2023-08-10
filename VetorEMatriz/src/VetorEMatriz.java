
public class VetorEMatriz {

	public static void main(String[] args) {


		//Vetor é uma sequencia nao ordenada de dados do mesmo tipo
		//a contagem do vetor é por indice e inicia do indice 0
		//vetor não pode conter dados de tipos diferentes 
		//vetor tb é conhecido como Array
		//vetor tb é unidimensional, uma direção 
		//os dados do array são armazenados em um espaço de memoria
		
		/* (xpto123) = 10,20,30,40 */
		
		int[]numeros = new int [5];
		int contador = 0;
		
		numeros[0]=10;
		numeros[1]=20;
		numeros[2]=30;
		numeros[3]=40;
		numeros[4]=50;
		
		System.out.println(numeros[0]);
		for(contador = 0; contador <5; contador ++) {
			System.out.println(("Dentro de for: " + numeros [contador]));
		
		}
		
		
		
		
		

	}

}
