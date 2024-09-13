package exercicios;

import java.util.Scanner;

public class Exercicio05_continuação {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite duas palavras: ");
		String palavra1 = leia.nextLine();
		String palavra2 = leia.nextLine();

		
		System.out.println(Exercicio05.comparandoStrings(palavra1, palavra2));
		//boolean palavras = Exercicio05.comparandoStrings("palavra1", "palavra2");
		leia.close();
	}

}
