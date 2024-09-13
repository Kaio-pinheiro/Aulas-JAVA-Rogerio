package exercicios;


public class Exercicio06 {

	// ESCREVE UMA FUNÇÃO QUE CALCULE O FATORIAL DE UM NÚMERO
	public static int fatorial(int N) {
		int fatorial = 1;

		for (int i = 1; i <= N; i++) {
			fatorial = fatorial * i;
			System.out.println(fatorial); //Isso imprimirá os valores intermediários do fatorial, se necessário
	}
		return fatorial;
}
}
