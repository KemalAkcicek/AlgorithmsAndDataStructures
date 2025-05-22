package Questions;

import java.util.HashSet;

public class ContainsDupliacate {

	public static boolean containsDuplicate(int[] nums) {

		// Hashset burada aynı değeri iki defa almaz o şekilde kontrole yaparak bulduk
		HashSet<Integer> hashTempSet = new HashSet<Integer>();

		/*
		 * for(int i=0;i<nums.length;i++) {
		 * 
		 * if(tempIntegers.contains(nums[i])) { return true; }
		 * 
		 * tempIntegers.add(nums[i]);
		 * 
		 * }
		 */

		for (int i = 0; i < nums.length; i++) {

			hashTempSet.add(nums[i]);
		}

		return nums.length != hashTempSet.size();

	}

	public static void main(String[] args) {

		int nums1[] = { 1, 2, 3, 1 };
		int nums2[] = { 1, 2, 3, 4 };
		int nums3[] = { 1, 1, 3, 4 };

		System.out.println(containsDuplicate(nums1));
		System.out.println(containsDuplicate(nums2));
		System.out.println(containsDuplicate(nums3));

	}

}
