package Binary_Search_Tree;

class Node {
    int val;
    Node left, right;

    public Node(int item) {
        val = item;
        left = right = null;
    }
}

public class Basics_BST {
    public static void main(String[] args) {
        Node a = new Node(50);
        Node b = new Node(30);
        Node c = new Node(70);
        Node d = new Node(20);
        Node e = new Node(40);
        Node f = new Node(60);
        Node g = new Node(80);
        Node h = new Node(55);

        // Binary Search Tree is the data structure that has the following properties:
        // 1. The left subtree of a node contains only nodes with keys less than the node's key.
        // 2. The right subtree of a node contains only nodes with keys greater than the node's key.
        // 3. Both the left and right subtrees must also be binary search trees.
        // Connecting nodes to form a binary search tree
        //         50
        //       /    \
        //     30      70
        //    /  \    /  \
        //   20   40 60   80
        //          /    \
        //         55
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        c.right = g;
        g.right = h;

       Node result = searchBST(a, 60);
       if (result != null) {
       System.out.println(result.val); // Output: 60
       }
       else {
       System.out.println("Value not found in the BST.");
       }

    }

    // LeetCode 700 : Search in a Binary Search Tree
    public static Node searchBST(Node root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }
}
