package exercicios;

import java.util.Scanner;

public class Exercicio06_continuação {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número para saber o seu fatorial: ");
		int fatorial = leia.nextInt();
		//System.out.printf("Fatorial de %d é: %d%n",fatorial, Exercicio06.fatorial(fatorial)); FORMATAÇÃO DETALHADA
		System.out.println("Fatorial de " + fatorial + " é: " + Exercicio06.fatorial(fatorial)); // FORMATAÇÃO SIMPLES
		leia.close();
	}

}
