package SortingAlgorithms;

public class MergeSort {

	public static void mergeSort(int array[], int left, int right) {

		// Burada tek eleman kalana kadar devam et diyoruz
		if (left < right) {

			int mid = (left + right) / 2;

			// Sol tarafı sıralıyoruz
			mergeSort(array, left, mid);

			// Sağ tarafı sıralıyoruz
			mergeSort(array, mid + 1, right);

			// Birleştiriyoruz
			merge(array, left, mid, right);
		}

	}

	private static void merge(int[] array, int left, int mid, int right) {

		// Sol ve sağ boyutlarını ayarladık
		int n1 = mid - left + 1;
		int n2 = right - mid;

		// Sol ve sağ arrayı ayarladık
		int[] leftArray = new int[n1];
		int[] rightArray = new int[n2];

		// Sol taraftaki elemanları verdik
		for (int i = 0; i < n1; i++) {

			leftArray[i] = array[i];
		}

		// Sağ taraftaki elemanları verdik
		for (int j = 0; j < n2; j++) {

			rightArray[j] = array[mid + 1 + j];
		}

		// Birleştirme işlemi yapıyoruz
		int i = 0, j = 0;
		int k = left;

		while (i < n1 && j < n2) {

			if (leftArray[i] < rightArray[j]) {

				array[k] = leftArray[i];

				i++;

			} else {

				array[k] = rightArray[j];
				j++;
			}

			k++;

		}

		// Sol tarafta kalan elemanları yazıyoruz

		while (i < n1) {

			array[k] = leftArray[n1];

			i++;
			k++;
		}

		// Sağ tarafta kalan eleman varsa sıralıyoruz

		while (j < n2) {

			array[k] = rightArray[j];

			j++;
			k++;
		}

	}

}
