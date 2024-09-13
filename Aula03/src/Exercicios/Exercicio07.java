package Exercicios;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um valor : ");
		int N = leia.nextInt();

		int fatorial = N;

		for (int i = 1; i < N; i++) {

			fatorial = fatorial * i;
			System.out.println(fatorial);

		}
		leia.close();
	}

}
