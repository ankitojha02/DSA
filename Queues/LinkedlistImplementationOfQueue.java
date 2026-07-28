package Queues;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class Queue {
    Node head;
    Node tail;
    int len;

    int peek() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }

    int remove() {
        if (head == null) {
            return -1;
        }
        int front = head.val;
        head = head.next;
        len--;
        if (head == null) {
            tail = null; // If the queue becomes empty, set tail to null
        }
        return front;
    }

    void add(int val) {
        Node newNode = new Node(val);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        len++;
    }

    int size() {
        return len;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LinkedlistImplementationOfQueue {
    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.display();
        System.out.println("Front: " + q.peek());
        System.out.println("Removed: " + q.remove());
        q.display();
    }
}
