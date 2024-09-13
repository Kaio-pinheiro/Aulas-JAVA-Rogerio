package exercicios;

public class Exercicio05 {

	// ESCREVE UMA FUNÇÃO QUE REALIZER A COMPARAÇÃO DE DUAS STRINGS, RETORNE TRUE
	// CASO AS STRINGS FOREM IGUAIS.
	public static boolean comparandoStrings(String a, String b) {

		return a.equals(b);

		// return a.trim().equalsIgnoreCase(b.trim()); 
		
		// trim() é para tirar os espaços em branco
		// IgnoreCase para ignorar letras maiusculas ou minusculas

		// poderia ser assim também
		/*
		 * if (a.equals(b)) { return true;
		 * 
		 * } else { return false; }
		 */

	}
}
