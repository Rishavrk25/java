import java.util.HashMap;
import java.util.PriorityQueue;

public class Q7_topKfrequentElements {

  // 1. Using PriorityQueue(max Heap) & Custom Comparator (OPTIMAL)
  //   TC = O(nlogk)
  //   SC = O(m) where m = no. of unique elements

  class Pair implements Comparable<Pair>{
        int ele;
        int freq;
        Pair(int ele , int freq){
            this.ele=ele;
            this.freq=freq;
        }
        public int compareTo(Pair p){
            return this.freq - p.freq;
        }
    }
    public int[] topKFrequent(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>(); // (ele,freq)
        int n=arr.length;
        for(int i=0;i<n;i++){
            int ele= arr[i];
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else map.put(arr[i],1);

        }
        // minHeap
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int key : map.keySet()){
            int val=map.get(key);
            pq.add(new Pair(key,val));
            if(pq.size()>k) pq.remove();
        }
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            Pair p = pq.peek();
            ans[i]=p.ele;
            pq.remove();
        }
        return ans;
    }
}
