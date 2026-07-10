package Stacks;

import java.util.Stack;
public class Questions {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        // Push element at bottom of the stack- Recursively
         pushAtBottom(st, 5);
         System.out.println(st);

         // Reverse a stack using recursion
         reverseStack(st);
         System.out.println(st);
    }

    public static void pushAtBottom(Stack<Integer> st, int data) {
        if(st.isEmpty()) {
            st.push(data);
            return;
        }
        int top = st.pop();
        pushAtBottom(st, data);
        st.push(top);
    }

    // Reverse a stack using recursion
    public static void reverseStack(Stack<Integer> st) {
        if(st.isEmpty()) {
            return;
        }
        int top = st.pop();
        reverseStack(st);
        pushAtBottom(st, top);
    }

     // parenthesis checker
     public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        if (s.length()%2==1) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

}
