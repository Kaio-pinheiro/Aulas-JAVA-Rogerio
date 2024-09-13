package aulas;

import java.util.Scanner;

public class exercicio04_ex01 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número maior que zero e menor que mil: ");
		int x = leia.nextInt();

		for (int i = 0; i <= x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		leia.close();
	}

}
