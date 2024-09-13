package exercicios;

import java.util.Random;

public class Exercicio03 {
	
	// CRIE UMA FUNÇÃO QUE GERE UMA SENHA ALEATÓRIA PARA O USUÁRIO
	public static int gerarSenha() {
		Random aleatorio = new Random();
		
		// Gerando numero aleatorio
		int numero = aleatorio.nextInt();
		return numero;
		//System.out.println("O numero gerado foi : " + numero);
	}
	
}
