package exemplos;

import java.util.Scanner;

public class JodoDaVelha {

	public static void main(String[] args) {

		char[][] tabuleiro = new char[3][3];
		char jogadorAtual = 'X';
		jogar(jogadorAtual, tabuleiro);
	}

	private static void jogar(char jogadorAtual, char[][] tabuleiro) {

		Scanner leia = new Scanner(System.in);
		inicializarTabuleiro(tabuleiro);
		boolean jogoRolando = true;
		while (jogoRolando == true) {
			mostrarTabuleiro(tabuleiro);
			System.out.println("Jogador: " + jogadorAtual + ", digite a linha e a coluna");
			int linha = leia.nextInt() - 1;
			int coluna = leia.nextInt() - 1;

			// PARA NÃO BOTA NÚMERO QUE NÃO PODE, E PARA VER SE TIVER VAZIO O ESPAÇO AI PODE INSERIR O VALOR
			if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3 && tabuleiro[linha][coluna] == ' ') {

				// INSERINDO VALOR NO TABULEIRO
				tabuleiro[linha][coluna] = jogadorAtual;

				if (verificarVitoria(tabuleiro, jogadorAtual) == true) {
					leia.nextLine(); //LIMPEZA DE BUFFER
					mostrarTabuleiro(tabuleiro);
					System.out.println("Jogador " + jogadorAtual + " venceu!");
					System.out.println("Deseja jogar novamente? [Sim] ou [Não]");
					String resposta = leia.nextLine();
					if (resposta.equals("Sim")) {
						inicializarTabuleiro(tabuleiro);
					} else {
						System.out.println("Jogo encerrado!");
						jogoRolando = false;

					}

				} else if (verificarEmpate(tabuleiro) == true) {
					mostrarTabuleiro(tabuleiro);
					System.out.println("Empate");
					jogoRolando = false;
				}
				// TROCANDO DE JOGADOR
				if (jogadorAtual == 'X') {
					jogadorAtual = 'O';
				} else {
					jogadorAtual = 'X';
				}

			} else {
				System.out.println("Jogada inválida. Tente novamente!");
			}
			leia.close();
		}
	}

	private static boolean verificarEmpate(char[][] tabuleiro) {

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[0].length; j++) {
				if (tabuleiro[i][j] == ' ') {
					// significa que o jogo nao acabou
					return false;
				}
			}
		}

		return true;
	}

	private static boolean verificarVitoria(char[][] tabuleiro, char jogadorAtual) {
		
		// Verificando diagonáis
		if (tabuleiro[0][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[2][2] == jogadorAtual) {

			return true;
		}
		if (tabuleiro[2][0] == jogadorAtual && tabuleiro[1][1] == jogadorAtual && tabuleiro[0][2] == jogadorAtual) {

			return true;
		}
		// Verificando linhas
		for (int i = 0; i < 3; i++) {
			if (tabuleiro[i][0] == jogadorAtual && tabuleiro[i][1] == jogadorAtual && tabuleiro[i][2] == jogadorAtual) {
				return true;
			}
		}
		
		// Verificando colunas
				for (int j = 0; j < 3; j++) {
					if (tabuleiro[0][j] == jogadorAtual && tabuleiro[1][j] == jogadorAtual && tabuleiro[2][j] == jogadorAtual) {
						return true;
					}
				}

		return false;
	}

	public static void inicializarTabuleiro(char[][] tabuleiro) {

		for (int i = 0; i < tabuleiro.length; i++) {
			for (int j = 0; j < tabuleiro[0].length; j++) {
				tabuleiro[i][j] = ' ';
			}
		}
	}

	public static void mostrarTabuleiro(char[][] tabuleiro) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(tabuleiro[i][j]);
				if (j < 2) {
					System.out.print(" | ");
				}
			}
			System.out.println();
			if (i < 2) {
				System.out.println("--+---+---");
			}
		}
	}

}
