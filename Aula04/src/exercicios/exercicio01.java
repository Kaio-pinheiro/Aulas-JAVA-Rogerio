package exercicios;

public class exercicio01 {

	public static void main(String[] args) {

		int soma = 0;
		int[] vetor = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };

		for (int i = 0; i < vetor.length; i++) {
			soma = soma + vetor[i];

		}
		System.out.println(soma);
	}

}
