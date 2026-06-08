public class BFS{
    static class TreeNode {
        int key;
        TreeNode left, right;

        TreeNode(int key) {
            this.key = key;
            left = right = null;
        }
    }

    static void bfs(TreeNode root) {
        if (root == null) {
            return;
        }

        java.util.Queue<TreeNode> queue = new java.util.LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.key + " ");

            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    public static void main(String[] args) {

        TreeNode root = new TreeNode(10);

        root.left = new TreeNode(3);
        root.right = new TreeNode(15);

        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(9);

        root.left.right.left = new TreeNode(7);
        root.left.right.left.left = new TreeNode(4);

        System.out.println("Breadth-First Traversal:");
        bfs(root);
    }
}