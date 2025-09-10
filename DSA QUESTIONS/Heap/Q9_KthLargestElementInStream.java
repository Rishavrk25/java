package Heap;
import java.util.PriorityQueue;

public class Q9_KthLargestElementInStream {

// Input:
// ["KthLargest", "add", "add", "add", "add", "add"]
// [[3, [4, 5, 8, 2]], [3], [5], [10], [9], [4]]

// Output: [null, 4, 5, 5, 8, 8]

// Explanation:

// KthLargest kthLargest = new KthLargest(3, [4, 5, 8, 2]);
// kthLargest.add(3); // return 4
// kthLargest.add(5); // return 5
// kthLargest.add(10); // return 5
// kthLargest.add(9); // return 8
// kthLargest.add(4); // return 8

// 1. Using PriorityQueue(min Heap)
//    TC = O(logk)

  int k;
  PriorityQueue<Integer> pq;
  public KthLargest(int k, int[] nums) {
        this.k=k;
        pq=new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            add(nums[i]);
        }
    }
  public int add(int val) {
    pq.add(val);
    if (pq.size() > k)
      pq.remove();
    return pq.peek();

  }
}
