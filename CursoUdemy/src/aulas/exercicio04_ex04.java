package aulas;

import java.util.Scanner;

public class exercicio04_ex04 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel".
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite quantos números você quer dividir: ");
		int N = leia.nextInt();

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o " + (i + 1) + " º número:");
			int a = leia.nextInt();
			int b = leia.nextInt();
			if (b == 0) {
				System.out.println("Divisão impossivel");
			} else {
				double resposta = (double) a / b;
				System.out.println(resposta);
			}
		}
		leia.close();
	}

}
