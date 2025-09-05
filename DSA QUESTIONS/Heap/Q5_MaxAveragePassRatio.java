package Heap;

import java.util.Collections;
import java.util.PriorityQueue;

public class Q5_MaxAveragePassRatio {
class Triplet implements Comparable<Triplet> {
    int a; int b; double inc;
    Triplet(int a, int b, double inc) {
        this.a = a;
        this.b = b;
        this.inc = inc;
    }
    public int compareTo(Triplet t) {
        return Double.compare(this.inc,t.inc);
    }
}
class Solution {
    public double maxAverageRatio(int[][] arr, int extraStudents) {
        int n = arr.length;
        PriorityQueue<Triplet> pq = new PriorityQueue<>(Collections.reverseOrder()); // maxHeap
        for(int i=0;i<n;i++){
            int a = arr[i][0]; int b = arr[i][1];
            double inc = ((double)(a+1)/(b+1) - (double)a/b);
            Triplet t = new Triplet(a,b,inc);
            pq.add(t);
        }
        while(extraStudents > 0){
            Triplet t = pq.remove();
            int a = t.a + 1;
            int b = t.b + 1;
            double inc = ((double)(a+1)/(b+1) - (double)a/b);
            pq.add(new Triplet(a,b,inc));
            extraStudents--;
        }
        double res = 0;
        for(Triplet t : pq){
            res += (double)t.a/t.b;
        }
        return (double)res/n;
    }
}
}