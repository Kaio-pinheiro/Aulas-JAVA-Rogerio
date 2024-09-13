package exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um numero");
		int num = leia.nextInt();
		
		if (num > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		leia.close();
			
		   
	}

}
