class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		next = null;
	}
}

public class TestList {
	public Node addTwoNumbers(Node l1, Node l2) {
		System.out.println(l1.data);
	/*	Node dummyHead = new Node(0);
		Node p = l1, q = l2, curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.data : 0;
	        int y = (q != null) ? q.data : 0;
	        int sum = carry + x + y;
	        carry = sum / 10;
	        curr.next = new Node(sum % 10);
	        curr = curr.next;
	        if (p != null) p = p.next;
	        if (q != null) q = q.next;
	    }
	    if (carry > 0) {
	        curr.next = new Node(carry);
	    }
	    return dummyHead;*/
		Node newnode=new Node(0);
		while(l1!=null && l2!=null){
			newnode.data=l1.data+l2.data;
			newnode=newnode.next;
			l1=l1.next;
			l2=l2.next;
		}
		return newnode;
	}
	// Node head;
	public void PrintList(Node List) {
		Node temp = List;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public static void main(String args[]) {
		TestList obj = new TestList();
		Node head = new Node(5);
		Node l1 = new Node(10);
		Node l2 = new Node(20);
		Node l3 = new Node(30);
		Node l4 = new Node(40);
		head.next = l1;
		l1.next = l2;
		l2.next = l3;
		l3.next = l4;
		obj.PrintList(head);
		Node head1 = new Node(10);
		Node k1 = new Node(20);
		Node k2 = new Node(30);
		Node k3 = new Node(50);
		Node k4 = new Node(40);
		head1.next = k1;

		k1.next = k2;
		k2.next = k3;
		k3.next = k4;
		obj.PrintList(head1);
		Node Sum=obj.addTwoNumbers(head,head1);
		obj.PrintList(Sum);

	}
}
