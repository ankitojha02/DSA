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

         // Stock Span Problem
         int[] prices = {100, 80, 60, 70, 60, 75, 85};
         int[] span = stockSpan(prices);
         System.out.println(Arrays.toString(span));

         // Celebrity Problem
         int[][] matrix = {
            {0, 1, 0},
            {0, 0, 0},
            {1, 1, 0}
        };
        int celebrity = findCelebrity(matrix);
        if (celebrity == -1) {
            System.out.println("No celebrity found.");
        } else {
            System.out.println("Celebrity is person " + celebrity); 
        }

        // Number of visible people in a queue - Leetcode 1944
        int[] heights = {10, 6, 8, 5, 11, 9};
        System.out.println(Arrays.toString(canSeePersonsCount(heights)));

        // Largest Rectangle in Histogram
        int[] heights2 = {2, 1, 5, 6, 2, 3};
        System.out.println(largestRectangleArea(heights2));
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
    // Next Greater Element 2 - Leetcode 503 
    // Time Complexity - O(n)
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

    // Stock Span Problem - GFG Practice
    public static int[] stockSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && prices[st.peek()] <= prices[i]) {
                st.pop();
            }
            span[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
        return span;
    }

    // Celebrity Problem 
    public static int findCelebrity(int[][] matrix) {
        int n = matrix.length;
        Stack<Integer> st = new Stack<>();
        
        // Push all people onto the stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }
        
        // Find the potential celebrity
        while (st.size() > 1) {
            int a = st.pop();
            int b = st.pop();

            if (matrix[a][b] == 1) {
                st.push(b);
            } else { // a does not knows b, so b cannot be a celebrity
                st.push(a);
            }
        }

        int candidate = st.pop();

        for (int i = 0; i < n; i++) {
            if (i != candidate && (matrix[candidate][i] == 1 || matrix[i][candidate] == 0)) {
                return -1;
            }
        }
        return candidate;
    }

    // Number of visible people in a queue - Leetcode 1944
    public static int[] canSeePersonsCount(int[] heights) {
        int n = heights.length;
        int[] result = new int[n];
        Stack<Integer> st = new Stack<>();
        st.push(heights[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            int count = 0;
            while (!st.isEmpty() && heights[i] > st.peek()) {
                st.pop();
                count++;
            }
            if(!st.isEmpty()) {
                count++;
            }
            result[i] = count;
            st.push(heights[i]);
        }
        return result;
    }

    // Largest Rectangle in Histogram - Leetcode 84 - Time Complexity - O(n)
    public static int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int[] nse = new int[n]; // Next Smaller Element
        int[] pse = new int[n]; // Previous Smaller Element
        nse[n - 1] = n; // If there is no smaller element to the right, we consider the index as n
        Stack<Integer> st = new Stack<>();
        st.push(n - 1);
        // Find Next Smaller Element for each bar
        for (int i = n - 2; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // Empty the stack to reuse it for Previous Smaller Element
        while (!st.isEmpty()) {
            st.pop();
        }
        pse[0] = -1; // If there is no smaller element to the left, we consider the index as -1
        st.push(0);
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        
        // Calculate the maximum area for each bar using the width between the next and previous smaller elements
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int width = nse[i] - pse[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    // Homework - Maximal Rectangle in a 2D binary matrix - Leetcode 85
    
}
