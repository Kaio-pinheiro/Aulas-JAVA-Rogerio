package exemplos;

public class Operacoes {

	public static int somar(int num1, int num2) {
		return num1 + num2;
	}
	
	public static int substrair(int num1, int num2) {
		return num1 - num2;
	}
	
	public static int multiplicar(int num1, int num2) {
		return num1 * num2;
	}
	
	public static double dividir(int num1, int num2) {
		if (num2 != 0) {
			double resultado = (double) num1/num2;
			return resultado;
		}
		return -55;
	}
}
