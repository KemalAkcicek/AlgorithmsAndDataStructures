package TreeAndRecursionQuestions;

public class InvertTree {

	public TreeNode invertTree(TreeNode root) {

		if (root == null) {

			return root;
		}

		TreeNode tempNode = root.right;
		root.right = root.left;
		root.left = tempNode;

		invertTree(root.right);
		invertTree(root.left);

		return root;

	}

}
