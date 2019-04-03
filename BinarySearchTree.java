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

public class BinarySearchTree {
	public static void Inorder(Node root) {
		if (root == null)
			return;
		Inorder(root.left);
		System.out.print(root.key + " ");
		Inorder(root.right);

	}

	public static void main(String args[]) {
		Node root = new Node(10);
		root.left = new Node(20);
		root.right = new Node(30);
		root.left.left = new Node(40);
		root.right.right = new Node(50);
		root.left.left.left = new Node(60);
		root.left.left.left.right = new Node(50);
		Inorder(root);
	}

}
