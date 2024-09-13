package exercicios;

import java.util.ArrayList;
import java.util.List;

public class Exercicio03 {

	public static void main(String[] args) {

		List<String> nomes = new ArrayList<>();

		nomes.add("Maria");
		nomes.add("Bob");
		nomes.add("Bob");
		nomes.add("Maria");
		nomes.add("Maria");
		nomes.add("Greg");
		nomes.add("Greg");
		nomes.add("Greg");
		nomes.add("Greg");
		nomes.add("Meg");

		List<String> ocorrencias = new ArrayList<>();

		for (String nome : nomes) {
			int contador = 0;
			if (!ocorrencias.contains(nome)) {
				ocorrencias.add(nome);
				for (int i = 0; i < nomes.size(); i++) {
					if (nomes.get(i).equals(nome)) {
						contador++;
					}

				}
				System.out.println("Ocorrencias de " + nome + ": " + contador);
			}
		}

	}

}
