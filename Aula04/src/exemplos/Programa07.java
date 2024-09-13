package exemplos;

public class Programa07 {

	public static void main(String[] args) {

		String frase = "Maça Laranja Uva";
		String[] frutas = frase.split(" ");
		
		for (String fruta : frutas) {
			System.out.println(fruta);
		}
		
		String data = "2024-04-30";
		String[] dataSeparada = data.split("-");		
System.out.println("Dia " + dataSeparada[2]);
System.out.println("Mes " + dataSeparada[1]);
System.out.println("Ano " + dataSeparada[0]);

		
	}

}
