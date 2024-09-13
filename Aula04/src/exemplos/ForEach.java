package exemplos;

public class ForEach {

	public static void main(String[] args) {

		
		int[] idades = {10,15,25,35,60};
		for (int i = 0; i < idades.length; i++) {
			System.out.print(idades[i] + " ");
		}
		System.out.println();
		
		// for each é usado quando nao precisa achar a posição e é codigo limpo mais visivel e mais utilizado
		for (int idade : idades) {
			System.out.print(idade + " ");
		}
		System.out.println();
		String[] nomes = {"Fabio","Arthur","Anderson"};
		for (String nome : nomes) {
			System.out.print(nome + " ");
		}
	}

}
