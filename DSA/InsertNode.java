class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class InsertNode {
    Node root;

    Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // In-order traversal to print the tree
    void inOrderTraversal(Node node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public static void main(String[] args) {
        InsertNode tree = new InsertNode();
        Node root = null;
        root = tree.insert(root, 50);
        tree.insert(root, 30);
        tree.insert(root, 20);
        tree.insert(root, 40);
        tree.insert(root, 70);
        tree.insert(root, 60);
        tree.insert(root, 80);

        System.out.println("In-order traversal of the binary tree:");
        tree.inOrderTraversal(root);
    }
}
