package aulas;

import java.util.Scanner;

public class exercicio04_ex02 {

	public static void main(String[] args) {

		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo)
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número");
		int numero = leia.nextInt();
		int in = 0;
		int out = 0;

		for (int i = 0; i < numero; i++) {
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
