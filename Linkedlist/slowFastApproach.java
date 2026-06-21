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
}
