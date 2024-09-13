package Exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int numero = leia.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 1; i <= numero; i++) {
			System.out.println("Digite outro numero " + i);
			int x = leia.nextInt();

			if (x >= 10 && x <= 20) {
				in++;
			} else {
				out++;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");
		leia.close();
	}

}
