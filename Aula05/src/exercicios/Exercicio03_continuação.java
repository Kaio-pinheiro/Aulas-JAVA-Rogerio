package exercicios;

import java.util.Scanner;

public class Exercicio03_continuação {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite seu login: ");
		String login = leia.nextLine();
		System.out.println("Login: " + login);
		System.out.println("Senha gerada aleatóriamente: " + Exercicio03.gerarSenha() );
		leia.close();
	}

}
