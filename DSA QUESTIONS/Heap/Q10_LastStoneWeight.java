package Heap;
import java.util.Collections;
import java.util.PriorityQueue;

public class Q10_LastStoneWeight {
  public int lastStoneWeight(int[] arr) {
        // 1. Brute Force 
        //   TC = O(n^2 logn)
        //   SC = O(n)
    
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=0;i<arr.length;i++){
        //     list.add(arr[i]);
        // }
        // while(list.size()>1){
        //     Collections.sort(list);
        //     int Ele=list.remove(list.size()-1);
        //     int ele=list.remove(list.size()-1);
        //     if(ele!=Ele) list.add(Ele-ele);    
        // }
        // if(list.size()==0) return 0;
        // return list.get(0);


        // 2. Using Heap -> maxHeap (OPTIMAL)
        //   TC = O(nlogn)
        //   SC = O(n)  

        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        while(pq.size()>1){
            int Ele=pq.remove();
            int ele=pq.remove();
            if(Ele!=ele) pq.add(Ele-ele);
        }
        if(pq.size()==0) return 0;
        return pq.remove();



    }
}
