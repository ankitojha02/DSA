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
        
    }
}
