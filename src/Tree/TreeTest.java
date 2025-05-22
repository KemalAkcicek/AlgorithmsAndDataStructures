package Tree;

public class TreeTest {

	public static void main(String[] args) {

		TreeTraversel treeTraversel = new TreeTraversel();

		treeTraversel.insert(5);
		treeTraversel.insert(4);
		treeTraversel.insert(8);
		treeTraversel.insert(11);
		treeTraversel.insert(2);
		treeTraversel.insert(7);
		treeTraversel.insert(8);
		treeTraversel.insert(13);
		treeTraversel.insert(4);
		treeTraversel.insert(1);

		treeTraversel.DFSPreOrder(treeTraversel.root);

	}

}
