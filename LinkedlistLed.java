
public class LinkedlistLed {
	 public class Node {
		int value;
		Node next;

		Node(int value) {
			this.value = value;
		}
	}

	Node head;

	public void InsertList(int value) {
		Node newnode = new Node(value);
		newnode.next = head;
		head = newnode;

	}

	public void PrintList() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " ");
			temp = temp.next;
		}
		System.out.println();
	}

	public Node Revreselist(LinkedlistLed li) {
		Node perv = null;
		Node next = null;
		Node Curr = head;
		while (Curr != null) {
			next = Curr.next;
			Curr.next = perv;
			Curr = next;
			perv = Curr;
		}
		head = perv;

		return head;

	}

	public Node addTwoNumbers(LinkedlistLed li, LinkedlistLed li2) {
		Node dummyHead = new Node(0);
		LinkedlistLed p = li;
		LinkedlistLed q = li2;
		Node curr = dummyHead;
	    int carry = 0;
	    while (p != null || q != null) {
	        int x = (p != null) ? p.value : 0;
	        int y = (q != null) ? q.value : 0;
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
	    return dummyHead.next;
	}

	public static void main(String args[]) {
		LinkedlistLed.Node li = new LinkedlistLed.Node(10);
		LinkedlistLed li2 = new LinkedlistLed();
		//LinkedlistLed l3 = new LinkedlistLed();

		li.InsertList(10);
		li.InsertList(20);
		li.InsertList(30);
		li.InsertList(40);
		li.InsertList(50);
		li2.InsertList(6);
		li2.InsertList(7);
		li2.InsertList(8);
		li2.InsertList(9);
		li2.InsertList(10);
		// li.PrintList();
		// li.Revreselist(li);
		
		li.PrintList();
		li2.PrintList();
		Node l3=addTwoNumbers(li,li2);

	}

}
