package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.List;
import java.util.ArrayList;

class Node {
    int val;
    Node left;
    Node right;

    Node(int val) {
        this.val = val;
        this.left = null;
    }
}

class Pair {
    Node node;
    int level;

    Pair(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}


public class Implementation {
    static boolean flag = true;
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
        // a
        // / \
        // b c
        // / \ / \
        // d e f g

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
    // if (root == null) {
    // return;
    // }
    // inOrderTraversal(root.left); // left ki saari values print karne ke liye
    // System.out.print(root.val + " ");
    // inOrderTraversal(root.right); // right ki saari values print karne ke liye
    // }

    // private static void postOrderTraversal(Node root) {
    // if (root == null) {
    // return;
    // }
    // postOrderTraversal(root.left); // left ki saari values print karne ke liye
    // postOrderTraversal(root.right); // right ki saari values print karne ke liye
    // System.out.print(root.val + " ");
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
    public static int level(Node root) {
        if (root == null) {
            return 0;
        }
        int leftLevel = level(root.left);
        int rightLevel = level(root.right);
        return 1 + Math.max(leftLevel, rightLevel);
    }
    // Time complexity of all the above functions is O(n) where n is the number of
    // nodes in the binary tree because we are visiting each node exactly once. The
    // space complexity is O(h) where h is the height of the binary tree due to the
    // recursive call stack.

    // Pre Order Traversal - Root -> Left -> Right
    // In Order Traversal - Left -> Root -> Right
    // Post Order Traversal - Left -> Right -> Root

    // Homework - LeetCode 144, 145, 94 - Preorder, Postorder, Inorder Traversal

    // LeetCode 226 - Invert Binary Tree - Given the root of a binary tree, invert
    // the tree, and return its root.
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

    // LeetCode 100 - Same Tree - Given the roots of two binary trees p and q, write
    // a function to check if they are the same or not.
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

    // LeetCode 101 - Symmetric Tree - Given the root of a binary tree, check
    // whether it is a mirror of itself (i.e., symmetric around its center).
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

    // LeetCode 112 - Path Sum - Given the root of a binary tree and an integer
    // targetSum, return true if the tree has a root-to-leaf path such that adding
    // up all the values along the path equals targetSum.
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

    // Level Order Traversal - Given the root of a binary tree, return the level
    // order traversal of its nodes' values. (i.e., from left to right, level by
    // level).
    // public static void levelOrderTraversal(Node root) {
    // if (root == null) {
    // return;
    // }
    // Queue<Node> queue = new LinkedList<>();
    // queue.add(root);
    // while (!queue.isEmpty()) {
    // Node current = queue.remove();
    // System.out.print(current.val + " ");
    // if (current.left != null) {
    // queue.add(current.left);
    // }
    // if (current.right != null) {
    // queue.add(current.right);
    // }
    // }
    // }

    // Level Order Traversal line wise - Given the root of a binary tree, return the
    // level order traversal of its nodes' values. (i.e., from left to right, level
    // by level).
    public static void levelOrderTraversalLineWise(Node root) {
        if (root == null) {
            return;
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        int currentLevel = 0;
        while (!queue.isEmpty()) {
            Pair p = queue.remove();
            Node node = p.node;
            int level = p.level;
            if (level != currentLevel) {
                System.out.println();
                currentLevel = level;
            }
            System.out.print(node.val + " ");
            if (node.left != null) {
                queue.add(new Pair(node.left, level + 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, level + 1));
            }
        }
    }

    // LeetCode 102 - Binary Tree Level Order Traversal - Given the root of a binary
    // tree, return the level order traversal of its nodes' values. (i.e., from left
    // to right, level by level).
    public static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(root, 0));
        int currentLevel = 0;
        List<Integer> currentLevelValues = new ArrayList<>();
        while (!queue.isEmpty()) {
            Pair p = queue.remove();
            Node node = p.node;
            int level = p.level;
            if (level != currentLevel) {
                result.add(currentLevelValues);
                currentLevelValues = new ArrayList<>();
                currentLevel = level;
            }
            currentLevelValues.add(node.val);
            if (node.left != null) {
                queue.add(new Pair(node.left, level + 1));
            }
            if (node.right != null) {
                queue.add(new Pair(node.right, level + 1));
            }
        }
        result.add(currentLevelValues);
        return result;
    }

    // Homework - Zig Zag Level Order Traversal - LeetCode 103 - Given the root of a
    // binary tree, return the zigzag level order traversal of its nodes' values.
    // (i.e., from left to right, then right to left for the next level and
    // alternate between).

    // Kth level of Binary Tree - Given the root of a binary tree and an integer n,
    // return the values of the nodes at the nth level of the tree. (The root is
    // considered to be at level 0).
    public static void nthLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }

        if (level == k) {
            System.out.print(root.val + " ");

        }
        nthLevel(root.left, level + 1, k);
        nthLevel(root.right, level + 1, k);
    } 

    //  Binary Tree Paths / Root to Leaf Paths - Given the root of a binary tree, return all root-to-leaf paths in any order. A leaf is a node with no children. - GFG Practice
    public ArrayList<ArrayList<Integer>> paths (Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        dfs(root, new ArrayList<>(), ans);
        return ans;
    }

    private void dfs(Node root, ArrayList<Integer> path, ArrayList<ArrayList<Integer>> ans) {
        if (root == null) {
            return;
        }
        path.add(root.val);
        if (root.left == null && root.right == null) {
            ans.add(new ArrayList<>(path));
        } else {
            dfs(root.left, path, ans);
            dfs(root.right, path, ans);
        }
        path.remove(path.size() - 1); // Backtrack to explore other paths
    }

    // Homework - Full Binary Tree - GFG Practice
    public static boolean isFullBinaryTree(Node root) {
        if (root == null) {
            return true;
        }
        if (root.left == null && root.right == null) {
            return true; // Leaf node
        }
        if (root.left != null && root.right != null) {
            return isFullBinaryTree(root.left) && isFullBinaryTree(root.right);
        }
        return false; // One child is null and the other is not
    }

    // LeetCode 110 - Balanced Binary Tree - Time complexity is O(n^2) because for each node, we are calculating the height of its left and right subtrees, which takes O(n) time. Since we do this for each node, the overall time complexity becomes O(n^2). The space complexity is O(h) where h is the height of the binary tree due to the recursive call stack.

    public static boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(height(root.left), height(root.right));
    }
    
    // Optimized version of isBalanced - Time complexity is O(n) because we are calculating the height of the tree in a single traversal. The space complexity is O(h) where h is the height of the binary tree due to the recursive call stack.
    public static boolean isBalancedOptimized(Node root) {
        if(root == null) {
            return true;
        }
        flag = true;
        heightOptimized(root);
        return flag;
    }

    public static int heightOptimized(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = heightOptimized(root.left);
        int rightHeight = heightOptimized(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1) {
            flag = false;
        }
        return 1 + Math.max(leftHeight, rightHeight);
    }

    // LeetCode 543 - Diameter of Binary Tree - Given the root of a binary tree, return the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
    public static int diameterOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(leftHeight + rightHeight, Math.max(leftDiameter, rightDiameter));
    }

}