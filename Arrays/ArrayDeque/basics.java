package ArrayDeque;

import java.util.ArrayDeque;

public class basics {
    public static void main(String[] args) {
        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.add("A");           // Adds to tail (end)
        deque.addFirst("B");      // Adds to head (start)
        deque.addLast("C");       // Adds to tail

        // Accessing elements
        System.out.println(deque.getFirst()); // B
        System.out.println(deque.getLast());  // C

        // Removing elements
        deque.removeFirst();     // Removes B
        deque.removeLast();      // Removes C

        System.out.println(deque); // [A]
    }
}
