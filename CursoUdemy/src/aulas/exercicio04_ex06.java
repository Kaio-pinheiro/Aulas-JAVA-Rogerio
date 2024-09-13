package aulas;

import java.util.Scanner;

public class exercicio04_ex06 {

	public static void main(String[] args) {

		// Ler um número inteiro N e calcular todos os seus divisores.

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int N = leia.nextInt();

		for (int i = 1; i <= N; i++) {
			if (N % i == 0) {
				System.out.println(i);
			}
		}
		leia.close();
	}

}
