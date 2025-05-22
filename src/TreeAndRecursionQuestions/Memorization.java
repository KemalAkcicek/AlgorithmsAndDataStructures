package TreeAndRecursionQuestions;

import java.util.HashMap;
import java.util.Map;

public class Memorization {

	Map<Integer, Integer> map = new HashMap<Integer, Integer>();

	public int iteratifFib(int n) {

		int x = 0;
		int y = 1;

		for (int i = 0; i <= n; i++) {

			int temp = y;
			y = y + x;
			x = temp;

		}

		return y;
	}

	public int memorilazition(int n) {

		int result = 0;

		if (map.containsKey(n)) {

			return map.get(n);
		} else {
			result = iteratifFib(n);
			map.put(n, result);
		}

		return result;
	}

}
