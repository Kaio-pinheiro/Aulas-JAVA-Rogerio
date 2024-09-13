package exercicios;

public class Exercicio07 {

	// CRIE UMA FUNÇÃO QUE RECEBA UM VETOR DE NOTAS DE UM ALUNO. O OBJETIVO DA
	// FUNÇÃO É RETORNAR UMA STRING DIZENDO SE O ALUNO FOI REPROVADO OU APROVADO

	public static void main(String[] args) {

		// Vetor de notas dos alunos
		double[] notas = { 8.5, 8.0, 6.5, 10.0, 2.5 };
		
		// A variável resultado recebe a função que calcula as notas e a média
		String resultado = mostrarResultado(notas);
		
		// Printando a variavel resultado que recebeu a função
		System.out.printf("Você foi: %s", resultado);
	}

	public static String mostrarResultado(double[] notas) {

		// Calculando as notas do vetor e adicionado a variável soma
		double soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}

		// Dividindo a 'soma' pela quantidade de notas do vetor, 'notas.length' percorre o vetor
		double media = soma / notas.length;

		// Verificando se a média é maior ou igual que 6
		if (media >= 6) {
			return "Aprovado";
		} else {
			return "Reprovado";
		}

	}
}
