package sort;



import static org.junit.Assert.assertArrayEquals;
import org.junit.Test;

public class SortTest {
	private QuickSort quickSort = new QuickSort();

	@Test(expected = NullPointerException.class)
	public void nullThrowsException() {
		quickSort.sort(null);
	}

	@Test
	public void emptyReturnSameArray() {
		final int array[] = new int[0];
		quickSort.sort(array);
		assertArrayEquals("The array is not empty",new int[]{}, array);
	}
	
	@Test
	public void three_elements() {
		final int array[] = new int[]{5,1,6};
		quickSort.sort(array);
		assertArrayEquals("The array is not empty",new int[]{1,5,6}, array);
	}
	
	@Test
	public void seven_elements() {
		final int array[] = new int[]{5,1,6,12,7,20,55};
		quickSort.sort(array);
		assertArrayEquals("The array is sorted",new int[]{1,5,6,7,12,20,55}, array);
	}
	
	
	@Test
	public void ten_elements() {
		final int array[] = new int[]{5,1,6,6,6,8,1,5,5,8};
		quickSort.sort(array);
		assertArrayEquals("The array is not sorted",new int[]{1,1,5,5,5,6,6,6,8,8}, array);
	}
}
