package exercicios;

import java.util.Scanner;

public class Exercicio02_continuação {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// pedindo para informar o valor da base do triangulo
		System.out.println("Digite a base do triangulo: ");
		double base = leia.nextDouble();
		
		// pedindo para informar a altura do triangulo
		System.out.println("Digite a altura do triangulo: ");
		double altura = leia.nextDouble();
		
		// chamando a função para calcular a aréa do triangulo com base nas respostas acima
		double resultado = Exercicio02.area(base, altura);
		System.out.println("A área do triangulo é: " + resultado); // imprimindo a area do triangulo
		
		leia.close();
	}

}
