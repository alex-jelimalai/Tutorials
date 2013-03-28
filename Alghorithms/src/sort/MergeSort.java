package sort;

import java.util.Arrays;

public class MergeSort implements Sort {

	@Override
	public void sort(int[] aArray) {
		if (aArray == null) {
			throw new NullPointerException();
		}
		int auxArray[] = Arrays.copyOf(aArray, aArray.length);
		sort(aArray, auxArray, 0, aArray.length - 1);
	}

	private void sort(int[] aArray, int[] auxArray, int i, int j) {

	}

}
