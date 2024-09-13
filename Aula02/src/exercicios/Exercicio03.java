package exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = leia.nextInt();

		if (numero >= 0 && numero <= 25) {
			System.out.println("Este valor se encontra entre [0,25]");
		} else if (numero > 25 && numero <= 50) {
			System.out.println("Este valor se encontra entre [25,50]");
		} else if (numero > 50 && numero <= 75) {
			System.out.println("Este valor se encontra entre [50,75]");
		} else if (numero > 75 & numero <= 100) {
			System.out.println("Este valor se encontra entre [75,100]");
		} else {
			System.out.println("Este numero esta fora do intervalo");
		}
		leia.close();
	}

}
