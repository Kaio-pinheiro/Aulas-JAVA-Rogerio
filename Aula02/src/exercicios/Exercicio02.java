package exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero de 0 a 10");
		int numero = leia.nextInt();
		
		double resultado = numero % 2;
		
		if (resultado == 0) {
			System.out.println("Par");	
		} else 
			System.out.println("Impar");
		leia.close();
			
		}
}
