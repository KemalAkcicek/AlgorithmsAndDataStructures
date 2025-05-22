package SortingAlgorithmQuestions;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class KClosestPointToOrigin {

	public int[][] kClosest(int[][] points, int k) {

		PriorityQueue<int[]> pq = new PriorityQueue<int[]>(new Comparator<int[]>() {

			// Burada her eleman eklediğinde en baştan itabaren karşılaştırılarak doğru
			// konuma yerleştirilir ve min heap oluşur
			@Override
			public int compare(int[] o1, int[] o2) {

				// Bir eleman eklendiği ve çıkarıldığı zaman bu işlemler gerçekleştilir Sonucu
				// negatif ise o1 alır pozitif ise o2 alır
				return distance(o1) - distance(o2);
			}

		});

		for (int[] temp : points) {

			// Elemanları minheap sırasına göre ekler
			pq.add(temp);
		}

		int result[][] = new int[k][2];

		for (int i = 0; i < k; i++) {

			// Burada en üsteki(en küçük) elemanı çıkartıp tekrardan min-heap işlemleri
			// yapar
			result[i] = pq.poll();
		}

		return result;
	}

	private int distance(int[] point) {

		return point[0] * point[0] + point[1] * point[1];
	}

	public int[][] kClosest2(int[][] points, int k) {

		Map<Integer, int[]> map = new TreeMap<Integer, int[]>();

		int[][] result = new int[k][];

		for (int[] temp : points) {

			int key = (temp[0] * temp[0]) + (temp[1] * temp[1]);

			map.put(key, temp);

		}

		int i = 0;

		for (Map.Entry<Integer, int[]> entry : map.entrySet()) {

			if (i < k) {

				result[i] = entry.getValue();

				i++;

			}

		}

		return result;
	}
}
