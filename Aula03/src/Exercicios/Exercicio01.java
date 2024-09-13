package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int senhaCorreta = 2002;
		
		while(true) {
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
