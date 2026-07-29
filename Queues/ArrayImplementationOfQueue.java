package Queues;

class CircularQueue {
    int[] arr;
    int f;
    int r;
    int size;
    CircularQueue(int capacity) {
        arr = new int[capacity];
    }

    void add(int val) {
        if (size == arr.length) {
            System.out.println("Queue is full");
            return;
        }
        arr[r++] = val;
        if (r == arr.length) {
            r = 0;
        }
        size++;
    }

    int remove() {
        if ( size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int val = arr[f++];
        if (f == arr.length) {
            f = 0;
        }
        size--;
        return val;
    }

    int peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[f];
    }

    int size() {
        return size;
    }

    void display() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(arr[(f + i) % arr.length] + " ");
        }
        System.out.println();
    }
}

public class ArrayImplementationOfQueue {
    public static void main(String[] args) {
       CircularQueue q = new CircularQueue(5);
       q.add(10);
       q.add(20);
       q.add(30);
       q.add(40);
       q.add(50);
       q.add(60); // Queue is full
       System.out.println(q.remove()); // 10
       System.out.println(q.peek()); // 20
       System.out.println(q.size()); // 4
    }
}
