package Deque;

import java.util.*;

public class basics {

  public class LinkedDequeExample {
    public static void main(String[] args) {
      Deque<String> dq = new LinkedList<>();

      // Insert at both ends
      dq.addFirst("A"); // front -> A
      dq.addLast("B"); // A, B
      dq.offerFirst("X"); // X, A, B
      dq.offerLast("Y"); // X, A, B, Y

      System.out.println("Deque: " + dq);

      // Remove from both ends
      dq.removeFirst(); // removes X
      dq.pollLast(); // removes Y

      System.out.println("After removal: " + dq);

      // Peek from both ends
      System.out.println("Front: " + dq.peekFirst()); // A
      System.out.println("Rear: " + dq.peekLast()); // B
    }
  }

}
