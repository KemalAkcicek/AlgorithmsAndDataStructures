package LinkedListQuestions;

public class FindTheDuplicateNumber {

	public int findDuplicate(int[] nums) {

		int slowPointer = 0;
		int fastPointer = 0;

		while (true) {

			slowPointer = nums[slowPointer];
			fastPointer = nums[nums[fastPointer]];

			if (slowPointer == fastPointer) {
				break;
			}

		}

		int secondSlowPointer = 0;

		while (true) {

			slowPointer = nums[slowPointer];
			secondSlowPointer = nums[secondSlowPointer];

			if (slowPointer == secondSlowPointer) {
				return secondSlowPointer;
			}

		}

	}

}
