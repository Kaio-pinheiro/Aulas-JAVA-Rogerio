package exercicios;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu peso (Kg): ");
		double peso = leia.nextDouble();

		System.out.println("Digite sua altura (Metros): ");
		double altura = leia.nextDouble();

		double imc = peso / Math.pow(altura, 2);

		if (imc < 16) {
			System.out.println("Magreza grave");
		} else if (imc >= 16 && imc < 16.9) {
			System.out.println("Magreza moderada");
		} else if (imc >= 17 && imc < 18.5) {
			System.out.println("magreza leve");
		} else if (imc >= 18.6 && imc < 14.9) {
			System.out.println("peso ideal");
		} else if (imc >= 25 && imc < 29.9) {
			System.out.println("sobrepeso");
		} else if (imc >= 30 && imc < 34.9) {
			System.out.println("obesidade grau |");
		} else {
			System.out.println("obesidade grau ||");
		}
		leia.close();

	}

}
