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

        System.out.println("\nSize of the binary tree: " + size(a));
        System.out.println("Sum of values in the binary tree: " + sum(a));
        System.out.println("Product of values in the binary tree: " + product(a));
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

    public static int size(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + size(root.left) + size(root.right);
    }

    // Sum of values of Binary Tree
    public static int sum(Node root) {
        if (root == null) {
            return 0;
        }
        return root.val + sum(root.left) + sum(root.right);
    }

    // Product of values of Binary Tree
    public static int product(Node root) {
        if (root == null) {
            return 1; // Return 1 for multiplication identity
        }
        return root.val * product(root.left) * product(root.right);
    }

    // Maximum value in Binary Tree
    public static int max(Node root) {
        if (root == null) {
            return Integer.MIN_VALUE; // Return minimum value for comparison
        }
        int leftMax = max(root.left);
        int rightMax = max(root.right);
        return Math.max(root.val, Math.max(leftMax, rightMax));
    }

    // Find the level of Binary Tree
    public static int level(Node root){
        if (root == null) {
            return 0;
        }
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);
        return 1 + Math.max(leftLevel, rightLevel);
    }
    
}
