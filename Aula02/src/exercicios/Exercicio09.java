package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Jogo de dados");

		Random aleatorio = new Random();

		int dado1 = aleatorio.nextInt(1, 6);
		int dado2 = aleatorio.nextInt(1, 6);

		System.out.println("O valor do primeiro dado é " + dado1);
		System.out.println("O valor do segundo dado é " + dado2);

		if (dado1 + dado2 == 7 || dado1 + dado2 == 11) {
			System.out.println("Você ganhou");
		} else if (dado1 + dado2 == 2 || dado1 + dado2 == 3 || dado1 + dado2 == 12) {
			System.out.println("Voce perdeu");
		} else {
			System.out.println("Tente novamente");
		}
		leia.close();
	}

}
