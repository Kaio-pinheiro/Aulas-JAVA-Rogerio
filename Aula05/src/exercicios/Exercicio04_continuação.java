package exercicios;

import java.util.Scanner;

public class Exercicio04_continuação {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Seja bem vindo ao convertedor de graus...");
		System.out.println("Digite quantos graus Celsius está fazendo neste momento: ");
		double C = leia.nextDouble();
		System.out.println(C + " º graus Celsius, equivalem a " + Exercicio04.graus(C) + " º graus Fahrenheit");
		leia.close();
	}

}
