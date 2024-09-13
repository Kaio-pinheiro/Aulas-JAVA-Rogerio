package aulas;

import java.util.Scanner;

public class exercicio02_ex05 {

	public static void main(String[] args) {

		/*
		 * Com base na tabela abaixo, escreva um programa que leia o código de um item e
		 * a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
		 */

		Scanner leia = new Scanner(System.in);
		System.out.println("Bem vindo, faça seu pedido!");
		System.out.println();

		// Variável para armazenar o total da conta
		double totalConta = 0;

		// Variável para armazenar a escolha do cliente
		int escolha = 0;

		// Loop principal para o cliente fazer os pedidos
		while (escolha != 6) {
			// Mostra o menu de opções
			System.out.println("1. Cachorro quente ( R$4.00)");
			System.out.println("2. X-Salada ( R$4.50)");
			System.out.println("3. X-Bacon ( R$5.00)");
			System.out.println("4. Torrada simples (R$2.00)");
			System.out.println("5. Refrigerante (R$1.50)");
			System.out.println("6. Finalizar pedido");
			System.out.println("Escolha uma opção (1, 2, 3, 4, 5 ou 6)");
			escolha = leia.nextInt();// Lê a escolha do cliente

			// Verifica a escolha do cliente e adiciona ao total da conta
			if (escolha == 1) {
				System.out.println("Cachorro quente adicionado com sucesso");
				totalConta += 4;
			} else if (escolha == 2) {
				System.out.println("X-Salada adicionado com sucesso");
				totalConta += 4.50;
			} else if (escolha == 3) {
				System.out.println("X-Bacon adicionado com sucesso");
				totalConta += 5;
			} else if (escolha == 4) {
				System.out.println("Torrada simples adicionada com sucesso");
				totalConta += 2;
			} else if (escolha == 5) {
				System.out.println("Refrigerante adicionado com sucesso");
				totalConta += 1.50;
			} else if (escolha == 6) {
				System.out.println("Pedido finalizado");
				System.out.printf("Total a pagar: R$ %.2f reais%n", totalConta);
				break;// Sai do loop
			} else {
				System.out.println("Opção inválida!");
			}

		}
		leia.close();
	}
}
