package Linkedlist;

class Node {
    int val;
    Node next; // default value of next is null
    Node(int val) {
        this.val = val;
       
    }
}

class Linkedlist{
    Node head;
    Node tail;
    void addAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }
    }
    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Linkedlistdatastructure {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);

        list.display();
        list.addAtHead(50);
        list.display();
    }
   
}


