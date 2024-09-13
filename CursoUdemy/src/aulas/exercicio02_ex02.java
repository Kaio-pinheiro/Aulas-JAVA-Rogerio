package aulas;

import java.util.Scanner;

public class exercicio02_ex02 {

	public static void main(String[] args) {

		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número qualquer: ");
		int numero = leia.nextInt();
		
		 // Verifica se o número é par
		if (numero % 2 == 0) {
			System.out.println("Este número é PAR");
		} else {
			System.out.println("Este número é IMPAR");
		}
		leia.close();
	}

}
