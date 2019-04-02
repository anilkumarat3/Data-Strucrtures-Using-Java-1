package DS;

class Node {
	int key;
	Node left;
	Node right;
    Node root;
	Node(int key) {
		this.key = key;
		left = right = null;
	}
}

public class BinaryTree {
	public static void Inorder(Node root) {
		if (root!=null) {
			Inorder(root.left);
			System.out.print(root.key + " ");
			Inorder(root.right);
		}
	}

	public static Node InsertNode(int key, Node root) {
		Node NewNode = new Node(key);
		if (root == null) {
			root = NewNode;
			return root;
		}
		if (key < root.key) {
			root.left = InsertNode(key, root.left);
		} else if (key > root.key) {
			root.right = InsertNode(key, root.right);
		}
		return root;

	}

	public static void main(String args[]) {
		Node root = new Node(10);

		root.left = new Node(15);
		root.left.left = new Node(5);
		root.left.right = new Node(4);
		root.right = new Node(12);
		root.right.right = new Node(8);

		 InsertNode(50, root);
		 InsertNode(30, root);

		Inorder(root);
	}

}
