package exercicios;

import java.util.Scanner;

public class Exercicio08v2 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do saque: ");
		int saque = leia.nextInt();

		int notas100 = saque / 100;
		saque = saque - (notas100 * 100);

		int notas50 = saque / 50;
		saque = saque - (notas50 * 50);

		int notas20 = saque / 20;
		saque = saque - (notas20 * 20);

		int notas10 = saque / 10;
		saque = saque - (notas10 * 10);

		int notas5 = saque / 5;
		saque = saque - (notas5 * 5);

		int notas2 = saque / 2;
		saque = saque - (notas2 * 2);

		System.out.println("Quantidade de notas de 100: " + notas100);
		System.out.println("Quantidade de notas de 50: " + notas50);
		System.out.println("Quantidade de notas de 20: " + notas20);
		System.out.println("Quantidade de notas de 10: " + notas10);
		System.out.println("Quantidade de notas de 5: " + notas5);
		System.out.println("Quantidade de notas de 2: " + notas2);

		leia.close();

	}

}
