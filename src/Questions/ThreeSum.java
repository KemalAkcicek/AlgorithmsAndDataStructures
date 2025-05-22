package Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {

		List<List<Integer>> resultList = new ArrayList<List<Integer>>();

		Arrays.sort(nums);

		for (int i = 0; i < nums.length - 2; i++) {

			// Aynı i değerini tekrar işlememek için
			if (i > 0 && nums[i] == nums[i - 1])
				continue;

			int left = i + 1;
			int right = nums.length - 1;
			int sum = 0;

			while (left < right) {

				sum = nums[i] + nums[left] + nums[right];

				if (sum == 0) {

					resultList.add(Arrays.asList(nums[i], nums[left], nums[right]));

					while (left < right && nums[left] == nums[left + 1])
						left++;
					// Tekrar eden right değerlerini atla
					while (left < right && nums[right] == nums[right - 1])
						right--;
					left++;
					right--;

				} else if (sum < 0) {

					left++;

				} else {
					right--;
				}

			}

		}

		return resultList;

	}

}
