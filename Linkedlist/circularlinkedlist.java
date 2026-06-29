package Linkedlist;

class Listnode {
    int val;
    Listnode next;

    Listnode(int val) {
        this.val = val;
    }
}

class Circularlinkedlists {
    Listnode head;
    Listnode tail;
    int size;

    void addAtEnd(int val) {
        Listnode newNode = new Listnode(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
        size++;
    }

    void addAtHead(int val) {
        Listnode newNode = new Listnode(val);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head;
        } else {
            newNode.next = head;
            head = newNode;
            tail.next = head;
        }
        size++;
    }

    void addAtIndex(int index, int val) {

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

        Listnode newNode = new Listnode(val);
        Listnode temp = head;

        // temp should reach (index-1)th node
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        size++;
    }

    void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Listnode temp = head;

        do {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(Head)");
    }
}

public class circularlinkedlist {

    public static void main(String[] args) {

        Circularlinkedlists cll = new Circularlinkedlists();

        cll.addAtEnd(10);
        cll.addAtEnd(20);
        cll.addAtEnd(30);

        cll.addAtHead(5);

        cll.addAtIndex(2, 15);

        cll.display();
    }

    // split a linked list into two halves - Homework
    // reverse circular linked list - Homework
}