package SearchAlghorithmQuestions;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		// Time complexity=O(n^2) Space complexity=O(1)
		for (int i = 0; i < nums.length - 1; i++) {

			for (int j = i + 1; j < nums.length; j++) {

				int result1 = nums[i] + nums[j];

				if (result1 == target) {

					return new int[] { i, j };
				}

			}
		}

		return null;
	}

	public int[] twoSum1(int[] nums, int target) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {

			if (map.containsKey(target - nums[i])) {

				return new int[] { i, map.get(target - nums[i]) };
			} else {

				map.put(nums[i], i);

			}

		}

		return null;
	}

}
