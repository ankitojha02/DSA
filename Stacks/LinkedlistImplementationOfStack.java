package Stacks;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class MyStack {
    Node head;
    int len;

    int peek() {
        if (head == null) {
            return -1;
        }
        return head.val;
    }

    int pop() {
        if (head == null) {
            return -1;
        }
        int top = head.val;
        head = head.next;
        len--;
        return top;
    }

    void push(int val) {
        if (head == null) {
            head = new Node(val);
            len++;
            return;
        }
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
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

public class LinkedlistImplementationOfStack {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.size());
        st.display();
    }
}
