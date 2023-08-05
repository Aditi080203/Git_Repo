package random;

public class linkedlist {
	class Node{
		int value;
		Node next;
		public Node(int v) {//constructor
			this.value=v;
			this.next=null;
		}
		public Node(int v, Node next) {//constructor
			this.value=v;
			this.next=next;
		}
	}
	Node head;
	Node tail;
/*---------------------------------------*/	
	public void addHead(int data) {
		Node temp=new Node(data);
		if(head==null)
			head=temp;
		else{
			temp.next=head;
			head=temp;
		}
	}
/*---------------------------------------*/	
	public void print() {
		Node curr=head;
		if(head==null)
			System.out.println("LL empty");
		while(curr!=null) {
			System.out.print(curr.value+"-->");
			curr=curr.next;
		}
	}
/*----------------------------------------*/	
	public void addLast(int data) {
		Node temp=new Node(data);
		Node curr=head;
		if(head==null)
			head=temp;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=temp;
	}
/*-------------------------------------------*/
	public void deleteFirst() {
		if(head==null)
			System.out.println("LL Empty");		
		head=head.next;
	}
/*-------------------------------------------*/
	public void deleteLast() {
		Node curr=head;
		if(head==null)
			System.out.println("LL Empty");
		while(curr.next.next!=null)
			curr=curr.next;
		curr.next=null;
	}
/*--------------------------------------------*/
	public void insertn(int data, int n) {
		Node temp=new Node(data);
		int c=0;
		Node curr=head;
		if(n==0) {
			addHead(data);
			return;}
		while(c<n-1) {
			c++;
			curr=curr.next;
		}
		Node x=curr.next;
		curr.next=temp;
		temp.next=x;
		
	}
	
	public void deleten(int n) {
		Node curr=head;
		int c=0;
		while(c<n-1) {
			curr=curr.next;
			c++;}
		Node x=curr.next.next;
		Node y=curr.next;
		curr.next=x;
	}
	public void loop() {
		Node s=head;
		Node f=head;
		while(f.next!=null && f.next.next!=null) {
			s=s.next;
			f=f.next.next;
			if(s==f)
				System.out .print("Loop detected");
		}
		System.out .print("Loop not detected");
	}
	public void duplicate() {
		Node temp=head;
		while(temp.next!=null) {
			if(temp.value==temp.next.value)
				temp.next=temp.next.next;
			else
				temp=temp.next;
		}
		temp.next=null;
	}
	public void reverse() {
		Node prev=null;
		Node pres=head;
		Node next=pres.next;
		while(pres!=null) {
			pres.next=prev;
			prev=pres;
			pres=next;
			if(next!=null)
				next=next.next;
		}
		head=prev;
	}
	public static void main(String[] args) {
		linkedlist ll=new linkedlist();
		ll.addHead(10);
		ll.addHead(11);
		ll.addHead(12);
		ll.addLast(13);
		//ll.deleteLast();
		ll.deleten(2);
		ll.print();
		ll.loop();
	}

}
