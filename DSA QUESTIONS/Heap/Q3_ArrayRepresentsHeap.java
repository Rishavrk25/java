package Heap;

public class Q3_ArrayRepresentsHeap {
     public boolean countSub(long arr[], long n) {
        for(int i=0;i<n/2;i++){
            int p=i;
            int l=2*i+1;
            int r=2*i+2;
            if(l<n && arr[p]<arr[l]) return false;
            if(r<n && arr[p]<arr[l]) return false;
        }    
        return true;
    }
}
