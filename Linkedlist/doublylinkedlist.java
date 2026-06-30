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
            tail = null; // List is now empty
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



}

public class doublylinkedlist {
    public static void main(String[] args) {
        dll list = new dll();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtHead(5);
       
        list.displayForward();
    }
}
