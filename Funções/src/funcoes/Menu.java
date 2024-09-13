package funcoes;

import java.util.Scanner;

public class Menu {
	// Para testar e ver o menu funcionando
	public static void main(String[] args) {
		displayMenu();
	}
	
	
	private static void displayMenu() {

		Scanner leia = new Scanner(System.in);
		int escolha = -1; // Para garantir que o loop vai ser executado pelo menos uma vez

		while (escolha != 0) {
			System.out.println("====== Menu ======");
			System.out.println("1. Dizer Olá");
			System.out.println("2. Dizer Tchau");
			System.out.println("3. Dizer algo");
			System.out.println("0. Sair");
			System.out.print("Escolha uma opção: ");

			escolha = leia.nextInt();

			if (escolha == 1) {
				System.out.println("Olá!");
			} else if (escolha == 2) {
				System.out.println("Tchau!");
			} else if (escolha == 3) {
				System.out.println("Algo!");
			} else if (escolha == 0) {
				System.out.println("Saindo...");
			} else {
				System.out.println("Opção inválida, tente novamente.");
			}
		}

		leia.close();

	}
}
