package Graph;

import java.util.Map;
import java.util.TreeMap;

public class GraphTest {

	public static void main(String[] args) {

		// Sıralarken key küçükten büyüğe doğru sıralar
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();

		map.put(10, 10);
		map.put(2, 20);
		map.put(3, 40);
		map.put(4, 10);

		System.out.println(map);
	}
}
