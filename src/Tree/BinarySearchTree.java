package Tree;

public class BinarySearchTree {

	Node root;

	public BinarySearchTree() {
		root = null;
	}

	public void insert(int val) {
		root = insertRec(root, val);
	}

	public boolean contains(int data) {

		Node tempNode = root;

		while (tempNode != null) {

			if (tempNode.val == data) {
				return true;
			} else if (tempNode.val > data) {

				tempNode = tempNode.left;

			} else {
				tempNode = tempNode.right;
			}

		}

		return false;

	}

	public int minOfTreeValue() {

		if (root == null) {

			throw new IllegalStateException("Root null");
		}

		Node tempNode = root;

		while (tempNode.left != null) {

			tempNode = tempNode.left;

		}

		return tempNode.val;
	}

	public int maxOfTreeValue() {

		if (root == null) {

			throw new IllegalStateException("Root null");
		}

		Node tempNode = root;

		while (tempNode.right != null) {

			tempNode = tempNode.right;

		}

		return tempNode.val;
	}

	private Node insertRec(Node root, int val) {

		if (root == null) {

			root = new Node(val);

			return root;
		}

		if (root.val > val) {

			root.left = insertRec(root.left, val);

		} else if (root.val < val) {

			root.right = insertRec(root.right, val);

		}

		return root;
	}

}
