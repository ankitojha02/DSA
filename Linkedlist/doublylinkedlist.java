package Linkedlist;

class DoublyNode {
    int val;
    DoublyNode next;
    DoublyNode prev;

    DoublyNode(int val) {
        this.val = val;
    }
}

/**
 * Innerdoublylinkedlist
 */
class dll {
    DoublyNode head;
    DoublyNode tail;
    int size;

    void addAtEnd(int val) {
        DoublyNode newNode = new DoublyNode(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    void addAtHead(int val) {
        DoublyNode newNode = new DoublyNode(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void deleteAtHead() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // If the list becomes empty, set tail to null as well
        }
        size--;
    }

    void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        tail = tail.prev;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail.next = null;
        }
        size--;
    }

    void displayForward() {
        DoublyNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayBackward() {
        DoublyNode temp = tail;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insertAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == size) {
            addAtEnd(val);
            return;
        }

        DoublyNode newNode = new DoublyNode(val);
        DoublyNode temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next.prev = newNode;
        temp.next = newNode;

        size++;
    }

    void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds");
            return;
        }

        if (index == 0) {
            deleteAtHead();
            return;
        }

        if (index == size - 1) {
            deleteAtEnd();
            return;
        }

        DoublyNode temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;
        if (temp.next != null) {
            temp.next.prev = temp;
        }

        size--;
    }

}

public class doublylinkedlist {
    public static void main(String[] args) {
        dll list = new dll();
        list.addAtHead(10);
        list.addAtHead(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);
        list.addAtHead(60);

        list.displayForward();
        list.displayBackward();

        list.deleteAtHead();
        list.deleteAtEnd();

        list.displayForward();
        list.insertAtIndex(2, 25);
        list.displayForward();
        list.displayBackward();
        list.deleteAtIndex(2);
        list.displayForward();
        list.displayBackward();

    }

    // Reverse Doubly Linked List
    public static DoublyNode reverseDoublyLinkedList(DoublyNode head) {
        if (head == null) {
            return null;
        }
        DoublyNode current = head;
        DoublyNode prev = null;
        DoublyNode forward = null;

        while (current != null) {
            forward = current.next;
            current.next = prev;
            current.prev = forward;
            prev = current;
            current = forward;
        }
        return prev;
    }

    // Homework: Rotate Doubly Linked List - GFG Practice Problem
    // Homework: Remove Duplicates from Sorted Doubly Linked List - GFG Practice
    // Problem

    // Flatten a Multilevel Doubly Linked List - LeetCode Problem - Using Recursion
    // public static DoublyNode flatten(DoublyNode head) {
    //     if (head == null) {
    //         return null;
    //     }

    //     DoublyNode curr = head;

    //     while (curr != null) {
    //         if (curr.child != null) {
    //             DoublyNode next = curr.next;
    //             DoublyNode child = flatten(curr.child);

    //             curr.next = child;
    //             child.prev = curr;
    //             curr.child = null;

    //             // Move to the tail of the child list
    //             while (curr.next != null) {
    //                 curr = curr.next;
    //             }

    //             // Connect the tail with the original next node
    //             curr.next = next;
    //             if (next != null) {
    //                 next.prev = curr;
    //             }
    //         }

    //         curr = curr.next;
    //     }

    //     return head;
    // }

    
}
