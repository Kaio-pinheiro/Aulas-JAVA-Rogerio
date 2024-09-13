package exemplos;

import java.util.ArrayList;
import java.util.List;

public class Programa01 {

	    // COMANDO DE LISTAS
	public static void main(String[] args) {

		// Inicializando uma lista
		List<Integer> listaNumeros = new ArrayList<>();
		
		// Inicializando uma lista com valores
		List<Integer> lista = new ArrayList<>(List.of(3,2,5));
		
		// Lista de Strings
		List<String> listaNomes = new ArrayList<>();
		
		// Adicionando valores             ---- .add 
		listaNomes.add("Maria");
		listaNomes.add("Bob");
		listaNomes.add("Charlie");
		listaNomes.add("Meg");
		
		// Imprimindo a lista
		System.out.println(listaNomes);
		
		// Buscando o elemento da posição 2 ---- .get 
		String nome = listaNomes.get(2);
		System.out.println(nome);
		
		// Adicionando um elemento em uma posição específica
		listaNomes.add(2, "Fábio");
		System.out.println(listaNomes);
		
		// Percorrendo uma lista            ---- .size
		for (int i = 0; i < listaNomes.size(); i++) {
			System.out.println("Posição " + i + ", elemento: " + listaNomes.get(i));
			
		}
		// For EACH
		for (String name: listaNomes) {
			System.out.println(name);
		}
		// Removendo pelo elemento     ---- .remove
		listaNomes.remove("Fábio");
		System.out.println(listaNomes);
		
		// Removendo pela posição
		listaNomes.remove(1);
		System.out.println(listaNomes);
		
		// Lista de números
		System.out.println(lista);
		lista.remove(Integer.valueOf(5)); // remover pelo elemento
		System.out.println(lista);
		
		// Removendo todos os nomes que comecem com M
		listaNomes.removeIf(i -> i.charAt(0) == 'M');
		System.out.println(listaNomes);
		
		// Atualizando elemento de uma posição especifica
		listaNomes.set(0, "Charles");
		System.out.println(listaNomes);
		
		listaNomes.add("Fernanda");
		listaNomes.add("Roberto");
		
		// Segunda lista de nomes
		List<String> listaNomes2 = new ArrayList<>();
		listaNomes2.add("Teste");
		listaNomes2.add("Testando");
		
		// Juntando duas listas em uma só
		listaNomes.addAll(listaNomes2);
		System.out.println(listaNomes);
		
		listaNumeros.add(3);
		listaNumeros.add(1);
		listaNumeros.add(2);
		// Ordenação
		listaNomes.sort(null);
		listaNumeros.sort(null);
		System.out.println(listaNomes);
		System.out.println(listaNumeros);
		
		// Encontrando o indice do elemento
		int indice = listaNomes.indexOf("Roberto");
		System.out.println("Roberto está na posição: " + indice);
		
		// Verificando existencia
		boolean existe = listaNomes.contains("Fernanda");
		System.out.println("Fernanda existe? " + existe);
		
		

		
	}

}
