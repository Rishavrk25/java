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


    
    // 4. Quick Select (OPTIMAL)
    //   Average TC = O(n)  
    //   Worst TC = O(n^2)
    //   SC = O(logn) for recursive stack space
    int ans;
     void quickSelect(int arr[], int low, int high,int k) {
        if(low>high) return;
        int pi=partition(arr,low,high);
        if(pi+1 == k){
            ans = arr[pi];
            return;
        }
        if(k<pi+1) quickSelect(arr,low,pi-1,k);
        else quickSelect(arr,pi+1,high,k);
        
    }
     void swap(int arr[],int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
     int partition(int arr[], int low, int high) {
        // your code here
        int mid=(low+high)/2;
        int ele=arr[mid];
        int c=0;
        for(int i=low;i<=high;i++){
            if(arr[i]<ele) c++;
        }
        int pi=c+low;
        swap(arr,mid,pi);
        int i=low;
        int j=high;
        while(i<pi && j>pi){
            if(arr[i]<arr[pi]) i++;
            else if(arr[j]>=arr[pi]) j--;
            else swap(arr,i++,j--);
        }
        return pi;
        
        
    }

    public int findKthLargest(int[] arr, int k) {
        int n=arr.length;
         quickSelect(arr,0,n-1,n-k+1);
         return ans;
    }
  }
}
