package exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
	 Scanner leia = new Scanner(System.in);
	 System.out.println("Digite o dia da semana: ");
	 String diaDaSemana = leia.nextLine().toLowerCase();
	
	 
	 if (diaDaSemana.contains("segunda")) {
		 System.out.println("Dia útil");
	 } else if (diaDaSemana.contains("terça")  || diaDaSemana.contains("terca")) {
		 System.out.println("Dia útil");
	 } else if (diaDaSemana.contains("quarta")) {
		 System.out.println("Dia útil");
	 } else if (diaDaSemana.contains("quinta")) {
		 System.out.println("Dia útil");
	 } else if (diaDaSemana.contains("sexta")) {
		 System.out.println("Dia útil");
	 } else if (diaDaSemana.contains("sabado")) {
		 System.out.println("Sábado é final de semana");
	 } else if (diaDaSemana.contains("domingo")) {
		 System.out.println("Domingo é final de semana");
	 }
	 leia.close();
	}

}
