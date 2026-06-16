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
    }

    public static void middleNode(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        System.out.println("Middle node: " + slow.val);
    }
}
