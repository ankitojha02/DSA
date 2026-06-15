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
    int size;
    void addAtEnd(int val){
        Node newNode = new Node(val);
        if(head == null){ // agar head null hai, to linked list empty hai, to newNode ko head aur tail dono banado
            head = newNode; 
            tail = newNode;
        }else{
            tail.next = newNode; // tail ke next me newNode ko link kiya, kyunki newNode ab tail ban jayega, to purana tail ke next me newNode ko link karna padega
            tail = newNode;
        }
        size++;
    }

    void addAtHead(int val) {
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head; // newNode ke next me head ko link kiya, kyunki newNode ab head ban jayega, to uske next me purana head ko link karna padega
            head = newNode;
        }
        size++;
    }

    boolean search(int val) {
        Node temp = head;
        while(temp != null){
            if(temp.val == val){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    void deleteAtHead() {
        if(head == null){
            System.out.println("List is empty");
            return;
            }
            head = head.next; // head ke next me head ko link kiya, kyunki head ko delete karna hai, to uske next me jo node hai, usko head banado
            tail = null; // tail ko null kardo, kyunki ab list empty hai
            size--;
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
        list.addAtEnd(10); // Time complexity of addAtEnd is O(1) because we are maintaining a tail pointer, so we can directly add the new node at the end without traversing the list. If we didn't maintain a tail pointer, the time complexity would be O(n) because we would have to traverse the entire list to find the last node.
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);

        list.display();
        list.addAtHead(50);
        list.display();
        
        list.deleteAtHead();
        list.display();
        System.out.println("Size of the list: " + list.size);
        
        
        System.out.println("Is 20 present in the list? " + list.search(200));
    }
   
}


