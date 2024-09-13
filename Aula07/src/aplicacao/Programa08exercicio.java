package aplicacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import entidade.Pensao;

public class Programa08exercicio {

	public static void main(String[] args) {
		// Cria uma lista para armazenar os aluguéis
		List<Pensao> listaPensao = new ArrayList<>(10);                  
		Scanner leia = new Scanner(System.in);

		System.out.println("Quantos quartos serão alugados?");
		int N = leia.nextInt();
		
		// Verifica se o número de quartos está dentro do intervalo permitido
		if( N < 1 || N > 10) {
			System.out.println("Número de quartos alugados deve estar entre 1 e 10.");
			return; // Encerra o programa se o número estiver errado
		}

		// Loop para alugar os quartos
		for (int i = 0; i < N; i++) {
			System.out.println("Aluguel #" + (i + 1) + ":");

			System.out.print("Quarto: ");
			int quarto = leia.nextInt();
			leia.nextLine();
			
			// Verifica se o quarto já está ocupado
			if (verificarQuartoOcupado(listaPensao, quarto) == false) {
				// Se o quarto não estiver ocupado, solicita ao usuário o nome e o email
				System.out.print("Nome: ");
				String nome = leia.nextLine();
				System.out.print("Email: ");
				String email = leia.nextLine();

			
				// Cria um objeto Pensao com os dados informados e adiciona à lista de aluguéis
				Pensao pensao = new Pensao(quarto, nome, email);
				listaPensao.add(pensao);
			} else {
				// Se o quarto estiver ocupado, informa ao usuário e volta uma iteração do loop
				System.out.println("Este quarto já está ocupado");
				i--; // Volta uma iteração para que o usuário escolha outro quarto
			}
		}
		// Ordena a lista de alugueis pelo numero do quarto CHATGPT
		Collections.sort(listaPensao, Comparator.comparingInt(Pensao::getQuarto));
		System.out.println("Quartos ocupados:");

		// Itera sobre a lista de aluguéis e imprime os detalhes de cada aluguel
		for (Pensao pensao : listaPensao) {
			System.out.println(pensao.getQuarto() + ": " + pensao.getNome() + ", " + pensao.getEmail());
		}

		leia.close();
	}

	// Método para verificar se um quarto está ocupado
	public static boolean verificarQuartoOcupado(List<Pensao> listaPensao, int quarto) {

		// Itera sobre a lista de aluguéis
		for (Pensao func : listaPensao) {
			if (func.getQuarto() == quarto) { // Verifica se o quarto está ocupado comparando o número do quarto com o id fornecido
				return true;// Retorna true se o quarto estiver ocupado
			}
		}
		return false;// Retorna false se o quarto estiver vazio
	}
}
