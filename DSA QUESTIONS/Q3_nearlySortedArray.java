import java.util.PriorityQueue;

public class Q3_nearlySortedArray {
  public void nearlySorted(int[] arr, int k) {
        // 1. Using Builin sorting
        //   TC = O(nlogn)
        //   SC = O(logn) / O(n)


        // 2. Using Heap (OPTIMAL)
        //   TC = O(nlogk)
        //   SC = O(k)
        // min Heap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int n=arr.length;
        int j=0;
        for(int i=0;i<n;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                arr[j++]=pq.peek();
                pq.remove();
            }
        }
        while(pq.size()!=0){
            arr[j++]=pq.peek();
            pq.remove();
        }
    }
}
