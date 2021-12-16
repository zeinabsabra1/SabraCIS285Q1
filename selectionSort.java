import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testSelectionSort1 {
	public static void sort(int arr[]) {
		int N = arr.length;
		int i, j=0, pos = 0;
		int temp;
		for (i = 0; i < N; i++) {
			pos = j;
			for (j = i + 1; j < N-1; j++)
				//finding the min pos
				if (arr[j]<arr[pos])
					pos = j;
		}

		/* Swap arr[i] and arr[pos]*/
	temp = arr[i];
	arr[i] = arr[pos];
	arr[pos] = temp;
}
	@Test
	void testPositive() {
		int arr[]= {9,1,3};
		int exp[]= {1,3,9};
		SelectionSort.sort(arr);
		assertArrayEquals(exp, arr);
	}

	@Test
	void testNegative() {
		int arr[]= {-9,-1,-3};
		int exp[]= {-9,-3,-1};
		SelectionSort.sort(arr);
		assertArrayEquals(exp, arr);
	}
	@Test
	void testMixed() {
		int arr[]= {-9,1,-3};
		int exp[]= {-9,-3,1};
		SelectionSort.sort(arr);
		assertArrayEquals(exp, arr);
	}
}
