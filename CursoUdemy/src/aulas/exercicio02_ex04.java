package aulas;

import java.util.Scanner;

public class exercicio02_ex04 {

	public static void main(String[] args) {

		/*
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
		 * jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
		 * uma duração mínima de 1 hora e máxima de 24 horas.
		 */

		Scanner scanner = new Scanner(System.in);

		// Solicita a hora inicial e a hora final do jogo
		System.out.println("Digite a hora inicial do jogo:");
		int horaInicial = scanner.nextInt();
		System.out.println("Digite a hora final do jogo:");
		int horaFinal = scanner.nextInt();

		// Calcula a duração do jogo
		int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		} else {
			duracao = 24 - horaInicial + horaFinal;
		}

		// Imprime a duração do jogo
		System.out.println("A duração do jogo é de " + duracao + " horas.");

		scanner.close();
	}

}
