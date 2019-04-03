
public class LinkedList {
	Node Head;

	static class Node {
		int data;
		Node Next;

		Node(int d) {
			data = d;
			Next = null;
		}
	}

	public void InsertFirst(int new_data) {
		Node new_node = new Node(new_data);
		new_node.Next = Head;
		Head = new_node;

	}

	public void InsertAfter(Node Previ_node, int newdata) {
		if (Previ_node == null) {
			System.out.println("The Previous node cannot be null");
		}
		Node new_node1 = new Node(newdata);
		new_node1.Next = Previ_node.Next;
		Previ_node.Next = new_node1;

	}
	public void AppendLast(int Data){
		System.out.println("Appending the Data");
		Node New_node=new Node(Data);
		if(Head==null){
			Head=new Node(Data);
		}
		New_node.Next=null;
		Node Last=Head;
		while(Last!=null){
			Last=Last.Next;
			Last.Next=New_node;

		}
		
		
	}

	public void PrintList() {
		Node n = Head;
		while (n != null) {
			System.out.println(n.data + " ");
			n = n.Next;
		}
	}

	public static void main(String args[]) {
		System.out.println("Inside main Function");
		LinkedList LIST = new LinkedList();
		LIST.Head = new Node(10);
		Node First = new Node(1);
		Node Second = new Node(2);
		Node Third = new Node(3);
		LIST.Head.Next = First;
		First.Next = Second;
		Second.Next = Third;
		//LIST.InsertFirst(50);
		//LIST.InsertAfter(Second, 600);
		LIST.AppendLast(80);
		LIST.PrintList();

	}

}
