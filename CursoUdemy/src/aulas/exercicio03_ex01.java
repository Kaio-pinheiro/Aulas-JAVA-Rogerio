package aulas;

import java.util.Scanner;

public class exercicio03_ex01 {

	public static void main(String[] args) {
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */

		// DOIS MODOS DE FAZER
		/*
		 * Scanner leia = new Scanner(System.in);
		 * System.out.println("Digite sua senha: "); int senha = leia.nextInt(); int
		 * senhaCorreta = 2222;
		 * 
		 * while (senha != senhaCorreta) { System.out.println("Senha inválida");
		 * System.out.println("Digite sua senha novamente"); senha = leia.nextInt(); }
		 * if (senha == senhaCorreta) { System.out.println("Acesso permitido"); }
		 * leia.close();
		 */

		Scanner leia = new Scanner(System.in);
		int senhaCorreta = 2002;

		while (true) {
			System.out.println("Digite sua senha: ");
			int senha = leia.nextInt();

			if (senha == senhaCorreta) {
				System.out.println("Acesso permitido");
				break;
			} else {
				System.out.println("Senha invalida");
			}
		}
		leia.close();
	}

}
