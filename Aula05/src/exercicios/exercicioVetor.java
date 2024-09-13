package exercicios;

public class exercicioVetor {

	public static void main(String[] args) {
		//Exercicio para criar um vetor e fazer outro vetor só com os numeros pares do primeiro vetor, usando funções
		
		// Vetor com 10 numeros
		int[] vetor = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// Vetor de números pares recebendo a função para filtrar os números pares de um vetor
		int[] pares = numPares(vetor);

		// Imprimir os vetores
		System.out.println("Vetor original: ");
		mostrarVetor(vetor);
		System.out.println("\nNúmeros pares:");
		mostrarVetor(pares);
	}

	// FUNÇÃO PARA IMPRIMIR UM VETOR
	private static void mostrarVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}

	// FUNÇÃO PARA FILTRAR OS NÚMEROS PARES DE UM VETOR
	private static int[] numPares(int[] vetor) {
		int aux = 0;
		// Contar quantos números pares existem
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				aux++;
			}
		}
		// Criar vetor para armazenar os números pares
		int[] pares = new int[aux];
		int aux1 = 0;
		// Preencher o vetor com os números pares
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				pares[aux1] = vetor[i];
				aux1++;
			}
		}
		return pares;
	}

}
