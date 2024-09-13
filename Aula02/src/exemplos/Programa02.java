package exemplos;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		int idade = leia.nextInt();
		leia.nextLine();

		System.out.println("Voce é estudante? [s/n]");
		char estudante = leia.nextLine().toLowerCase().charAt(0);

		if (idade < 18 || estudante == 's') {
			System.out.println("Paga meia");
		} else {
			System.out.println("Paga inteira");
		}

		leia.close();
	}

}
