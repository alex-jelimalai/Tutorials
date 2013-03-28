package util;

public class Utility {

	public static void exchange(int[] aArray, int i, int j) {
		int aux = aArray[i];
		aArray[i] = aArray[j];
		aArray[j] = aux;
	}

}
