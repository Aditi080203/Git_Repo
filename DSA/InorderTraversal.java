class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class InorderTraversal {
    public static void inorderTraversal(TreeNode root) {
        if (root != null) {
            // Traverse the left subtree
            inorderTraversal(root.left);

            // Visit the current node
            System.out.print(root.data + " ");

            // Traverse the right subtree
            inorderTraversal(root.right);
        }
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Inorder Traversal:");
        inorderTraversal(root);
    }
}

