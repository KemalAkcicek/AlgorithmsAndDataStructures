package SortingAlgorithmQuestions;

import java.util.Map;
import java.util.TreeMap;

public class SortColors {

	public void sortColors(int[] nums) {

		int left = 0;
		int mid = 0;
		int right = nums.length - 1;

		while (mid <= right) {

			if (nums[mid] == 0) {

				int temp = nums[left];
				nums[left] = nums[mid];
				nums[mid] = temp;

				mid++;
				left++;
			} else if (nums[mid] == 1) {

				mid++;
			} else {

				int temp = nums[mid];
				nums[mid] = nums[right];
				nums[right] = temp;

				right--;

			}

		}

	}

	public void sortColors2(int[] nums) {

		// Time complexity=o(nlogn)
		// Space complexity=o(n)
		Map<Integer, Integer> countMap = new TreeMap<Integer, Integer>();

		for (int temp : nums) {

			countMap.put(temp, countMap.getOrDefault(temp, 0) + 1);

		}

		int index = 0;
		for (Map.Entry<Integer, Integer> entrySet : countMap.entrySet()) {

			int key = entrySet.getKey();

			int count = entrySet.getValue();

			for (int i = 0; i < count; i++) {

				nums[index++] = key;

			}

		}

	}

}
