package TreeAndRecursionQuestions;

public class HouseHobber3 {

	public int rob(TreeNode root) {

		int[] result = robHelper(root);

		return Math.max(result[0], result[1]);
	}

	private int[] robHelper(TreeNode root) {

		if (root == null) {

			return new int[] { 0, 0 };
		}

		int[] left = robHelper(root.left);
		int[] right = robHelper(root.right);

		int[] result = new int[2];

		result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);

		result[1] = root.val + left[0] + right[0];

		return result;
	}

}
