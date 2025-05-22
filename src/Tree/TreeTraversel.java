package Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeTraversel {

	Node root;

	List<Node> valuesDFSOrder = new ArrayList<Node>();
	List<Node> valuesDFSPostOrder = new ArrayList<Node>();
	List<Node> valuesDFSInOrder = new ArrayList<Node>();

	public TreeTraversel() {
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

	public Node insertRec(Node root, int val) {

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

	public List<Node> BFS() {

		List<Node> queue = new ArrayList<Node>();
		List<Node> values = new ArrayList<Node>();

		queue.add(root);

		while (!queue.isEmpty()) {

			Node currentNode = queue.remove(0);
			values.add(currentNode);

			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}
			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}

		}

		return values;
	}

	public List<Node> DFSPreOrder(Node currentNode) {

		valuesDFSOrder.add(currentNode);

		if (currentNode.left != null) {
			DFSPreOrder(currentNode.left);
		}
		if (currentNode.right != null) {

			DFSPreOrder(currentNode.right);
		}

		return valuesDFSOrder;
	}

	public List<Node> DFSPostOrder(Node currentNode) {

		if (currentNode.left != null) {
			DFSPostOrder(currentNode.left);
		}
		if (currentNode.right != null) {
			DFSPostOrder(currentNode.right);
		}

		valuesDFSPostOrder.add(currentNode);

		return valuesDFSPostOrder;

	}

	public List<Node> DFSInOrder(Node currentNode) {

		if (currentNode.left != null) {

			DFSInOrder(currentNode.left);
		}

		valuesDFSInOrder.add(currentNode);

		if (currentNode != null) {

			DFSInOrder(currentNode.right);
		}

		return valuesDFSInOrder;

	}

}
