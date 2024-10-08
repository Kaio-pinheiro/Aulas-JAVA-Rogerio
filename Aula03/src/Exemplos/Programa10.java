package Exemplos;

import java.util.Random;
import java.util.Scanner;

public class Programa10 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		String senhaGerada = "";
		String simbolos = "";

		String letrasMaiusculas = "ABCDEFGHiJKLMNOPQRSTUVXWYZ";
		String letrasMinusculas = "abcdefghijklmnopqrstuvxwyz";
		String numeros = "0123456789";
		String caracter = "@#%&*";

		System.out.println("Qual o comprimento da senha? ");
		int comprimento = leia.nextInt();
		leia.nextLine();

		System.out.println("Você deseja na senha letras maiúsculas? [s/n]");
		char opcao1 = leia.nextLine().charAt(0);

		System.out.println("Você deseja na senha letras minúsculas? [s/n]");
		char opcao2 = leia.nextLine().charAt(0);

		System.out.println("Você deseja na senha números? [s/n]");
		char opcao3 = leia.nextLine().charAt(0);

		System.out.println("Você deseja na senha símbolos? [s/n]");
		char opcao4 = leia.nextLine().charAt(0);

		if (opcao1 == 's') {
			simbolos += letrasMaiusculas;
		}
		if (opcao2 == 's') {
			simbolos += letrasMinusculas;
		}
		if (opcao3 == 's') {
			simbolos += numeros;
		}
		if (opcao4 == 's') {
			simbolos += caracter;
		}

		Random aleatorio = new Random();
		for (int i = 1; i <= comprimento; i++) {

			int posicao = aleatorio.nextInt(0, simbolos.length());
			senhaGerada += simbolos.charAt(posicao);
		}

		System.out.println("Senha gerada: " + senhaGerada);
		
		leia.close();

	}

}
