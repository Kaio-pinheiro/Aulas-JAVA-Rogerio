package exercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// EXERCICIO 01 COM FUNÇÕES
public class Exercicio01v2 {

	// Declaração das listas
	static List<Integer> listaID = new ArrayList<>();
	static List<String> listaNomes = new ArrayList<>();
	static List<Double> listaSalario = new ArrayList<>();
	static Scanner leia = new Scanner(System.in);

	public static void main(String[] args) {
		// Solicita a quantidade de funcionários a serem cadastrados
		System.out.println("Quantos funcionários serão cadastrados? ");
		int N = leia.nextInt();
		leia.nextLine(); // Limpeza de buffer

		// Adiciona os funcionários
		for (int i = 0; i < N; i++) {
			adicionarFuncionario(i);
		}

		// Aumenta o salário de um funcionário
		aumentarSalario();

		// Imprime a lista de funcionários
		imprimirFuncionarios();

		// Fecha o scanner
		leia.close();
	}

	public static void adicionarFuncionario(int i) {
		System.out.println("Digite o ID do funcionário " + (i + 1) + " :");
		int id = leia.nextInt();
		leia.nextLine(); // Limpeza de buffer

		while (listaID.contains(id)) {
			System.out.println("Este ID já existe, digite outro ID por favor:");
			id = leia.nextInt();
			leia.nextLine(); // Limpeza de buffer
		}
		listaID.add(id);

		System.out.println("Digite o nome do funcionário: ");
		String nome = leia.nextLine();
		listaNomes.add(nome);

		System.out.println("Digite o salário do funcionário: ");
		double salario = leia.nextDouble();
		leia.nextLine(); // Limpeza de buffer
		listaSalario.add(salario);
	}

	public static void aumentarSalario() {
		System.out.println("Digite o ID do funcionário a ser aumentado o salário: ");
		int idAumentado = leia.nextInt();
		leia.nextLine(); // Limpeza de buffer

		if (listaID.contains(idAumentado)) {
			System.out.println("Digite qual a porcentagem a ser aumentada: ");
			double porcentagemAumentada = leia.nextDouble();

			int indice = listaID.indexOf(idAumentado);
			double salarioAtual = listaSalario.get(indice);
			double novoSalario = salarioAtual + (salarioAtual * porcentagemAumentada) / 100.0;
			listaSalario.set(indice, novoSalario);

			String nome = listaNomes.get(indice);
			System.out.println("O salário do funcionário " + nome + " foi alterado para R$ " + novoSalario);
		} else {
			System.out.println("Funcionário com ID " + idAumentado + " não encontrado.");
		}
	}

	public static void imprimirFuncionarios() {
		System.out.println("Lista de funcionários:");
		System.out.printf("%-8s %-10s %-8s%n", "ID", "Nome", "Salário");
		System.out.println("--------------------------------");
		for (int i = 0; i < listaID.size(); i++) {
			System.out.printf("%-8d %-10s R$ %-8.2f%n", listaID.get(i), listaNomes.get(i), listaSalario.get(i));
		}
	}
}
