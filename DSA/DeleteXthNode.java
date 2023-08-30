
class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    
public class DeleteXthNode {
    public Node deleteNode(Node head, int x) {
        if (x == 1) {
            return head.next;
        }
        Node temp = head;
        Node curr = temp;
        while (x > 1 && temp != null) {
            curr = temp;
            temp = temp.next;
            x--;
        }
        if (temp != null) {
            curr.next = temp.next;
        }
        return head;
    }
    
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        DeleteXthNode deleteNode = new DeleteXthNode();
    
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);
    
        System.out.println("Original Linked List:");
        printList(head);
    
        int x = 3; // Node position to delete
        head = deleteNode.deleteNode(head, x);
    
        System.out.println("Linked List after deleting node at position " + x + ":");
        printList(head);
    }
}    
