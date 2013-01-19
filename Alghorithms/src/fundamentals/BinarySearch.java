package fundamentals;

public class BinarySearch {

	public int search(int aElement, int[] aArray) {
		return search(aElement, aArray, 0, aArray.length - 1);
	}

	private int search(int aElement, int[] aArray, int lowPosition,
			int highPosition) {
		int middle = 0;
		if (lowPosition <= highPosition) {
			middle = lowPosition + (highPosition - lowPosition) / 2;
			if (aElement == aArray[middle]) {
				return middle;
			} else if (aElement > aArray[middle]) {
				lowPosition = middle + 1;
			} else if (aElement < aArray[middle]) {
				highPosition = middle - 1;
			}
			return search(aElement, aArray, lowPosition, highPosition);
		}
		return -1;

	}

}
