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

         System.out.println(removeDuplicates("aaaaabbcccdaa"));
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
            } else { // closing bracket
                if (st.isEmpty()) { // if stack is empty and we get a closing bracket, then it is invalid
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

    // Remove Consecutive Duplicates from a String using Stack
    public static String removeDuplicates(String s) {
        if(s.length() == 0) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) != sb.charAt(sb.length() - 1)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
