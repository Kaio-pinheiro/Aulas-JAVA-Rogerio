package Exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);                                    // COMENTÁRIOS SOMENTE PARA SIMPLIFICAR PARA MIM OQUE ESTÁ OCORRENDO
                                                                                  
		System.out.println("Digite quantas contas de dividir você quer fazer: "); // pergunta para saber quantas contas de dividir vou fazer
		int N = leia.nextInt();                                                   // botando o numero de contas que vou fazer dentro da variavel N

		for (int i = 0; i < N; i++) {                                             // para cada calculo de dividir que eu fizer, acresentar +1 no numero de vezes que ja foi calculado
			System.out.println("Digite dois numeros: ");
			double numero1 = leia.nextDouble();                                   // para ler o primeiro numero e coloca-lo na variavel numero1
			double numero2 = leia.nextDouble();                                   // para ler o segundo numero e coloca-lo na variavel numero2

			if (numero2 == 0) {                                                   // se numero2 for 0 encerra o programa
				System.out.println("Divisão impossivel");
				break;
			} else {
				double resultado = numero1 / numero2;
				System.out.println("O resultado da divisão entre o número " + numero1 + " e o número " + numero2 + " é " + resultado);

			}
		}
		leia.close();
	}

}
