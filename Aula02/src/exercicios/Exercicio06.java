package exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Primeira nota");
		int nota1 = leia.nextInt();

		System.out.println("Segunda nota");
		int nota2 = leia.nextInt();

		System.out.println("Terceira nota");
		int nota3 = leia.nextInt();

		int media = (nota1 + nota2 + nota3) / 3;

		if (media >= 7) {
			System.out.println("Aprovado");
		} else
			System.out.println("Reprovado");
		leia.close();
	}

}
