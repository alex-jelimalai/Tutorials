package search;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import search.BinarySearch;

@RunWith(value = Parameterized.class)
public class BinarySearchTest {
	private static int[] array;
	private static BinarySearch binarySearch;

	@BeforeClass
	public static void setUpClass() {
		array = new int[] { 0, 2, 4, 6, 8, 10, 15, 20, 29 };
		binarySearch = new BinarySearch();
	}

	private int value;
	private int expected;

	public BinarySearchTest(int value, int expected) {
		this.value = value;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Integer[]> getTestParameters() {
		return Arrays.asList(new Integer[][] { { 0, 0 }, { 6, 3 }, { 29, 8 },
				{ 11, -1 } });

	}

	@Test
	public void elementIndex() {
		Assert.assertEquals(expected, binarySearch.search(value, array));
	}

}
