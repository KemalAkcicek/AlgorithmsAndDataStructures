package TreeAndRecursionQuestions;

import java.util.LinkedList;
import java.util.Queue;

public class IsSimetrhic {

	public boolean isSymmetric(TreeNode root) {

		Queue<TreeNode> leftTree = new LinkedList<TreeNode>();
		Queue<TreeNode> rightTree = new LinkedList<TreeNode>();

		leftTree.add(root.left);
		rightTree.add(root.right);

		while (!leftTree.isEmpty() && !rightTree.isEmpty()) {

			TreeNode leftNode = leftTree.poll();
			TreeNode rightNode = rightTree.poll();

			if (leftNode == null && rightNode == null) {
				continue;
			}
			if (leftNode == null || rightNode == null) {
				return false;
			}

			if (leftNode.val != rightNode.val) {
				return false;
			}

			leftTree.add(leftNode.left);
			leftTree.add(leftNode.right);
			rightTree.add(rightNode.right);
			rightTree.add(rightNode.left);

		}

		return true;

	}

}
