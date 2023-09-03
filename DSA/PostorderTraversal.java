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

public class PostorderTraversal {
    public static void postorderTraversal(TreeNode root) {
        if (root != null) {
            // Traverse the left subtree
            postorderTraversal(root.left);

            // Traverse the right subtree
            postorderTraversal(root.right);

            // Visit the current node
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        // Create a sample binary tree
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Postorder Traversal:");
        postorderTraversal(root);
    }
}
