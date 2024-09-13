package aulas;

import java.util.Scanner;

public class exercicio01_ex04 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa que leia o número de um funcionário, seu número de horas
		 * trabalhadas, o valor que recebe por hora e calcula o salário desse
		 * funcionário. A seguir, mostre o número e o salário do funcionário, com duas
		 * casas decimais.
		 */

		Scanner leia = new Scanner(System.in);

		// Solicita o número de matrícula ao usuário e armazena na variável matricula
		System.out.println("Digite seu número de matrícula:");
		int matricula = leia.nextInt();

		// Solicita a quantidade de horas trabalhadas ao usuário e armazena na variável
		// horas
		System.out.println("Digite quantas horas você trabalhou:");
		double horas = leia.nextDouble();

		// Solicita o valor recebido por hora ao usuário e armazena na variável
		// valorHora
		System.out.println("Digite qual o valor você recebe por hora:");
		double valorHora = leia.nextDouble();

		// Calcula o salário multiplicando as horas trabalhadas pelo valor por hora e
		// armazena na variável salario
		double salario = horas * valorHora;

		// Imprime o número de matrícula do usuário
		System.out.printf("Número de matrícula: %d%n", matricula);

		// Imprime o salário formatado com duas casas decimais
		System.out.printf("Salário: R$ %.2f%n", salario);

		leia.close();
	}
}
