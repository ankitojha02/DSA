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
}
