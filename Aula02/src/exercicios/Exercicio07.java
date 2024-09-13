package exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um letra do alfabeto: ");
		String letra = leia.nextLine();
		
		if (letra.equals("a") || letra.equals("e") || letra.equals("i") || letra.equals("o") || letra.equals("u"))  {
			System.out.println("É uma vogal");
		} else 
			System.out.println("É uma consoante");
		
		leia.close();
		
		//MESMA FUNÇÃO COM O CODIGO MAIS LIMPO
		
		// System.out.println("digite uma letra: ");
		// String letra = leia.nextLine().toLowerCase();
		
		// String vogais = "aeiou";
		// if (vogais.contains(letra)) {
		//	System.out.println("é uma vogal");
		//}
		//else {
		//	System.out.println("É uma consoante");
		//}
	}

}
