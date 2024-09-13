package Exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite a coordenada x: ");
		int x = leia.nextInt();

		System.out.println("Digite a coordenada y: ");
		int y = leia.nextInt();

		while (true) {

			if (x == 0 || y == 0) {
				break;
			}
			if (x > 0 && y > 0) {
				System.out.println("Primeiro quadrante");
				break;
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro quadrante");
				break;
			} else if (x > 0 && y < 0) {
				System.out.println("Quarto quadrante");
				break;
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo quadrante");
				break;
			} else {

			}
		}
		leia.close();
	}

}
