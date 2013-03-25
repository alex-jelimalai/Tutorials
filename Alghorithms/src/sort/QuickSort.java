package sort;

public class QuickSort {
	/**
	 * The sort represent just the principles. In the same way it can be
	 * implemented for other primitive types or objects using Comparable
	 * interface
	 */
	public void sort(final int[] aArray) {
		if (aArray == null) {
			throw new NullPointerException();
		}
		if(aArray.length == 0){
			return;
		}
		sort(aArray, 0, aArray.length-1);
	}

	private void sort(int[] aArray, int lo, int hi) {
		if(hi - lo < 2){
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
			exchange(aArray, i, j);
		}
		exchange(aArray, lo, j);
		return j;
	}
	
	private void exchange(int aArray[], int i, int j){
		int aux = aArray[i];
		aArray[i] = aArray[j];
		aArray[j] = aux;
	}
}
