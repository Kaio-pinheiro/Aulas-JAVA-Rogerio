package exercicios;

public class Exercicio01 {

	//CRIE UMA FUNÇÃO QUE RECEBE UM VETOR DE NOTAS(EM ESCALA DE 0 A 10) E MOSTRE A MÉDIA A MAIOR NOTA E A MENOR NOTA
	public static void main(String[] args) {
		double[] notas = { 8.5, 8.0, 6.5, 10.0, 2.5 }; // Vetor de notas dos alunos
		mostrarNotas(notas);
	}

	public static void mostrarNotas(double[] notas) {
		double soma = 0;
		double maiorNota = notas[0]; // Assumindo que a primeira nota é a maior
		double menorNota = notas[0]; // Assumindo que a primeira nota é a menor
		for (int i = 0; i < notas.length; i++) {
			double nota = notas[i]; // Pega a nota atual do vetor
			soma += nota; // Calcula a soma de todas as notas
			if (nota > maiorNota) { // Comparando cada nota com a 'maiorNota' atual e a atualiza se encontrar uma
									// nota maior
				maiorNota = nota;
			}
			if (nota < menorNota) { // Comparando cada nota com a 'menorNota' atual e a atualiza se encontrar uma
									// nota menor
				menorNota = nota;
			}
		}
		double media = soma / notas.length;
		System.out.println("Média das notas: " + media);
		System.out.println("Maior nota: " + maiorNota);
		System.out.println("Menor nota: " + menorNota);
	}

}
