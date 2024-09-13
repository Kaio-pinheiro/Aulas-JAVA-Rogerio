package aulas;

import java.util.Scanner;

public class exercicio02_exaula37 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int minutos = leia.nextInt();
		double conta = 50.0;
		
		if (minutos > 100) {
			conta += (minutos - 100) * 2.0;
		}
		System.out.printf("Valor da conta = R$ %.2f%n", conta);
		leia.close();
	}

}
