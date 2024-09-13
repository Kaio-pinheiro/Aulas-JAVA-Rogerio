package Exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int soma = 0;

		while (true) {
			System.out.println("Digite um numero: ");
			int numero = leia.nextInt();

			if (numero < 0) {
				break;
			}

			soma = soma + numero;

		}
		System.out.println("A soma dos valores positivos é: " + soma);

		leia.close();
	}

}
