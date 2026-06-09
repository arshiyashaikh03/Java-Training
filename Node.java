class Node {
    int val;
    Node left, right;

    Node(int val) {
        this.val = val;
        left = right = null;
    }
}

public class BinarySearchTree {

    Node insert(Node root, int key) {

        if (root == null) {
            return new Node(key);
        }

        if (key < root.val) {
            root.left = insert(root.left, key);
        }
        else if (key > root.val) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        preorder(root.left);
        preorder(root.right);
    }

    void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null)
            return;

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val + " ");
    }

    public static void main(String[] args) {

        BinarySearchTree bst = new BinarySearchTree();
        Node root = null;

        int arr[] = {34, 75, 59, 15, 89, 46, 2, 63, 28, 96, 52, 80, 10, 73};

        for (int i = 0; i < arr.length; i++) {
            root = bst.insert(root, arr[i]);
        }

        System.out.print("Preorder: ");
        bst.preorder(root);

        System.out.println();

        System.out.print("Inorder: ");
        bst.inorder(root);

        System.out.println();

        System.out.print("Postorder: ");
        bst.postorder(root);
    }
}