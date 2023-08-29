public class RemoveDuplicate {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public Node removeDuplicates(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        RemoveDuplicate rd = new RemoveDuplicate();

        Node head = rd.new Node(10);
        head.next = rd.new Node(20);
        head.next.next = rd.new Node(20);
        head.next.next.next = rd.new Node(30);
        head.next.next.next.next = rd.new Node(30);
        head.next.next.next.next.next = rd.new Node(40);

        System.out.println("Original Linked List:");
        rd.printList(head);

        Node newHead = rd.removeDuplicates(head);

        System.out.println("Linked List after removing duplicates:");
        rd.printList(newHead);
    }
}
