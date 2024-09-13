package Exemplos;

import java.util.Scanner;

public class JogoDaForca {

	public static void main(String[] args) {

		// Passo 1: while ()
		// boolean acertou = false;
		// Passo 2: Mensagem para digitar uma letra e scanner capturar
		// Passo 3: for percorrer a palavraSecreta e ver se a letra contém
		// if (letra == palavraSecreta.charAt(i))
		// palavra.setCharAt(i,letra)
		// acertou = true;
		// Passo 4 (fora do for): if(acertou == false)
		// tentativas++;
		// Passo 5: analisar se ganhei, comparar palavraSecreta com palavra
		// tostring.equals
		// Passo 6: analisar se perdi, comparar tentativas com maxTentativas
		// FIM DO WHILE

		Scanner leia = new Scanner(System.in);
		String palavraSecreta = "teclado";
		int maxTentativas = 6;
		int tentativas = 0;
		StringBuilder palavra = new StringBuilder();
		String letrasDigitadas = "";

		for (int i = 0; i < palavraSecreta.length(); i++) {
			palavra.append("_");
		}

		while (true) {
			boolean acertou = false;
			System.out.println(palavra);
			System.out.println("Letras já digitadas: " + letrasDigitadas);
			System.out.println("Digite uma letra: ");
			char letra = leia.nextLine().charAt(0);

			String letraa = String.valueOf(letra);
			if (letrasDigitadas.contains(letraa)) {
				System.out.println("Letra já digitada");
			} else {
				letrasDigitadas += letra + " ";
				for (int i = 0; i < palavraSecreta.length(); i++) {
					if (letra == palavraSecreta.charAt(i)) {
						palavra.setCharAt(i, letra);
						acertou = true;
					}
				}

				if (acertou == false) {
					tentativas++;
				}

				if (palavraSecreta.equals(palavra.toString())) {
					System.out.println("Você ganhou!");
					break;
				}

				if (tentativas == maxTentativas) {
					System.out.println("Você perdeu!");
					break;

				}

			}
		}
		leia.close();
	}

}
