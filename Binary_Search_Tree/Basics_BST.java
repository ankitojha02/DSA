package Binary_Search_Tree;

class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class Basics_BST {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);
        Node g = new Node(70);
        Node h = new Node(80);

        // Binary Search Tree is the data structure that has the following properties:
        // 1. The left subtree of a node contains only nodes with keys less than the node's key.
        // 2. The right subtree of a node contains only nodes with keys greater than the node's key.
        // 3. Both the left and right subtrees must also be binary search trees.
        // Connecting nodes to form a binary search tree
        //         10
        //       /    \
        //     20      30
        //    /  \    /  \
        //   40   50 60   70
        //          /    \
        //         80
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        g.right = h;

    }
}
