package aulas;

import java.util.Scanner;

public class exercicio01_ex01 {

	public static void main(String[] args) {

		/*
		 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
		 * soma desses números com uma mensagem explicativa, conforme exemplos.
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o primeiro numero: ");
		int num1 = leia.nextInt();
		System.out.println("Digite o segundo numero: ");
		int num2 = leia.nextInt();

		// Calcula a soma dos dois números e armazena na variável soma
		int soma = num1 + num2;
		System.out.println("Soma = " + soma);

		leia.close();
	}

}
