package Questions;

import java.util.HashMap;

public class MajorityElements {

	public static int majorityElement(int[] nums) {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		// Time =O(n) space=O(n)

		int length = nums.length / 2;

		int count = 0;

		for (int i = 0; i < nums.length; i++) {

			if (hashMap.containsKey(nums[i])) {

				count = hashMap.get(nums[i]) + 1;

				hashMap.put(nums[i], count);

				count = 0;

			} else {

				hashMap.put(nums[i], 1);

			}

			if (hashMap.get(nums[i]) > length) {

				return nums[i];

			}

		}

		return -1;
	}

	public static int boyerMoore(int[] nums) {

		int result = nums[0];
		int count = 1;

		for (int i = 1; i < nums.length; i++) {

			if (nums[i] == result) {
				count++;
			} else {
				count--;
			}

			if (count == 0) {
				result = nums[i];
				count = 1;
			}

		}

		return result;
	}

	public static void main(String[] args) {

		int nums1[] = { 3, 2, 3 };
		int nums2[] = { 5, 2, 1, 1, 1, 2, 2, 1 };
		int nums3[] = { 1 };
		int nums4[] = { 3, 3, 5 };

		System.out.println(boyerMoore(nums1));
		System.out.println(boyerMoore(nums2));
		System.out.println(boyerMoore(nums3));
		System.out.println(boyerMoore(nums4));

		System.out.println("*****************");

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		// key value ilişkisi vardır aynı key den 10 tane de yazsan en sonucusunu alır
		hashMap.put(1, 20);
		hashMap.put(2, 30);
		hashMap.put(3, 20);
		hashMap.put(3, 40);
		hashMap.put(3, 40);

		System.out.println(hashMap.toString());
		System.out.println(hashMap.get(1));
		System.out.println(hashMap.get(2));
		System.out.println(hashMap.containsKey(1));
		System.out.println(hashMap.containsKey(4));

	}

}
