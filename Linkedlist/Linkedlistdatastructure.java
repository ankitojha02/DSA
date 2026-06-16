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

    void addAtIndex(int index, int val) {
        if(index < 0 || index > size){
            System.out.println("Index out of bounds");
            return;
        }
        if(index == 0){
            addAtHead(val);
            return;
        }
        if(index == size){
            addAtEnd(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next; // temp ko index-1 tak le jao, kyunki hume index ke pehle wale node ke next me newNode ko link karna hai
        }
        newNode.next = temp.next; // newNode ke next me temp ke next ko link kiya, kyunki newNode ab index pe aayega, to uske next me temp ke next ko link karna padega
        temp.next = newNode; // temp ke next me newNode ko link kiya, kyunki temp ke next me newNode ko link karna hai
        size++;
    }

    void get(int index) {
        if(index < 0 || index >= size){
            System.out.println("Index out of bounds");
            return;
        }
        Node temp = head;
        for(int i = 0; i < index; i++){
            temp = temp.next; // temp ko index tak le jao, kyunki hume index pe wale node ko print karna hai
        }
        System.out.println("Node at index " + index + ": " + temp.val);
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

    void deleteAtIndex(int index) {
        if(index < 0 || index >= size){
            System.out.println("Index out of bounds");
            return;
        }
        if(index == 0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next; // temp ko index-1 tak le jao, kyunki hume index ke pehle wale node ke next me index ke next ko link karna hai
        }
        temp.next = temp.next.next; // temp ke next me temp ke next ke next ko link kiya, kyunki hume index ke node ko delete karna hai
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
        list.addAtEnd(50);

        list.display();
        list.addAtHead(50);
        list.display();
        
        list.deleteAtHead();
        list.display();
        System.out.println("Size of the list: " + list.size);
        
        
        System.out.println("Is 20 present in the list? " + list.search(200));
        
        list.addAtIndex(3, 35);
        list.display();

        list.get(3);

        list.deleteAtIndex(3);
        list.display();
    }
   
    // Solve Q.237 leetcode problem using linked list
}


