package exemplos;

public class Assentos {

	public static void main(String[] args) {

		// 0 OCUPADO
		// 1 DISPONÍVEL
		int[][] assentos = { { 0, 0, 1, 1 },
							 { 0, 0, 0, 1 }, 
							 { 0, 1, 1, 0 }, 
							 { 1, 0, 0, 0 }

		};

		

		if (assentos[2][2] == 1) {
			System.out.println("Assento disponível");
		} else {
			System.out.println("Assento ocupado");
		}

	}

}
