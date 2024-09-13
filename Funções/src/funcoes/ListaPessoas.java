package funcoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Pessoa;

public class ListaPessoas {

	public static void main(String[] args) {
		listaPessoas();
	}

	private static void listaPessoas() { // Usar como parametro o que o scanner ler
		Scanner leia = new Scanner(System.in);
		System.out.println("Armazenando atributos das pessoas no objeto da "
				+ "classe Pessoa e adicionando esses objetos na lista pessoas");
		System.out.println("Quantas pessoas serão cadastradas?");
		int N = leia.nextInt();
		leia.nextLine();
		List<Pessoa> pessoas = new ArrayList<>(); // Lista para armazenar as pessoas
		for (int i = 0; i < N; i++) { // solicita os dados de cada pessoa (nome, idade e altura)
			System.out.printf("Dados da %dª pessoa: %n", (i + 1));
			System.out.println("Nome:");
			String nome = leia.nextLine();
			System.out.println("Idade:");
			int idade = leia.nextInt();
			leia.nextLine();
			System.out.println("Altura: ");
			double altura = leia.nextDouble();
			leia.nextLine();

			Pessoa pessoa = new Pessoa(nome, idade, altura); // cria um objeto Pessoa com esses dados
			pessoas.add(pessoa); // adiciona esse objeto Pessoa à lista pessoas
		}
		leia.close();
		// ao final da execução do loop, a lista pessoas conterá todos os objetos Pessoa
		// criados com os dados inseridos pelo usuário.

		// Verificar se a lista está vazia
		if (pessoas.isEmpty()) {
			System.out.println("Nenhuma pessoa foi cadastrada.");
		} else {
			// Exemplo: imprimir informações das pessoas
			for (Pessoa pessoa : pessoas) {
				System.out.println("Nome: " + pessoa.getNome());
				System.out.println("Idade: " + pessoa.getIdade());
				System.out.println("Altura: " + pessoa.getAltura());
				System.out.println();
			}
		}
	}

}
