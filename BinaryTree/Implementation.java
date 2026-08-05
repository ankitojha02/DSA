package BinaryTree;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
        this.left = null;
    }
}

public class Implementation {
    public static void main(String[] args) {
        // Creating nodes of the binary tree
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);

        // Connecting nodes to form the binary tree
        //       a
        //      / \
        //     b   c
        //    / \ / \
        //   d  e f  g

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;

        // Performing pre-order traversal
        System.out.println("Pre-order Traversal:");
        preOrderTraversal(a);
    }

    private static void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left); // left ki saari values print karne ke liye
        preOrderTraversal(root.right); // right ki saari values print karne ke liye
    }

    // private static void inOrderTraversal(Node root) {
    //     if (root == null) {
    //         return;
    //     }
    //     inOrderTraversal(root.left); // left ki saari values print karne ke liye
    //     System.out.print(root.val + " ");
    //     inOrderTraversal(root.right); // right ki saari values print karne ke liye
    // }

    // private static void postOrderTraversal(Node root) {
    //     if (root == null) {
    //         return;
    //     }
    //     postOrderTraversal(root.left); // left ki saari values print karne ke liye
    //     postOrderTraversal(root.right); // right ki saari values print karne ke liye
    //     System.out.print(root.val + " ");
    // }
}
