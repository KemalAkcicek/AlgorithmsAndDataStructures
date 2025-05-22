package TreeAndRecursionQuestions;

public class ConvertBST {

	int sum = 0;

	public TreeNode convertBST(TreeNode root) {

		if (root.right != null) {

			convertBST(root.right);
		}

//		int temp = root.val;
//		root.val = root.val + sum;
//		sum = sum + temp;

		root.val += sum;
		sum = root.val;

		if (root.left != null) {

			convertBST(root.left);
		}

		return root;
	}
}
