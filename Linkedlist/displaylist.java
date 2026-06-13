package Linkedlist;

class Node {
    int val;
    Node next; // default value of next is null
    Node(int val) {
        this.val = val;
       
    }
}

public class displaylist {

    public static void display(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // Node banaya or usme value daali
        Node a = new Node(10); // head node
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50); // tail node
        
        // Node ko link kiya
        a.next = b;
        b.next = c; 
        c.next = d;
        d.next = e;

        display(a);
        displayRecursive(a);
    }

    public static void displayRecursive(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        displayRecursive(head.next);
    }
}
