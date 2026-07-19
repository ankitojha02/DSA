package Stacks;

import java.util.Stack;
import java.util.Arrays;
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

         // Next Greater Element 2
         int[] nums = {1, 2, 1};
         int[] result = nextGreaterElements(nums);
         System.out.println(Arrays.toString(result));
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

    // Remove all adjacent duplicates in a string using Stack
    public String removeDuplicate(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!st.isEmpty() && st.peek() == ch) {
                st.pop();
            } else {
                st.push(ch);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.reverse().toString();
    }

    // Baseball Game - Leetcode 682
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for (String op : ops) {
            if (op.equals("C")) {
                st.pop();
            } else if (op.equals("D")) {
                st.push(2 * st.peek());
            } else if (op.equals("+")) {
                int top = st.pop();
                int newTop = top + st.peek();
                st.push(top);
                st.push(newTop);
            } else {
                st.push(Integer.parseInt(op));
            }
        }
        int sum = 0;
        for (int score : st) {
            sum += score;
        }
        return sum;
    }

    // Remove nodes from linked list which have a greater value on right side - Leetcode 2487 Homework
    // Time Complexity - O(n)

    // Next Greater Element -- VVI - GeeksForGeeks
    // Next Greater Element 2 - Leetcode 503 - Homework
    
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = n - 1; i>=0; i--) {
            st.push(nums[i]);
        }

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums[i]) {
                st.pop();
            }
            result[i] = st.isEmpty() ? -1 : st.peek();
            st.push(nums[i]);
        }
        return result;
    }
}
