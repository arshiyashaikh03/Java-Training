public class Postorder {

    static class TreeNode {
        int key;
        TreeNode left, right;

        TreeNode(int key) {
            this.key = key;
            left = right = null;
        }
    }

    static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key + " ");
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(3);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(9);

        root.left.right.left = new TreeNode(7);
        root.left.right.left.left = new TreeNode(4);

        System.out.println("Postorder Traversal:");
        postorder(root);
    }
}