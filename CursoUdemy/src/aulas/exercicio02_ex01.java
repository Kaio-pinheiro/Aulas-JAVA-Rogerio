package aulas;

import java.util.Scanner;

public class exercicio02_ex01 {

	public static void main(String[] args) {
	
		/*Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não*/
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número qualquer: ");
		int numero = leia.nextInt();
		
		// Verifica se o número é positivo
		if (numero > 0) {
			System.out.printf("O número %d é positivo! %n", numero);
		} else {
			System.out.printf("O número %d é negativo! %n", numero);
		}
		leia.close();
	}

}
