

//import random.linkedlist.Node;

public class Dll {
	Node head;
	class Node{
		int data;
		Node next;
		Node prev;
		Node(int v) {//constructor
			this.data=v;
			this.next=null;
			this.prev=null;
	}}
	public void insertFirst(int data) {
		Node n=new Node(data);
		n.next=head;
		
		n.prev=null;
		if(head!=null)
			head.prev=n;
		head=n;
	}
	public void insertLast(int data) {
		Node n=new Node(data);
		Node curr=head;
		n.next=null;
		if(head==null) {
			head=n;
			n.prev=null;
			return;
		}
		while(curr.next!=null)
			curr=curr.next;
		curr.next=n;
		n.prev=curr;
	}
	public void insertn(int data, int pos) {
		Node n=new Node(data);
		Node curr=head;
		int c=0;
		while(c<pos-1) {
			curr=curr.next;
			c++;
		}
		n.next=curr.next;
		curr.next=n;
		n.prev=curr;
		if(n.next==null)
			n.next.prev=n;
	}
	public void print() {
		Node curr=head;
		Node last=null;
		if(head==null)
			System.out.println("LL empty");
		while(curr!=null) {
			System.out.print(curr.data+"-->");
			last=curr;
			curr=curr.next;
		}
		System.out.println();
		while(last!=null) {
			System.out.print(last.data+"-->");
			last=last.prev;
		}
	}
	public Node find(int val) {
		Node n=head;
		while(n!=null) {
			if(n.data==val)
				return n;
			n=n.next;
		}
		return null;
	}
	public static void main(String[] args) {
		Dll ll=new Dll();
		ll.insertFirst(10);
		ll.insertFirst(11);
		ll.insertFirst(12);
		ll.insertn(30,1);
		ll.print();
	}

}
