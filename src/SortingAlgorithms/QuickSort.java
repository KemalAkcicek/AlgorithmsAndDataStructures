package SortingAlgorithms;

public class QuickSort {

	public static void quickSort(int array[], int low, int high) {

		if (low < high) {

			// Pivot index bulduk
			int pivotIndex = partition(array, low, high);

			// Pivotun solunu sıraldık
			quickSort(array, low, pivotIndex - 1);

			// Pivottun sağını sıraladık
			quickSort(array, pivotIndex + 1, high);

		}

	}

	private static int partition(int[] array, int low, int high) {

		int pivot = array[high];
		int i = low - 1;

		for (int j = low; j < high; j++) {

			if (array[j] < array[pivot]) {

				i++;

				swap(array, i, j);

			}

		}

		// Pivottu son değere koyduk
		swap(array, i + 1, high);

		return i + 1;
	}

	private static void swap(int[] array, int i, int j) {

		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;

	}

}
