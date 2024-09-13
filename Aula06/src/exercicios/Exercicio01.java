package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {

	// **** ESQUECI DE CRIAR FUNÇÕES PROFESSOR E COMENTEI TUDO PRA MELHORAR MEU ENTENDIMENTO ****
	public static void main(String[] args) {

		// Criei 3 listas
		List<Integer> listaID = new ArrayList<>();
		List<String> listaNomes = new ArrayList<>();
		List<Double> listaSalario = new ArrayList<>();

		Scanner leia = new Scanner(System.in);
		// Quantidade de funcionários cadastrados entra na variável N
		System.out.println("Quantos funcionários serão cadastrados? ");
		int N = leia.nextInt();
		leia.nextLine(); // Limpeza de buffer

		// Percorrendo o N, pedindo pra inserir o id, que entra na variável id
		for (int i = 0; i < N; i++) {
			System.out.println("Digite o ID do funcionário " + (i + 1) + " :");
			int id = leia.nextInt();
			leia.nextLine(); // Limpeza de buffer

			// Enquanto a lista de IDs contém o mesmo id digitado, ele printa que ja existe e pede pra digitar outro id
			while (listaID.contains(id)) {
				System.out.println("Este ID já existe, digite outro ID por favor:");
				id = leia.nextInt();
				leia.nextLine(); // Limpeza de buffer

			}
			listaID.add(id); // Adicionando os id na lista de IDs

			System.out.println("Digite o nome do funcionario: "); // Pede o nome do funcionario e adiciona na variável nome
			String nome = leia.nextLine();
			listaNomes.add(nome); // Adicionando o nome na lista de Nomes

			System.out.println("Digite o salario do funcionario: "); // Pede o salário do funcionario e adiciona na variável salario
			double salario = leia.nextInt();
			listaSalario.add(salario); // Adicionando o salario na lista de Salários
		}

		System.out.println("Digite o ID do funcionário a ser aumentado o salário: "); // Pede o id do func. que vai receber o aumento e adiciona na var idAumentado
		int idAumentado = leia.nextInt();
		leia.nextLine(); // Limpeza de buffer

		// Se a lista de IDs contém o id do funcionario que vai receber aumento(idAumentado), pede a porcentagem e adiciona na var porcentagemAumentada
		if (listaID.contains(idAumentado)) {
			System.out.println("Digite qual a porcentagem a ser aumentada: ");
			double porcentagemAumentada = leia.nextInt();

			int indice = listaID.indexOf(idAumentado); // Cria uma variável indice que recebe a Busca da posição do id
			double salarioAtual = listaSalario.get(indice); // Pega na posição correta o salario do funcionario
			double novoSalario = salarioAtual + (salarioAtual * porcentagemAumentada) / 100.0; // Faz a conta do aumento e adiciona na var novoSalario
			listaSalario.set(indice, novoSalario); // Atualiza o salario na lista

			String nome = listaNomes.get(indice);
			System.out.println("O salário do funcionário " + nome + " foi alterado para R$ " + novoSalario); // imprimi o funcionario que recebeu o aumento
			System.out.println("Lista de funcionários: ");
			System.out.printf("%-8s %-10s %-10s%n", "ID", "Nome", "Salário"); // organização da tabela, os espaços entre as colunas
			System.out.println("--------------------------------");
			// Percorre a lista para imprimir todas as informações
			for (int i = 0; i < listaID.size(); i++) {
				System.out.printf("%-8d %-10s R$ %-10.2f%n", listaID.get(i), listaNomes.get(i), listaSalario.get(i));
			}
		}

		leia.close();
	}
}
