import java.util.LinkedList;

public class ReverseLinkedList {
	
	public static void main(String[] args){
		ReverseLinkedList reverse = new ReverseLinkedList();

		Node head = reverse.list(5);
		
		System.out.println("The original list is, ");
		reverse.print(head);
		
		System.out.println("The reversed list is, ");
		reverse.print(reverse.reverse(head));
		
	}


	public Node reverse(Node n) {
		return r (n, null);	
	}

	public Node r (Node cur, Node prev) {
		if (cur == null) return prev;
		
		Node tempCur = cur;
		Node tempPrev = prev;
		
		prev = cur;
		cur = cur.next;
		
		tempCur.next = tempPrev;
		
		return r(cur, prev);
	}

	public void print(Node n) {
		Node head = n;
		while (head != null) {
			System.out.print(head.val + " ");
			head = head.next;
		}
		System.out.println();
	}

	private Node list(int n) {
		Node head = null;
		Node prev = null;
		
		for (int i = 0; i < n; i++) {
			Node cur = new Node(i);
			if (head == null) {
				head = cur;
				prev = cur;
				continue;
			}

			prev.next = cur;
			prev = cur;
		}
	
		return head;
	}




	private class Node {
		int val;
		Node next;

		public Node(int val) {
			this.val = val;
		}
		
		public Node(int val, Node next) {
			this(val);
			this.next = next;
		}
	}

}