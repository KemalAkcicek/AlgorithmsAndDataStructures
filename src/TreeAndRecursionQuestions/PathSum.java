package TreeAndRecursionQuestions;

import java.util.Stack;

public class PathSum {

	public boolean hasPathSum(TreeNode root, int targetSum) {

		Stack<TreeNode> path = new Stack<TreeNode>();

		Stack<Integer> sumPath = new Stack<Integer>();

		path.add(root);
		sumPath.add(root.val);

		while (!path.isEmpty()) {

			TreeNode currentNode = path.pop();

			int sum = sumPath.pop();

			if (currentNode.right == null && currentNode.left == null && sum == targetSum) {
				return true;
			}

			if (currentNode.right != null) {

				path.add(currentNode.right);
				sumPath.add(sum + currentNode.right.val);

			}

			if (currentNode.left != null) {

				path.add(currentNode.left);
				sumPath.add(sum + currentNode.left.val);
			}
		}

		return false;
	}

}
