package principal;

public class Variaveis {

	public static void main(String[] args) {
		
		int numero = 10; 
		//numero = 10;
		double decimal = 10.50;
		
		int testeNumero = (int) 50.25;
		//(int)converte o decimal em inteiro
		double testeNovoNumero = 10;
		
		String nome = "Ludmilla Carvalho";
		// armazenar conjunto de caracteres na variavel nome usando aspas duplas
		char sexo = 'F';
		// se quiser armazenar apensa uma letra � o tipo (char) usando aspas simples
		
		boolean verdadeiro = true;
		boolean falso = false; 
		
		double peso = 55.00;
		int idade = 31;
		
		
		
		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(testeNumero);
		System.out.println(testeNovoNumero);
		System.out.println(sexo);
		System.out.println(nome);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.print("Nome:");
		System.out.println("Ludmilla Carvalho");
		System.out.println("********************");
		System.out.print("Meu nome � "   + nome + ", minha idade � "  + idade + " e meu peso � " + peso +" kilos.");
		
		
		

	}

}
