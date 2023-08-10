import java.util.Scanner;

public class ExercicioMatriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Faça um programa que mostre os indices de um array de 100 posiçoes;
		
		int[]array = new int [100];
		int contador = 0;
		
		System.out.println(array[0]);
		for(contador = 0; contador <array.length; contador ++) {
			System.out.println(("Dentro de for: " + contador));

	}

	 //Faça um programa que peça quantidade x de nomes e mostre os nomes inseridos;
		
	  
	   int quantidade = 0;
	   
	   
	   System.out.println("Digite quantos nomes deseja cadastrar:");
	   quantidade = sc.nextInt();
	   sc.nextLine();
	   
	   String[] nome = new String[quantidade];
	   
	   for (contador =0; contador < nome.length; contador ++) {
	   System.out.println("Digite o nome: ");
	   nome[contador]= sc.nextLine();
	   
	}
	
	
	//Faça um programa que receba o nome do aluno e as 4 notas bimestrais desse aluno
   //e mostre a media se foi aprovado (>=7) ou reprovado (<7)
	   
	   
	   double nota1;
	   double nota2;
	   double nota3;
	   double nota4;
	   String nomeAluno;
	   double media;
	   
	   System.out.println("Digite o nome do aluno: ");
	   nomeAluno=sc.nextLine();
	   System.out.println("Digite a nota do primeiro bimestre: ");
	   nota1=sc.nextDouble();
	   System.out.println("Digite a nota do segundo bimestre ");
	   nota2=sc.nextDouble();
	   System.out.println("Digite a nota do terceiro bimestre ");
	   nota3=sc.nextDouble();
	   System.out.println("Digite a nota do quarto bimestre ");
	   nota4=sc.nextDouble();
	   media = (nota1 + nota2 + nota3 + nota4) / 4;
	  
	   
	   if (media >=7) {
		  System.out.println("Sua média é: " + media);
		   System.out.println("Aluno aprovado!");
	  } else {
		  
		  if (media <7) {
			  System.out.println("Sua média é: " + media);
			  System.out.println("Aluno reprovado!");
		  }
		  }
	  }
	   
	//
}


