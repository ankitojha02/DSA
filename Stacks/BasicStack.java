package Stacks;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        // Stack<Integer> st = new Stack<>();
        // st.pop(); // it will throw EmptyStackException because the stack is empty
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // System.out.println(st); // Auxilary space - O(n) because it creates a new array to store the elements of the stack
        // System.out.println(st.peek());
        // System.out.println(st.size());
        // st.pop();
        // System.out.println(st);
        // System.out.println(st.pop()); // it will remove the top element and return it
        // System.out.println(st);
        

        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // while(st.size() > 0) {
        //    System.out.println(st.pop());
        // } // Now the stack is empty and if we try to pop an element it will throw EmptyStackException

        // Print the elemnts from top to bottom
        // while(st.size() > 0) {
        //     int top = st.pop();
        //     System.out.println(top);
        //     st1.push(top);
        // }

        // // Print the elements from bottom to top
        // while(st1.size() > 0) {
        //     int top = st1.pop();
        //     System.out.println(top);
        //     st.push(top);
        // }

        // peek at particular index
        int index = 2;

        // while(st.size() > index + 1) {
        //     st1.push(st.pop());
        // }
        // System.out.println(st.peek());
        // while(st1.size() > 0) {
        //     st.push(st1.pop());
        // }

        // Add at particular index
        index = 2;

        while(st.size() > index) {
            st1.push(st.pop());
        }
        st.push(25);
        while(st1.size() > 0) {
            st.push(st1.pop());
        }
       
    }
}
