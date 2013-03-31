package sort;
import util.Utility;

public class ShellSort implements Sort {

	@Override
	public void sort(int[] aArray) {

		int step = getMaxStep(aArray);
		while (step >= 1) {
			sortForStep(aArray, step);
			step = step / 3;
		}
	}

	private void sortForStep(int[] aArray, int step) {
		for (int i = step; i < aArray.length; i++) {
			hSort(aArray, step, i);
		}
	}

	private void hSort(int[] aArray, int stepH, int i) {
		for (int j = i; j >= stepH && aArray[j]<aArray[j-stepH]; j -= stepH) {
				Utility.exchange(aArray, j, j-stepH);
		}
	}

	private int getMaxStep(int[] aArray) {
		int step = 1;
		while (step < aArray.length / 3) {
			step = 3 * step + 1;
		}
		return step;
	}
}
