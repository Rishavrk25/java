package Heap;
import java.util.PriorityQueue;
import java.util.Collections;

public class Q1_KthSmallestElementInArray {
  public static int kthSmallest(int[] arr, int k) {
    // 1. Brute Force
    //   Selection sort (k passes), then arr[k-1]
    //   TC = O(kn)
    int n = arr.length;
    for (int i = 0; i < k; i++) {
        int minIndex = i;
        for (int j = i + 1; j < n; j++) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j;
            }
        }
        // Swap arr[i] and arr[minIndex]
        int temp = arr[i];
        arr[i] = arr[minIndex];
        arr[minIndex] = temp;
    }
    return arr[k - 1];


    // 2. Buildin Sort
    //   TC = O(nlogn)
    //   SC = O(logn) / O(n)


    // 3. Using heap (OPTIMAL)
    //   KthSmallest -> maxHeap
    //   KthLargest -> minHeap
    //   TC = O(nlogk)
    //   SC = O(k)

    // max heap
    PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    int n = arr.length;
    for (int i = 0; i < n; i++) {
      pq.add(arr[i]);
      if (pq.size() > k)
        pq.remove();
    }
    return pq.peek();
  }
}
