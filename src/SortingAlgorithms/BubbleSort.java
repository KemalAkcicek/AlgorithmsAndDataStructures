package SortingAlgorithms;

public class BubbleSort {

	public void bubbleSort(int array[]) {

		int n = array.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; i < n - i; j++) {

				if (array[j] > array[j + 1]) {

					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;

				}

			}

		}

	}

}
