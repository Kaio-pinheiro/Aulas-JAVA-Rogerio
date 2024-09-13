package exercicios;

import java.util.Arrays;

public class ExercicioVetorLucas {

	public static void main(String[] args) {

		int[] myVector = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] myEvenVector = vetoresPares(myVector);

		System.out.println(Arrays.toString(myEvenVector));
	}

	public static int[] vetoresPares(int[] myVector) {

		int aux = 0;
		for (int i = 0; i < myVector.length; i++) {
			if (myVector[i] % 2 == 0) {
				aux++;
			}
		}
		int[] pairVector = new int[aux];
		int j = 0;
		for (int i = 0; i < myVector.length; i++) {
			if (myVector[i] % 2 == 0) {
				pairVector[j] = myVector[i];
				j++;
			}
		}

		return pairVector;
	}

}
