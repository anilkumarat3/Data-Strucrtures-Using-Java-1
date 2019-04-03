package DataStructructure;

class Node {
	int key;
	Node left;
	Node right;

	Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class BST {
	Node root;

	BST(int key) {
		root = new Node(key);
	}

	BST() {
		root = null;
	}

	public static void main(String args[]) {
		BST tree = new BST();
		tree.root=new Node(10);
		root.
	}

}
