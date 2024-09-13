package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		// Criando uma lista
		List<String> listaCompras = new ArrayList<>();

		Scanner leia = new Scanner(System.in);
		// Iniciando a opcao que o cliente vai escolher com zero
		int opcao = 0;
		System.out.println("----- LISTA DE COMPRAS -----\n");
	
		// Laço de repetição para repetir as opçoes a serem escolhidas
		while (opcao != 4) {
			System.out.println("1: Adicionar itens na lista: ");
			System.out.println("2: Remover itens na lista: ");
			System.out.println("3: Exibir a lista: ");
			System.out.println("4: Sair");
			System.out.println("Escolha uma opção acima: ");
			
			// a escolha entra na variavel opcao
			opcao = leia.nextInt();

			// se a opcao for 1, pede pra escrever o nome do item, que entra na variavel item e é chamado a função de adicionar na lista
			if (opcao == 1) {
				System.out.println("Digite o item a ser adicionado: ");
				String item = leia.next();
				adicionarItens(listaCompras, item);
			// se  opçao for 2, pede pra escrever o nome do item a ser removido, que entra na variavel itemRemovido e é chamado a função de removerItens	
			} else if (opcao == 2) {
				System.out.println("Digite o item a ser removido");
				String itemRemovido = leia.next();
				removerItens(listaCompras, itemRemovido);
			// se a opção for 3, printa a lista 	
			} else if (opcao == 3) {
				System.out.println(listaCompras);
			// se a opção for 4 encerra o programa	
			} else if (opcao == 4) {
				System.out.println("Saindo do programa");
			// caso alguem digite uma opção não válida da lista	
			} else {
				System.out.println("Opção inválida");
			}

		}
		leia.close();
	}

	// função pra adicionar na lista
	public static void adicionarItens(List<String> listaCompras, String itens) {
		listaCompras.add(itens);
		System.out.println("Item " + itens + " foi adicionado a lista...");
	}

	// função para remover da lista
	public static void removerItens(List<String> listaCompras, String itens) {
		listaCompras.remove(itens);
	}
}
