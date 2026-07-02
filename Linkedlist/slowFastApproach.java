package Linkedlist;

class Node {
    int val;
    Node next; // default value of next is null
    Node(int val) {
        this.val = val;
       
    }
}

public class slowFastApproach {
    public static void main(String[] args) {
        Node a = new Node(10); // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50); 

        // Node ko link kiya
        a.next = b;
        b.next = c; 
        c.next = d;
        d.next = e;

        // Find the middle of the linked list using slow and fast pointer approach
        middleNode(a);
        deleteMiddleNode(a);
    }

    public static void middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) { // note order of condition is important, because if we check for fast.next before checking for fast, then we will get null pointer exception when fast is null
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node: " + slow.val);
    }

    public static void deleteMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        if (prev != null) {
            prev.next = slow.next; // delete the middle node by linking the previous node to the next node of the middle node
        }

        System.out.println("Middle node deleted");
    }

    // Kth from end of the linked list using slow and fast pointer approach
    public static void kthFromEnd(Node head, int k) {
        Node slow = head;
        Node fast = head;

        // Move fast pointer k steps ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                System.out.println("k is greater than the length of the linked list");
                return;
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            slow = slow.next;
            fast = fast.next;
        }

        System.out.println("Kth node from the end: " + slow.val);

    }

    // Delete nth node from the end of the linked list using slow and fast pointer approach
    public static void deleteNthFromEnd(Node head, int n) {
        Node slow = head;
        Node fast = head;
        Node prev = null;

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                System.out.println("n is greater than the length of the linked list");
                return;
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next;
        }

        // Delete the nth node from the end
        if (prev != null) {
            prev.next = slow.next;
        } else {
            // If prev is null, it means we are deleting the head node
            head = head.next;
        }

        System.out.println("Nth node from the end deleted");
    }

    // Homework: Solve Q.1721 Swapping Nodes in a Linked List using slow and fast pointer approach


    // Intersection of two linked lists using two pointer approach
    public static Node intersection(Node headA, Node headB) {
       Node t1 = headA;
       Node t2 = headB;

       int size1 = 0;
       int size2 = 0;
         while (t1 != null) {
              size1++;
              t1 = t1.next;
         }
            while (t2 != null) {
                size2++;
                t2 = t2.next;
            }
            t1 = headA;
            t2 = headB;

            int diff = Math.abs(size1 - size2);

            if (size1 > size2) {
                for (int i = 0; i < diff; i++) {
                    t1 = t1.next;
                }
            } else {
                for (int i = 0; i < diff; i++) {
                    t2 = t2.next;
                }
            }

            while (t1 != null && t2 != null) {
                if (t1 == t2) {
                    return t1; // Intersection point found
                }
                t1 = t1.next;
                t2 = t2.next;
            }
            return null; // No intersection
        }
     // Homework: Odd even linked list

     // Detect cycle in a linked list using slow and fast pointer approach
     public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle
    }

    // Find the starting point of the cycle in a linked list using slow and fast pointer approach
    public static Node cycleStart(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                // Cycle detected, now find the starting point
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // Starting point of the cycle
            }
        }
        return null; // No cycle
    }

    // Remove duplicates from a sorted linked list using slow and fast pointer approach
    public static void removeDuplicates(Node head) {
    if (head == null) {
        return;
    }
        Node i = head;
        Node j = head;
        while (j != null) {
            if (i.val == j.val) {
                j = j.next; // Move j to the next node if it's a duplicate
            } else {
                i.next = j; // Link i to j if it's not a duplicate
                i = i.next; // Move i to the next node
                j = j.next; // Move j to the next node
            }
        }
        i.next = null; // Set the next of the last unique node to null
        // i now points to the last unique node
    }


    // VVI
    // Remove all duplicates from sorted linked list 2 Leetcode 82
    public static Node removeAllDuplicates(Node head) {
        if (head == null) {
            return null;
        }
        Node dummy = new Node(0); // Dummy node to handle edge cases
        dummy.next = head;
        Node prev = dummy; // Previous pointer to track the last unique node
        Node current = head; // Current pointer to traverse the list
        while (current != null) {
            // Check if current node is a duplicate
            if (current.next != null && current.val == current.next.val) {
                // Skip all nodes with the same value
                while (current.next != null && current.val == current.next.val) {
                    current = current.next;
                }
                prev.next = current.next; // Link previous node to the next unique node
            } else {
                prev = prev.next; // Move previous pointer to the next unique node
            }
            current = current.next; // Move current pointer to the next node
        }
        return dummy.next; // Return the head of the modified list
    }

    // Rotate a linked list to the right by k places using slow and fast pointer approach - Time complexity O(n) and space complexity O(1)
   public Node rotateRight(Node head, int k) {
        int n = length(head);
        if(head == null || head.next == null || k==0) return head;
        k%=n;
         if(k==0) return head;
        
        Node fast = head;
        Node slow = head;

        for(int i = 0; i < k+1; i++){
            fast = fast.next;
        }

        while(fast!=null){
            slow = slow.next;
            fast = fast.next;
        }
        Node t = slow.next;
        slow.next = null;
        Node tail = t;
        
        while(tail.next != null){
            tail = tail.next;
        }

        tail.next = head;

        return t;
    }

    public int length(Node head){
        int count = 0;
        Node temp = head;
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }


    // Merge two sorted linked list using dummy node approach - Time complexity O(n) and space complexity O(1)
    public Node mergeTwoLists(Node l1, Node l2) {
        Node dummy = new Node(0); // Dummy node to handle edge cases
        Node i = l1; // Pointer to build the merged list
        Node j = l2; // Pointer to build the merged list
        Node k = dummy; // Pointer to build the merged list

        while (i != null && j != null) {
            if (i.val < j.val) {
                k.next = i;
                i = i.next;
            } else {
                k.next = j;
                j = j.next;
            }
            k = k.next;
        }

        // Attach the remaining nodes from either list
        k.next = (i != null) ? i : j;

        return dummy.next; // Return the head of the merged list
    }

    // Sort linked list using merge sort approach - Time complexity O(n log n) and space complexity O(log n) due to recursion stack
    public Node sortList(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: if the list is empty or has only one node, it's already sorted
        }
        Node mid = getMid(head); // Find the middle node to split the list
        Node left = sortList(head); // Recursively sort the left half
        Node right = sortList(mid); // Recursively sort the right half
        return mergeTwoLists(left, right); // Merge the two sorted halves   
    }

    // Helper function to find the middle node of the linked list
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = null; // To keep track of the node before slow  

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if (prev != null) {
            prev.next = null; // Split the list into two halves
            return slow;
        }
        return slow;
    }

    // Homework : LeetCode challeng No. 86 Partition List
     public Node partition(Node head, int x) {
        Node dummy1 = new Node(0);
        Node dummy2 = new Node(-1);

        Node t1 = dummy1;
        Node t2 = dummy2;
        
        Node t = head;

        while(t != null) {
            if(t.val < x) {
                t1.next = t;
                t = t.next;
                t1 = t1.next;
            }
            else{
                t2.next = t;
                t = t.next;
                t2 = t2.next;
            }
        }
        t1.next = dummy2.next;
        t2.next = null;
        return dummy1.next;

    }

    // Reverse a linked list - Time complexity O(n) and space complexity O(1)
    // Time complexity is O(n) because we are traversing the entire list once, and space complexity is O(1) because we are using a constant amount of extra space (three pointers: prev, curr, forward).
    public Node reverseList(Node head) {
        Node prev = null;
        Node curr = head;
        Node forward = null; // This variable is not necessary, but can be used for clarity

        while (curr != null) {
            forward = curr.next; // Store the next node
            curr.next = prev; // Reverse the link
            prev = curr; // Move prev to current node
            curr = forward; // Move to the next node
        }
        return prev; // New head of the reversed list
    }

    // using recursion
    public Node reverseListRecursive(Node head) {
        if (head == null || head.next == null) {
            return head; // Base case: if the list is empty or has only one node, return it as is
        }
        Node newHead = reverseListRecursive(head.next); // Recursively reverse the rest of the list
        head.next.next = head; // Make the next node point to the current node
        head.next = null; // Set the next of the current node to null
        return newHead; // Return the new head of the reversed list
    }

    // Palindrome linked list - Time complexity O(n) and space complexity O(1)
     public boolean isPalindrome(Node head) {
        if(head == null || head.next == null) return true;

        Node slow = head;
        Node prev = null;
        Node fast = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = null;
        Node newN = reverseList(slow);

        Node i = head;
        Node j = newN;

        while(i != null && j != null) {
            if(i.val != j.val) return false;
            i = i.next;
            j = j.next;
        }
        return true;
    }
    
    // Homework: Q.2130 Maximum Twin Sum of a Linked List - Leetcode

    // Re-order list - Leetcode 143 - Homework
    
    // Merge k sorted linked list - Leetcode 23 - Homework - Hard Question
    
    // Reverse a sublist of a linked list - Leetcode 92 - Time complexity O(n) and space complexity O(1)
    // Time complexity is O(n) because we are traversing the entire list once, and space complexity is O(1) because we are using a constant amount of extra space (a few
    public Node reverseSublist(Node head, int left, int right) {
        if (head == null || left == right) {
            return head; // No need to reverse if the list is empty or left equals right
        }

        Node dummy = new Node(0); // Create a dummy node to simplify edge cases
        dummy.next = head;
        Node prev = dummy; // Pointer to the node before the sublist

        // Move prev to the node just before the left position
        for (int i = 1; i < left; i++) {
            prev = prev.next;
        }

        Node curr = prev.next; // The first node of the sublist to be reversed
        Node next = null; // Pointer to keep track of the next node during reversal

        // Reverse the sublist from left to right
        for (int i = 0; i < right - left + 1; i++) {
            next = curr.next; // Store the next node
            curr.next = next.next; // Reverse the link
            next.next = prev.next; // Insert next at the beginning of the reversed sublist
            prev.next = next; // Update prev to point to the new head of the reversed sublist
        }

        return dummy.next; // Return the new head of the list
    }
     
    // Add two numbers represented by linked lists - Leetcode 2 - Time complexity O(max(m,n)) and space complexity O(max(m,n))
    
    // Find the minimum and maximum number of nodes between critical points - Leetcode 2058 - Time complexity O(n) and space complexity O(1)
    public int[] nodesBetweenCriticalPoints(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1}; // Not enough nodes to have critical points
        }

        int minDistance = Integer.MAX_VALUE;
        int maxDistance = Integer.MIN_VALUE;
        int firstCriticalIndex = -1;
        int lastCriticalIndex = -1;
        int index = 1; // Start from the second node
        Node a = head;
        Node b = a.next;
        Node c = b.next;

        if(c == null) {
            return new int[]{-1, -1}; // Not enough nodes to have critical points
        }

        while (c != null) {
            if ((b.val > a.val && b.val > c.val) || (b.val < a.val && b.val < c.val)) {
                if (firstCriticalIndex == -1) {
                    firstCriticalIndex = index; // First critical point found
                } else {
                    minDistance = Math.min(minDistance, index - lastCriticalIndex); // Update min distance
                }
                lastCriticalIndex = index; // Update last critical point index
            }
            a = b;
            b = c;
            c = c.next;
            index++;
        }

        if (firstCriticalIndex == -1 || lastCriticalIndex == firstCriticalIndex) {
            return new int[]{-1, -1}; // Not enough critical points to calculate distances
        }

        maxDistance = lastCriticalIndex - firstCriticalIndex; // Calculate max distance

        return new int[]{minDistance, maxDistance};
    }

}
