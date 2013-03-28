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

	private void sort(int[] aArray, int[] auxArray, int lo, int hi) {
		if (hi - lo < 1) {
			return;
		}
		int mid = lo + (hi - lo) / 2;
		sort(aArray, auxArray, lo, mid);
		sort(aArray, auxArray, mid + 1, hi);
		merge(aArray, auxArray, lo, hi, mid);
	}

	private void merge(int[] aArray, int[] auxArray, int lo, int hi, int mid) {
		prepareAux(aArray, auxArray, lo, hi);
		int i = lo, j = mid + 1;
		for (int index = lo; index <= hi; index++) {
			if (i > mid) {
				aArray[index] = auxArray[j++];
			} else if (j > hi) {
				aArray[index] = auxArray[i++];
			} else if (auxArray[i] < auxArray[j]) {
				aArray[index] = auxArray[i++];
			} else {
				aArray[index] = auxArray[j++];
			}
		}
	}

	private void prepareAux(int[] aArray, int[] auxArray, int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			auxArray[i] = aArray[i];
		}
	}

}
