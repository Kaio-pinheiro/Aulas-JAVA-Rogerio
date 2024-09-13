package aulas;

import java.util.Scanner;

public class exercicio01_ex05 {

	public static void main(String[] args) {

		/*
		 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		 * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e
		 * o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Quantas peças você quer cadastrar? ");
		int N = leia.nextInt();

		// Inicializa a variável para armazenar o total a pagar
		double totalPagar = 0;
		int codigo = 0;
		// Loop para cada peça a ser cadastrada
		for (int i = 0; i < N; i++) {
			System.out.println("Digite o codigo da " + (i + 1) + "ª peça: ");
			codigo = leia.nextInt();
			System.out.println("Digite o numero de peças que você deseja: ");
			int numerosPeca = leia.nextInt();
			System.out.println("Digite o valor unitário da peça que você deseja: ");
			double valorPeca = leia.nextDouble();

			// Calcula o valor total da peça e adiciona ao total a pagar
			totalPagar += numerosPeca * valorPeca;
		}
		// Imprime o valor total a pagar formatado com duas casas decimais
		System.out.printf("Valor a pagar: %.2f reais. %n", totalPagar);
		System.out.println(codigo);// SÓ PRA SUMIR O ERRO, ESTE CODIGO NAO ESTA SENDO USADO
		leia.close();
	}

}
