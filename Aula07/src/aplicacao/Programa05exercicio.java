package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Pessoa;

public class Programa05exercicio {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas: ");                            // pergunta ao usuário o número de pessoas a cadastrar
		int N = leia.nextInt();                                                             // Lê o número de pessoas digitado e entra na variável N

		List<Pessoa> pessoas = new ArrayList<>();                                           // Cria uma lista para armazenar objetos Pessoa

		double alturaTotal = 0;                                                             // Inicializa uma variável para armazenar a soma das alturas
		int quantidadeMenores16 = 0;                                                        // Inicializa uma variável para contar o número de pessoas com menos de 16 anos

		List<String> nomesMenores16 = new ArrayList<>();                                    // Cria uma lista para armazenar os nomes das pessoas com menos de 16 anos

		for (int i = 0; i < N; i++) {                                                       // Loop para iterar sobre o número de pessoas que o usuário digitou
			System.out.println("Dados da " + (i + 1) + " ª pessoa:");
			leia.nextLine();
			System.out.println("Nome: ");
			String nome = leia.nextLine();
			System.out.println("Idade: ");
			int idade = leia.nextInt();
			System.out.println("Altura: ");
			double altura = leia.nextDouble();
			System.out.println("Peso: ");
			double peso = leia.nextDouble();

			Pessoa pessoa = new Pessoa(nome, idade, altura, peso);                          // Cria um objeto Pessoa com os dados fornecidos
			pessoas.add(pessoa);                                                            // Adiciona o objeto Pessoa à lista de pessoas(*Linha 17*)
			alturaTotal += pessoa.getAltura();                                              // Adiciona a altura da pessoa à altura total(*Linha 19*)

			if (pessoa.getIdade() < 16) {                                                   // Verifica se a pessoa tem menos de 16 anos
				quantidadeMenores16++;                                                      // Incrementa o contador de pessoas com menos de 16 anos(*Linha 20*)
				nomesMenores16.add(pessoa.getNome());                                       // Incrementa o contador de pessoas com menos de 16 anos na lista (*Linha 22*)
			}
		}

		double alturaMedia = alturaTotal / N;                                              // Calcula a altura média das pessoas
		double porcentagemMenores16 = ((double) quantidadeMenores16 / N) * 100.0;          // Calcula a porcentagem de pessoas com menos de 16 anos

		System.out.printf("Altura média: %.2f\n", alturaMedia);                            // Printa a altura média das pessoas
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores16); // Printa a porcentagem de pessoas com menos de 16 anos

		if (quantidadeMenores16 > 0) {                                                     // Verifica se há pessoas com menos de 16 anos
			System.out.println("Nomes das pessoas com menos de 16 anos:");                 // Exibe uma mensagem indicando que os nomes serão listados
			for (String nome : nomesMenores16) {                                           // Itera sobre a lista de nomes de menores de 16 anos
				System.out.println(nome);                                                  // Exibe cada nome na lista
			}
		}

		leia.close();
	}
}
