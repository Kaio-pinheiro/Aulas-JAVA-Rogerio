package Exercicios;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro positivo N: ");
		int N = leia.nextInt();
		
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (i*i) +  " " + (i*i*i) );
		}
		leia.close();
	}

}
