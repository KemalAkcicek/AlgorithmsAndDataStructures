package Questions;

public class SingleNumber {

	public static int singleNumber(int[] nums) {

		int temp = 0;

		for (int i = 0; i < nums.length; i++) {

			temp = temp ^ nums[i];

		}

		return temp;

	}

	public static void main(String[] args) {

		int nums1[] = { 2, 2, 1 };
		int nums2[] = { 4, 1, 2, 1, 2 };
		int nums3[] = { 1 };
		int nums4[] = { 3, 3, 5 };

		System.out.println(singleNumber(nums1));
		System.out.println(singleNumber(nums2));
		System.out.println(singleNumber(nums3));
		System.out.println(singleNumber(nums4));

	}

}
