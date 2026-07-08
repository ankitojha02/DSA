package Stacks;

import java.util.Stack;

public class BasicStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.pop(); // it will throw EmptyStackException because the stack is empty
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st); // Auxilary space - O(n) because it creates a new array to store the elements of the stack
        System.out.println(st.peek());
        System.out.println(st.size());
        st.pop();
        System.out.println(st);
        System.out.println(st.pop()); // it will remove the top element and return it
        System.out.println(st);
        
    }
}
