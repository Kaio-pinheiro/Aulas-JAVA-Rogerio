package exemplos;

import java.util.Scanner;

public class Programa04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o tamanho do vetor: ");
		int N = leia.nextInt();
		double[] vetor = new double[N];

		for (int i = 0; i < N; i++) {
			System.out.println("Digite o " + (i + 1) + "º número do vetor: ");
			vetor[i] = leia.nextDouble();

			if (vetor[i] < 0) {
				System.out.println("O numero negativo está na posição " + i + " do vetor.");

			}

		}
		leia.close();
	}

}
