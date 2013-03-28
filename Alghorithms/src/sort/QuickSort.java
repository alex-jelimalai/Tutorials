package sort;

import util.Utility;

public class QuickSort implements Sort{

	@Override
	public void sort(final int[] aArray) {
		if (aArray == null) {
			throw new NullPointerException();
		}
		sort(aArray, 0, aArray.length-1);
	}

	private void sort(int[] aArray, int lo, int hi) {
		if(hi <= lo){
			return;
		}
		int partitionIndex = partition(aArray, lo, hi);
		sort(aArray, lo, partitionIndex - 1);
		sort(aArray, partitionIndex + 1, hi);
	}

	private int partition(int[] aArray, int lo, int hi) {
		int i = lo, j = hi+1;		
		while(true){
			while(aArray[++i]<aArray[lo]){
				if(i==hi)break;
			}
			while(aArray[--j]>aArray[lo]){
				if(j==lo)break;
			}
			if(i>=j){
				break;
			}
		
			Utility.exchange(aArray, i, j);
		}
		Utility.exchange(aArray, lo, j);
		return j;
	}
}
