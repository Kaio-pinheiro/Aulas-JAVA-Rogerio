package Exemplos;

import java.util.Random;
import java.util.Scanner;

public class Programa06 {

	public static void main(String[] args) {

		Random aleatorio = new Random();
		Scanner leia = new Scanner(System.in);

		int numeroAleatorio = aleatorio.nextInt(100);
		int tentativas = 0;
		System.out.println("Numero sorteado!!.....");
		while (true) {

			System.out.println("Digite sua tentativa");
			int tentativa = leia.nextInt();
			tentativas++;
			if (tentativa == numeroAleatorio) {
				System.out.println("Parabéns, você ganhou!");
				break;
			} else if (tentativa > numeroAleatorio) {
				System.out.println("Digite um numero menor");
			} else if (tentativas == 5) {
				System.out.println("Voce perdeu!");
				break;
			} else {

				System.out.println("Digite um numero maior");
			}
		}

		System.out.println("Numero de tentativas: " + tentativas);
		
		leia.close();

	}

}
