
 class Solution {
	int val;
	Solution next;

	Solution(int x) {
		val = x;
	}
}

class Solution {
	public static Solution addTwoNumbers(Solution l1, Solution l2) {
		Solution dummyHead = new Solution(0);
		Solution p = l1, q = l2, curr = dummyHead;
		int carry = 0;
		while (p != null || q != null) {
			int x = (p != null) ? p.val : 0;
			int y = (q != null) ? q.val : 0;
			int sum = carry + x + y;
			carry = sum / 10;
			curr.next = new Solution(sum % 10);
			curr = curr.next;
			if (p != null)
				p = p.next;
			if (q != null)
				q = q.next;
		}
		if (carry > 0) {
			curr.next = new Solution(carry);
		}
		return dummyHead.next;
	}
	public static void Printlist(Solution li){
		Solution temp=li;
		while(temp!=null){
			System.out.print(temp.val+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	public static void main(String args[]){
		Solution l1=new Solution(10);
		Solution l2=new Solution(20);
		Solution l3=new Solution(20);
		Solution l4=new Solution(20);
		Solution l5=new Solution(20);
		Solution l6=new Solution(20);
		Solution l7=new Solution(20);
		Solution l8=new Solution(20);
		l1.next=l2;
		l2.next=l3;
		l3.next=l4;
		l4.next=l5;
		l5.next=l6;
		l6.next=l7;
		l7.next=l8;
		//l1.next=l2;
		Solution k1=new Solution(10);
		Solution k2=new Solution(20);
		Solution k3=new Solution(20);
		Solution k4=new Solution(20);
		Solution k5=new Solution(20);
		Solution k6=new Solution(20);
		Solution k7=new Solution(20);
		Solution k8=new Solution(20);
		k1.next=k2;
		k2.next=k3;
		k3.next=k4;
		k4.next=k5;
		k5.next=k6;
		k6.next=k7;
		k7.next=k8;
		Solution Sum=addTwoNumbers(l1,k1);
		Printlist(l1);
		Printlist(k1);
		Printlist(Sum);


	}
}
