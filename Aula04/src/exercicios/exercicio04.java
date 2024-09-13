package exercicios;

import java.util.Scanner;

public class exercicio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite quantos números inteiro você quer: ");
		int N = leia.nextInt();
		int[] vetor = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o " + (i + 1) + " º número: ");
			vetor[i] = leia.nextInt();
		}
		int numerosPares = 0;
		System.out.println("Números pares: ");
		for (int i = 0; i < N; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.println(vetor[i]);
				numerosPares++;

			}

		}
		System.out.println("A quantidade de números pares é: " + numerosPares);
		leia.close();
	}

}
