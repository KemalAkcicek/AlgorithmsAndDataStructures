package TreeAndRecursionQuestions;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SameTwoBinary {

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null && q == null) {
			return true;
		}

		if (p == null || q == null) {
			return false;
		}

		return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

	}

	public boolean isSameTreeDifferntSolution(TreeNode p, TreeNode q) {

		Queue<TreeNode> queue = new ConcurrentLinkedQueue<TreeNode>();

		queue.add(p);
		queue.add(q);

		while (!queue.isEmpty()) {

			TreeNode first = queue.poll();
			TreeNode second = queue.poll();

			if (first == null && second == null) {
				return true;
			} else if (first == null || second == null) {
				return false;
			} else if (first.val != second.val) {
				return false;
			}

			queue.add(first.left);
			queue.add(second.left);
			queue.add(first.right);
			queue.add(second.right);

		}

		return false;

	}

}
