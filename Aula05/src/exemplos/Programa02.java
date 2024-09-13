package exemplos;

import java.util.Scanner;

public class Programa02 {

	public static void main(String[] args) {

		// Módulo
		// ta pegando a classe operações e pegando a função/método somar para somar o primeiro numero com o segundo numero
		int resultado = Operacoes.somar(10, 8);
		System.out.println(resultado);
		
		// OBJETO
		Scanner leia = new Scanner(System.in);
		//int num = leia.nextInt();
		
		leia.close();
		
	}

}
