import java.util.PriorityQueue;

public class kSortedArray {
  public static void main(String[] args) {
    int arr[]={6,5,3,2,8,10,9};
    int k=3;
    //min Heap
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int j=0;
    for(int i=0;i<arr.length;i++){
      pq.add(arr[i]);
      if(pq.size()>k) {
        // System.out.println(pq.peek());
        arr[j++]=pq.peek();
        pq.remove();
      }
    }
   while(pq.size()!=0){
      arr[j++]=pq.peek();
      pq.remove();
    }
    for(int ele:arr){
      System.out.print(ele+" ");
    }
  }
}
