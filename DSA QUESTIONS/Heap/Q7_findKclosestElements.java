package Heap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Q7_findKclosestElements {

  // 1. Using PriorityQueue(max Heap) & Custom Comparator (OPTIMAL)
  //   TC = O(nlogk)
  //   SC = O(k)
  
   public class Pair implements Comparable<Pair>{
        int ele;
        int diff;
        Pair(int ele,int diff){
            this.ele=ele;
            this.diff=diff;
        }
        public int compareTo(Pair p){ 
            if(this.diff==p.diff){ // create heap on the basis of ele
                return this.ele - p.ele;
            }
            return this.diff - p.diff; // create heap on the basis of diff
        }
    }
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        //maxHeap
        PriorityQueue<Pair> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<arr.length;i++){
            int diff=Math.abs(arr[i]-x);
            pq.add(new Pair(arr[i],diff));
            if(pq.size()>k) pq.remove();
        }
        ArrayList<Integer> list= new ArrayList<>();
        while(pq.size()!=0){
            Pair p=pq.peek();
            list.add(p.ele);
            pq.remove();
        }
        Collections.sort(list);
        return list;
    }
}
