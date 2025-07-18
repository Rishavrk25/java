package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class stl {
    public static void main(String[] args) {

        // FIFO Queue using LinkedList
        Queue<Integer> q = new LinkedList<>();

        // Enqueue
        q.add(10);
        q.add(20);
        q.offer(30); // same as add()

        // Print queue
        System.out.println("Queue: " + q);

        // Front element (peek)
        System.out.println("Front: " + q.peek());

        // Dequeue
        System.out.println("Removed: " + q.remove());
        System.out.println("Queue after removal: " + q);

        // Poll (safe remove)
        System.out.println("Removed using poll(): " + q.poll());
        System.out.println("Queue now: " + q);

        
    }
}

