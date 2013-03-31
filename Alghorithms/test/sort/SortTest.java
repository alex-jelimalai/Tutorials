package sort;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SortTest {
	private Sort sorter;

	public SortTest(final Sort aSorter) {
		sorter = aSorter;
	}

	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[][] { { new QuickSort() },
				{ new MergeSort() }, {new BubleSort()},{new SelectionSort()} ,{new InsertSort()},{new ShellSort()}});
	}

	@Test(expected = NullPointerException.class)
	public void nullThrowsException() {
		sorter.sort(null);
	}

	@Test
	public void emptyReturnSameArray() {
		final int array[] = new int[0];
		sorter.sort(array);
		assertArrayEquals("The array is not empty", new int[] {}, array);
	}

	@Test
	public void three_elements() {
		final int array[] = new int[] { 5, 1, 6 };
		sorter.sort(array);
		assertArrayEquals("The array is not empty", new int[] { 1, 5, 6 },
				array);
	}

	@Test
	public void seven_elements() {
		final int array[] = new int[] { 5, 1, 6, 12, 7, 20, 55 };
		sorter.sort(array);
		assertArrayEquals("The array is sorted", new int[] { 1, 5, 6, 7, 12,
				20, 55 }, array);
	}

	@Test
	public void ten_elements() {
		final int array[] = new int[] { 5, 1, 6, 6, 6, 8, 1, 5, 5, 8 };
		sorter.sort(array);
		assertArrayEquals("The array is not sorted", new int[] { 1, 1, 5, 5, 5,
				6, 6, 6, 8, 8 }, array);
	}
}
