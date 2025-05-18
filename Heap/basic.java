

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class basic {
  public static void main(String[] args) {
    //min heap
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    pq.add(2);
    pq.add(10);
    pq.add(1);
    pq.remove();
    pq.add(0);
    System.out.println(pq);
    System.out.println(pq.peek());
    System.out.println(pq.size());

    //max heap
    PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());
    pq1.add(2);
    pq1.add(10);
    pq1.add(1);
    pq1.remove();
    pq1.add(0);
    System.out.println(pq1);
    System.out.println(pq1.peek());
    System.out.println(pq1.size());

  }
}
