package aulas;

import java.util.Scanner;

public class exercicio02_ex03 {

	public static void main(String[] args) {

		/*
		 * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
		 * "Sao Multiplos" ou "Nao sao Multiplos", indicando se os valores lidos são
		 * múltiplos entre si. Atenção: os números devem poder ser digitados em ordem
		 * crescente ou decrescente.
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o valor de A: ");
		int A = leia.nextInt();
		System.out.println("Digite o valor de B: ");
		int B = leia.nextInt();

		// Verifica se A é múltiplo de B ou vice-versa
		if (A % B == 0 || B % A == 0) {
			System.out.println("São múltiplos!");
		} else {
			System.out.println("Não são múltiplos!");
		}
		leia.close();
	}

}
