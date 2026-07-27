package Queues;

import java.util.LinkedList;
import java.util.Queue;
public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        // Adding elements to the queue
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Queue: " + queue); // nakli printing the queue
        // Removing elements from the queue
        queue.remove();
        System.out.println("Queue after removing an element: " + queue);
        System.out.println("Front element: " + queue.peek()); // Getting the front element  
        System.out.println("Is the queue empty? " + queue.isEmpty()); // Checking if the queue is empty
        System.out.println("Size of the queue: " + queue.size()); // Getting the size of the queue

        // Traversing the queue
        int n = queue.size();
        for (int i = 0; i < n; i++) {
            System.out.println(queue.peek()); // Print the front element
            queue.add(queue.remove()); // Move the front element to the back of the queue
        }

        // Adding elements at a particular index
        int index = 2;
        for (int i = 0; i < index; i++) {
            queue.add(queue.remove()); // Move the front element to the back of the queue
        }
        queue.add(5); // Add the new element at the desired index
        for (int i = 0; i < n - index; i++) {
            queue.add(queue.remove()); // Move the front element to the back of the queue
        }

        // Peeking at a particular index
        index = 2;
        for (int i = 0; i < index; i++) {
            queue.add(queue.remove()); // Move the front element to the back of the queue
        }
        System.out.println("Element at index " + index + ": " + queue.peek());
        for (int i = 0; i < n - index; i++) {
            queue.add(queue.remove()); // Move the front element to the back of the queue
        }

        // Removing an element at a particular index
        index = 2;
        for (int i = 0; i < index; i++) {
            queue.add(queue.remove()); // Move the front element to the back of the queue
        }
        queue.remove(); // Remove the element at the desired index
        for (int i = 0; i < n - index - 1; i++) {
            queue.add(queue.remove()); // Move the front element to the back of the queue
        }
    }
}
