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
}
