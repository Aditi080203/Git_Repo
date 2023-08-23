package random;

public class StackLL {
	class Node{
		int val;
		Node next;
		Node(int val){
			this.val=val;
			this.next=null;
		}
	}
	Node head;
	int size=0;
	int size() {
		return size;
	}
	private boolean isEmpty() {
		return size==0;
	}
	public int peek() throws Exception{
		if(isEmpty())
			throw new Exception("Empty");
		return head.val;
	}
	public void push(int data) {
		Node n=new Node(data);
		Node curr=head;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=n;
		size++;
	}
	public int pop() throws Exception{
		if(isEmpty())
			throw new Exception("Empty");
		Node curr=head;
		while(curr.next.next!=null)
			curr=curr.next;
		int d=curr.next.val;
		curr.next=null;
		return d;
	}
	public static void main(String[] args) {
		
	}

}
