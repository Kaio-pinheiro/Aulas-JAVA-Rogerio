package aulas;

import java.util.Scanner;

public class exercicio04_ex05 {

	public static void main(String[] args) {

		/*
		 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N =
		 * N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição, fatorial
		 * de 0 é 1.
		 */
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int N = leia.nextInt();
		int fatorial = N;

		for (int i = 1; i < N; i++) {
			fatorial = fatorial * i;
			System.out.println(fatorial);
		}
		leia.close();
	}

}
