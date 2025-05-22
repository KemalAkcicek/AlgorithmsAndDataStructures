package SortingAlgorithmQuestions;

import java.util.Map;
import java.util.TreeMap;

public class RelativeSorting {

	public int[] relativeSortArray(int[] arr1, int[] arr2) {

		Map<Integer, Integer> countMap = new TreeMap<Integer, Integer>();

		// Array1 içindeki elemanları map içine gömüyoruz
		for (int value : arr1) {

			countMap.put(value, countMap.getOrDefault(value, 0) + 1);

		}

		// Arrray2 içindeki elemanların hepsini arr1 göre dizayn ettik
		int index = 0;
		for (int num : arr2) {

			int count = countMap.get(num);

			for (int i = 0; i < count; i++) {

				arr1[index++] = num;

			}

			countMap.remove(num);
		}

		// Geri kalan elemanları diziyoruz

		for (Map.Entry<Integer, Integer> temp : countMap.entrySet()) {

			int key = temp.getKey();

			int value = temp.getValue();

			for (int i = 0; i < value; i++) {

				arr1[index++] = key;

			}

		}

		return arr1;
	}

}
