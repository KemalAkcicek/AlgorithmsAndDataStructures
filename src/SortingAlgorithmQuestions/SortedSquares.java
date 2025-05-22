package SortingAlgorithmQuestions;

import java.util.Map;
import java.util.TreeMap;

public class SortedSquares {

	public int[] sortedSquares(int[] nums) {

		int n = nums.length;
		int[] result = new int[n];
		int left = 0;
		int right = nums.length - 1;
		int index = n - 1;

		while (left <= right) {

			int leftValue = nums[left] * nums[left];
			int rightValue = nums[right] * nums[right];

			if (leftValue > rightValue) {

				result[index--] = leftValue;
				left++;
			} else {
				result[index--] = rightValue;
				right--;
			}

		}

		return result;
	}

	public int[] sortedSquares2(int[] nums) {

		// Space complexity=o(n) time complexity=o(nlogn) dir
		Map<Integer, Integer> countMap = new TreeMap<Integer, Integer>();

		for (int temp : nums) {

			int value = temp * temp;

			countMap.put(value, countMap.getOrDefault(value, 0) + 1);

		}

		int indix = 0;
		for (Map.Entry<Integer, Integer> entrySet : countMap.entrySet()) {

			int key = entrySet.getKey();

			int count = entrySet.getValue();

			for (int i = 0; i < count; i++) {

				nums[indix++] = key;

			}

		}

		return nums;
	}

}
