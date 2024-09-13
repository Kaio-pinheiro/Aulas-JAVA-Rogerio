package exemplos;

import java.util.Scanner;

public class Programa01 {

	public static void main(String[] args) {

		// estrutura condicional SIMPLES
		int numero = -5;

		if (numero > 0) {
			System.out.println("O numero é positivo");
		}

		if (numero >= 0) {
			System.out.println("O numero é positivo");
		} else {
			System.out.println("O numero é negativo");
		}

		System.out.println("Programa encerrado");
		
		// estrutura condicional COMPOSTA

		if (numero > 0) {
			System.out.println("O numer é positivio");

		} else if (numero < 0) {
			System.out.println("O numero é negativo");
		} else {
			System.out.println("O numero é igual a zero ");
		}
		
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Bem vindo!");
		System.out.println("Digite 1 para carnes");
		System.out.println("Digite 2 para bebidas");
		System.out.println("Digite 3 para sobremesas");
		
		int opcao = leia.nextInt();
		
		if (opcao == 1) {
			System.out.println("Voce escolheu o menu de carnes");
		} else if (opcao ==2) {
			System.out.println("Voce escolheu o menu bebidas");
		} else if (opcao ==3) {
			System.out.println("Voce escolheu o menu de sobremesas");
		} else {
			System.out.println("Digite uma opção valida");
		}
		
		
		leia.close();
		
		

	}
}
