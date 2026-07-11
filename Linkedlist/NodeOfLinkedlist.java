// package Linkedlist;

// class Node {
//     int val;
//     Node next; // default value of next is null
//     Node(int val) {
//         this.val = val;
       
//     }
// }

// public class NodeOfLinkedlist {
//     public static void main(String[] args) {
//         // Node banaya or usme value daali
//         //   Node a = new Node();
//         //   a.val = 10;
//         //   Node b = new Node();
//         //   b.val = 20;
//         //   Node c = new Node();
//         //   c.val = 30;
//         //   Node d = new Node();
//         //   d.val = 40;
//         //   Node e = new Node();
//         //   e.val = 50;

//         // // Node ko link kiya
//         // // a ke next me b ko link kiya, b ke next me c ko link kiya, c ke next me d ko link kiya, d ke next me e ko link kiya
//         //   a.next = b;
//         //   b.next = c;
//         //   c.next = d;
//         //   d.next = e;

//         // Node banaya or usme value daali
//         Node a = new Node(10); // head node
//         Node b = new Node(20);
//         Node c = new Node(30);
//         Node d = new Node(40);
//         Node e = new Node(50); // tail node
        
//         // Node ko link kiya
//         a.next = b;
//         b.next = c; 
//         c.next = d;
//         d.next = e;

//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(a.next);

//         // You noticed that the output of b and a.next is same because both are pointing to the same memory location where the value of b is stored.

        
//     }
// }
