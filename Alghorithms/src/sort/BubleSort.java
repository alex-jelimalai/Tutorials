package sort;

public class BubleSort implements Sort {

	@Override
	public void sort(int[] aArray) {
		int aux;
		for (int i = 0; i < aArray.length; i++) {
			for (int j = 0; j < aArray.length - 1; j++) {
				if (aArray[j] > aArray[j + 1]) {
					aux = aArray[j];
					aArray[j] = aArray[j + 1];
					aArray[j + 1] = aux;
				}
			}
		}
	}
}
