package sort;

import util.Utility;

public class InsertSort implements Sort {

	@Override
	public void sort(int[] aArray) {
		for (int i = 0; i < aArray.length; i++) {
			for (int j = aArray.length-1; j > i; j--) {
				if(aArray[j]<aArray[i]){
					Utility.exchange(aArray, i, j);
				}
			}
		}

	}

}
