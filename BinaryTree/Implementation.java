package BinaryTree;

class Node {
    int val;
    Node left;
    Node right;
    Node(int val) {
        this.val = val;
        
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
    }

    private static void preOrderTraversal(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }
}
