package SearchAlghorithmQuestions;

public class BinarySearch {

	public int search(int[] nums, int target) {

		int firstPointer = 0;
		int lastPointer = nums.length - 1;

		while (firstPointer <= lastPointer) {

			int mid = (firstPointer + lastPointer )/ 2;

			if (nums[mid] == target) {

				return mid;

			} else {

				if (nums[mid] < target) {

					firstPointer = mid + 1;

				} else {

					lastPointer = mid - 1;

				}

			}

		}

		return -1;
	}
}
