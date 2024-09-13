package exercicios;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor do saque: ");
		int saque = leia.nextInt();

		int qtdNota100 = saque / 100;
		saque = saque - (qtdNota100 * 100);

		int qtdNota50 = saque / 50;
		saque = saque - (qtdNota50 * 50);

		int qtdNota20 = saque / 20;
		saque = saque - (qtdNota20 * 20);

		int qtdNota10 = saque / 10;
		saque = saque - (qtdNota10 * 10);

		int qtdNota5 = saque / 5;
		saque = saque - (qtdNota5 * 5);

		int qtdNota2 = saque / 2;
		saque = saque - (qtdNota2 * 2);

		System.out.println("Quantidade de cedulas de 100: " + qtdNota100);
		System.out.println("Quantidade de cedulas de 50: " + qtdNota50);
		System.out.println("Quantidade de cedulas de 20: " + qtdNota20);
		System.out.println("Quantidade de cedulas de 10: " + qtdNota10);
		System.out.println("Quantidade de cedulas de 5: " + qtdNota5);
		System.out.println("Quantidade de cedulas de 2: " + qtdNota2);

		leia.close();
	}

}
