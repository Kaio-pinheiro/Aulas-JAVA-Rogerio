package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Funcionario;

public class Programa06exercicio {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		List<Funcionario> lista = new ArrayList<>();
		List<Integer> listaID = new ArrayList<>();

		System.out.println("Quantos funcionários você irá cadastrar?");
		int qtdFunc = leia.nextInt();

		for (int i = 0; i < qtdFunc; i++) {
			leia.nextLine();
			System.out.println("Funcionário # " + (i + 1));

			System.out.print("ID: ");
			int id = leia.nextInt();
			leia.nextLine();

			// Verificar se o ID já existe
			if (verificarExistencia(lista, id) == false) {
				System.out.println("Nome: ");
				String nome = leia.nextLine();

				System.out.println("Salário: ");
				double salario = leia.nextDouble();
				// Criar meu objeto
				Funcionario funcionario = new Funcionario(id, nome, salario);
				// Adicionando o funcionario na lista
				lista.add(funcionario);
			} else {
				System.out.println("Funcionário já existente");
				i--;
			}
		}

		System.out.println("Digite o ID do funcionário a ser aumentado o salário: ");
		int idAumentar = leia.nextInt();

		for (Funcionario func : lista) {
			if (func.getId() == idAumentar) {
				System.out.println("Digite qual a porcentagem a ser aumentada: ");
				double porcentagemAumentada = leia.nextDouble();
				// double salarioAtual = func.getSalario();
				// double novoSalario = salarioAtual + (salarioAtual * porcentagemAumentada) /
				// 100.0;
				// func.setSalario(novoSalario);
				func.aumentarSalario(porcentagemAumentada);

			}

		}
		for (Funcionario func : lista) {
			System.out.println("Lista de funcionários: ");
			System.out.println(func);
		}
	}

	public static boolean verificarExistencia(List<Funcionario> lista, int id) {

		for (Funcionario func : lista) {
			if (func.getId() == id) {
				return true;
			}
		}
		return false;
	}
}
