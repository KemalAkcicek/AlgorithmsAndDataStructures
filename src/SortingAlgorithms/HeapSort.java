package SortingAlgorithms;

public class HeapSort {

	// Heapsort yaptığımız işlem array olarak verilen veriyi ağaç olarak düşünüp
	// işlem yapıyoruz
	void heapify(int array[], int n, int i) {

		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * 2 + 1;

		if (left < n && array[largest] > array[left]) {
			largest = left;
		}

		if (right < n && array[right] > array[largest]) {

			largest = right;

		}

		if (i != largest) {

			int swap = array[i];
			array[i] = array[largest];
			array[largest] = swap;

			heapify(array, n, largest);

		}

	}

	void heapSort(int array[]) {

		int n = array.length;

		// Max heap oluşturmuş oluyoruz
		for (int i = n / 2 - 1; i >= 0; i--) {

			heapify(array, n, i);
		}

		// Burada her seferinde bir eleman çıkartıp kalan elemanlar arasında heapify
		// yapıyoruz
		for (int i = n - 1; i > 0; i--) {

			int temp = array[0];
			array[0] = array[i];
			array[i] = temp;

			heapify(array, n, 0);

		}

	}

}
