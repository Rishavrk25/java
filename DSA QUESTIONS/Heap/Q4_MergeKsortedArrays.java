package Heap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Q4_MergeKsortedArrays {
    // O(k² log k).
class Pair implements Comparable<Pair>{
    int ele;
    int row;
    int col;
    Pair(int ele,int row,int col){
        this.ele=ele;
        this.row=row;
        this.col=col;
    }
    public int compareTo(Pair p){
        return this.ele - p.ele;
    }
}
class Solution {
    // Function to merge k sorted arrays.
    public static ArrayList<Integer> mergeKArrays(int[][] arr, int k) {
        // Write your code here.
        ArrayList<Integer> res=new ArrayList<>();
        PriorityQueue<Pair> pq=new PriorityQueue<>();
        for(int i=0;i<k;i++){
            pq.add(new Pair(arr[i][0],i,0));
        }
        while(!pq.isEmpty()){
            Pair p=pq.remove();
            res.add(p.ele);
            if(p.col+1<k) pq.add(new Pair(arr[p.row][p.col+1],p.row,p.col+1));
        }
        return res;
        
        
        
        
        
        // PriorityQueue<Integer> pq=new PriorityQueue<>();
        // int r=arr.length;
        // int c=arr[0].length;
        // for(int i=0;i<r;i++){
        //     for(int j=0;j<c;j++){
        //         pq.add(arr[i][j]);
        //     }
        // }
        // ArrayList<Integer> res=new ArrayList<>();
        // while(!pq.isEmpty()){
        //     res.add(pq.remove());
        // }
        // return res;
    }
}
}
