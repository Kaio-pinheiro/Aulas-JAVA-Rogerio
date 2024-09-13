package Exercicios;

import java.util.Scanner;

public class Exercicio04v2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero de 1 a 1000: ");
		int x = leia.nextInt();

		if (x >= 1 && x <= 1000) {
			for (int i = 1; i <= x; i += 2) {
				System.out.println(i);
			}
		} else {
			System.out.println("Digite um numero válido");
		}

		leia.close();
	}

}
