package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QuestionsQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);


        // Reverse the queue
        reverseQueue(q);

       
    }

    // Function to reverse the queue
    public static void reverseQueue(Queue<Integer> q) {
        Stack<Integer> stack = new Stack<>();
        while (!q.isEmpty()) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
    }

    // Reverse first k elements of the queue - Gfg Practice
    public static void reverseFirstKElements(Queue<Integer> q, int k) {
        if (q.isEmpty() || k <= 0 || k > q.size()) {
            return;
        }
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < k; i++) {
            stack.push(q.remove());
        }
        while (!stack.isEmpty()) {
            q.add(stack.pop());
        }
        for (int i = 0; i < q.size() - k; i++) {
            q.add(q.remove());
        }
    }

    // Find the winner of the Circular Game - Leetcode 1823
    public static int findTheWinner(int n, int k) {
        Queue<Integer> q = new LinkedList<>();
        // Add players to the queue
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        // Simulate the game
        // Remove every k-th player until only one remains
        while (q.size() > 1) {
            for (int i = 0; i < k - 1; i++) {
                q.add(q.remove());
            }
            q.remove();
        }
        return q.peek();
    }
}
