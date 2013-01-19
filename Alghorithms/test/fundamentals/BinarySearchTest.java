package fundamentals;

import org.junit.Assert;
import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void firtElement() {
		int[] array = new int[] { 0, 2, 4, 6, 8, 10, 15, 20, 29 };
		BinarySearch binarySearch = new BinarySearch();
		Assert.assertEquals(0, binarySearch.search(0, array));
	}

	@Test
	public void thirdElement() {
		int[] array = new int[] { 0, 2, 4, 6, 8, 10, 15, 20, 29 };
		BinarySearch binarySearch = new BinarySearch();
		Assert.assertEquals(3, binarySearch.search(6, array));
	}

	
	
	@Test
	public void lastElement() {
		int[] array = new int[] { 0, 2, 4, 6, 8, 10, 15, 20, 29 };
		BinarySearch binarySearch = new BinarySearch();
		Assert.assertEquals(8, binarySearch.search(29, array));
	}

	
	
	//@Test
	public void noExistingElement() {
		int[] array = new int[] { 0, 2, 4, 6, 8, 10, 15, 20, 29 };
		BinarySearch binarySearch = new BinarySearch();
		Assert.assertEquals(11, binarySearch.search(-1, array));
	}

	
	
}
