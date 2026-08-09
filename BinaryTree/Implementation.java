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

    // Find the level of Binary Tree - Important
    public static int level(Node root){
        if (root == null) {
            return 0;
        }
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);
        return 1 + Math.max(leftLevel, rightLevel);
    }
    // Time complexity of all the above functions is O(n) where n is the number of nodes in the binary tree because we are visiting each node exactly once. The space complexity is O(h) where h is the height of the binary tree due to the recursive call stack.
    
    // Pre Order Traversal - Root -> Left -> Right
    // In Order Traversal - Left -> Root -> Right
    // Post Order Traversal - Left -> Right -> Root

    // Homework - LeetCode 144, 145, 94 - Preorder, Postorder, Inorder Traversal


    // LeetCode 226 - Invert Binary Tree - Given the root of a binary tree, invert the tree, and return its root.
    public static Node invertTree(Node root) {
        if (root == null) {
            return null;
        }
        Node left = invertTree(root.left);
        Node right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    // LeetCode 100 - Same Tree - Given the roots of two binary trees p and q, write a function to check if they are the same or not.
    public static boolean isSameTree(Node p, Node q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    // LeetCode 101 - Symmetric Tree - Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
    public static boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }
        return isMirror(root.left, root.right);
    }

    private static boolean isMirror(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }
        if (left == null || right == null) {
            return false;
        }
        if (left.val != right.val) {
            return false;
        }
        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

   // LeetCode 112 - Path Sum - Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.
    public static boolean hasPathSum(Node root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        int newTarget = targetSum - root.val;
        return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
    }
}