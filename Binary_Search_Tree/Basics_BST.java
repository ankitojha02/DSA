package Binary_Search_Tree;

import java.util.ArrayList;
import java.util.Collections;

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
        // 1. The left subtree of a node contains only nodes with keys less than the
        // node's key.
        // 2. The right subtree of a node contains only nodes with keys greater than the
        // node's key.
        // 3. Both the left and right subtrees must also be binary search trees.
        // Connecting nodes to form a binary search tree
        // 50
        // / \
        // 30 70
        // / \ / \
        // 20 40 60 80
        // / \
        // 55
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
        } else {
            System.out.println("Value not found in the BST.");
        }

    }

    // LeetCode 700 : Search in a Binary Search Tree
    // Time Complexity: O(h), where h is the height of the tree. In the worst case,
    // the height of the tree can be equal to the number of nodes in the tree
    // (O(n)), making the time complexity O(n). In a balanced BST, the height is
    // log(n), making the time complexity O(log n).
    public static Node searchBST(Node root, int val) {
        if (root == null || root.val == val) {
            return root;
        }
        if (root.val > val) {
            return searchBST(root.left, val);
        }
        return searchBST(root.right, val);
    }

    // LeetCode 938 : Range Sum of BST
    // Time Complexity: O(n), where n is the number of nodes in the tree.
    public static int rangeSumBST(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return rangeSumBST(root.right, low, high);
        }
        if (root.val > high) {
            return rangeSumBST(root.left, low, high);
        }
        return root.val + rangeSumBST(root.left, low, high) + rangeSumBST(root.right, low, high);
    }

    // Count BST Nodes in a given range - GFG Practice
    // Time Complexity: O(n), where n is the number of nodes in the tree.
    public static int countNodesInRange(Node root, int low, int high) {
        if (root == null) {
            return 0;
        }
        if (root.val < low) {
            return countNodesInRange(root.right, low, high);
        }
        if (root.val > high) {
            return countNodesInRange(root.left, low, high);
        }
        return 1 + countNodesInRange(root.left, low, high) + countNodesInRange(root.right, low, high);
    }

    // LeetCode 701 - Insert into a Binary Search Tree
    // Time Complexity: O(h), where h is the height of the tree. In the worst case,
    // the height of the tree can be equal to the number of nodes in the tree
    // (O(n)), making the time complexity O(n). In a balanced BST, the height is
    // log(n), making the time complexity O(log n).
    public static Node insertIntoBST(Node root, int val) {

        if (root == null) {
            return new Node(val);
        }
        if (val < root.val) { // If the value to be inserted is less than the current node's value, we go to
                              // the left subtree
            root.left = insertIntoBST(root.left, val); // Recursively call the function on the left subtree and assign
                                                       // the returned node to the left child of the current node
        } else {
            root.right = insertIntoBST(root.right, val); // If the value to be inserted is greater than or equal to the
                                                         // current node's value, we go to the right subtree and
                                                         // recursively call the function on the right subtree and
                                                         // assign the returned node to the right child of the current
                                                         // node
        }
        return root;
    }

    // Inoder traversal of BST is always sorted in ascending order
    // Time Complexity: O(n), where n is the number of nodes in the tree.
    // LeetCode 230 - Kth Smallest Element in a BST
    public static int kthSmallest(Node root, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        return arr.get(k - 1);
    }

    public static void inorderTraversal(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left, arr);
        arr.add(root.val);
        inorderTraversal(root.right, arr);
    }

    // LeetCode 98 - Validate Binary Search Tree
    // Time Complexity: O(n), where n is the number of nodes in the tree.
    // Using Inorder Traversal to check if the BST is valid or not
    public static boolean isValidBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inorderTraversal(root, arr);
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) <= arr.get(i - 1)) {
                return false;
            }
        }
        return true;
    }

    // Homework
    // LeetCode 538 - Convert BST to Greater Tree
    // Time Complexity: O(n), where n is the number of nodes in the tree.
    public static Node convertBST(Node root) {
        ArrayList<Node> arr = new ArrayList<>();
        inorderTraversalNodes(root, arr);
        Collections.reverse(arr);
        int sum = 0;
        for (Node node : arr) {
            sum += node.val;
            node.val = sum;
        }
        return root;
    }

    public static void inorderTraversalNodes(Node root, ArrayList<Node> arr) {
        if (root == null) {
            return;
        }
        inorderTraversalNodes(root.left, arr);
        arr.add(root);
        inorderTraversalNodes(root.right, arr);
    }

    // Homework
    // LeetCode 1373 - Maximum Sum BST in Binary Tree - Solution on LeetCode
    // Time Complexity: O(n), where n is the number of nodes in the tree.

    // LeetCode 235 - Lowest Common Ancestor of a Binary Search Tree
    // Time Complexity: O(h), where h is the height of the tree. In the worst case,
    // the height of the tree can be equal to the number of nodes in the tree.
    public static Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null) {
            return null;
        }
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    // LeetCode 108 - Convert Sorted Array to Binary Search Tree
    public static Node sortedArrayToBST(int[] nums) {
        return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
    }

    public static Node sortedArrayToBSTHelper(int[] nums, int low, int high) {
        if (low > high) { // Base case: If the low index is greater than the high index, it means there
                          // are no elements to process, so we return null.
            return null;
        }
        int mid = low + (high - low) / 2;
        Node node = new Node(nums[mid]);
        node.left = sortedArrayToBSTHelper(nums, low, mid - 1);
        node.right = sortedArrayToBSTHelper(nums, mid + 1, high);
        return node;
    }

    // Inorder Predecessor in BST
    public static Node inorderPredecessor(Node root, Node p) {
        // Ek baar jaao left subtree mein, aur wahan se rightmost node ko return karo
        if (p.left != null) {
            Node curr = p.left;
            while (curr.right != null) {
                curr = curr.right;
            }
            return curr;
        }
        return null;
    }

    // Introduction to Morris Traversal
    public static void morrisTraversal(Node root) {
        Node curr = root;
        while (curr != null) {
            if (curr.left != null) {
                // Find predecessor
                Node pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }

                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                } else {
                    pred.right = null;
                    System.out.print(curr.val + " ");
                    curr = curr.right;
                }
            } else {
                System.out.print(curr.val + " ");
                curr = curr.right;
            }
        }
    }

    // You can solve LeetCode 114 Flatten Binary Tree to Linked List using Morris Traversal

    public static void flatten(Node root) {
        Node curr = root;
        while (curr != null) {
            if (curr.left != null) {
                Node pred = curr.left;
                while (pred.right != null) {
                    pred = pred.right;
                }
                pred.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right;
        }
    }
}
