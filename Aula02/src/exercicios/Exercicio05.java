package exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Por favor, digite o primeiro numero: ");
		int numero1 = leia.nextInt();

		System.out.println("Por favor, digite o segundo numero: ");
		int numero2 = leia.nextInt();

		System.out.println("Por favor, digite o terceiro numero: ");
		int numero3 = leia.nextInt();

		int campeao;

		if (numero1 > numero2) {
			campeao = numero1;
		} else {
			campeao = numero2;
		}
		if (numero3 > campeao) {
			campeao = numero3;
		}
		System.out.println("O maior numero é " + campeao);
		leia.close();
	}

}
