package random;

import random.linkedlist.Node;

public class CLL {
	Node head;
	Node tail;
	
	class Node{
		int value;
		Node next;
		Node(int data){
			this.value=data;
		}
	}
	
	public void insert(int data) {
		Node n=new Node(data);
		if(head==null) {
			head=tail=n;
			return;
		}
		tail.next=n;
		n.next=head;
		tail=n;
	}
	public void print() {
		Node n=head;
		if(head!=null) {
			do {
				System.out.print(n.value+"-->");
				n=n.next;
			}while(n!=head);
		}
	}
	public void delete(int val) {
		Node node=head;
		if(node==null)
			return;
		if(node.value==val) {//for head
			head=head.next;
			tail.next=head;
			return;
		}do {//for rest list
			Node x=node.next;
			if(x.value==val) {
				node.next=x.next;
				break;
			}node=node.next;
		}while(node!=head);
	}
	public static void main(String[] args) {
		CLL cll=new CLL();
		cll.insert(10);
		cll.insert(11);
		cll.insert(12);
		cll.delete(11);
		cll.print();
	}

}
