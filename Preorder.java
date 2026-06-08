public class Preorder {

    static class TreeNode {
        int key;
        TreeNode left, right;

        TreeNode(int key) {
            this.key = key;
            left = right = null;
        }
    }

    static void preorder(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(3);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(9);

        root.left.right.left = new TreeNode(7);
        root.left.right.left.left = new TreeNode(4);

        System.out.println("Preorder Traversal:");
        preorder(root);
    }
}