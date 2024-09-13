package exemplos;

public class Programa02 {

	public static void main(String[] args) {
		
		// Inicializando o vetor
		String[] nomes = new String[5];
		
		// Inserindo valores no vetor
		nomes[1] = "Charlie";
		nomes[3] = "Bob";
	//  nomes[5] = "Maria"; ERRO - POSIÇÃO 5 NÃO EXISTE
		
		String nomeIndividual = nomes[3];
		System.out.println(nomeIndividual);
		
		System.out.println(nomes); // ERRO
		System.out.println(nomes[1]);
		System.out.println(nomes[2]);
		
		int comprimento = nomes.length;
		System.out.println("O comprimento é " + comprimento);
		
		for (int i = 0; i < comprimento; i++) {
			System.out.println("Posição " + i + " Valor: " + nomes[i]);
		}
		
		// Trocar maria e bob de posição
		String aux = nomes[1];
		nomes[1] = nomes[3];
		nomes[3] = aux;
		
		// Inicializando os valores
		int[] numeros = {1, 5, 9, 10, 15, 19};
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Posição " + i + " Valor: " + numeros[i]);
		}
		
		
		
	}

}
