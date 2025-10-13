import java.util.Arrays;
import java.util.PriorityQueue;

import Heap.Q6_kClosestPointsToOrigin.Triplet;

public class Q19_SwimInRisingWater {
  class Triplet implements Comparable<Triplet>{
    int i;
    int j;
    int time;
    Triplet(int i,int j,int time){
        this.i=i;
        this.j=j;
        this.time=time;
    }
    public int compareTo(Triplet t){
        return Integer.compare(this.time,t.time);
    }
}
class Solution {
    public int swimInWater(int[][] grid) {
        int n=grid.length;
        int ans[][] = new int[n][n];
        for(int row[]:ans) Arrays.fill(row,Integer.MAX_VALUE);
        ans[0][0] = grid[0][0];

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,0,grid[0][0]));

        int directions[][] = {{0,1},{1,0},{-1,0},{0,-1}};

        while(!pq.isEmpty()){
            Triplet t = pq.remove();
            if(t.i == n-1 && t.j == n-1) return ans[n-1][n-1];
            for(int dir[] : directions){
                int i_ = t.i + dir[0];
                int j_ = t.j + dir[1];
                if(i_ < 0 || j_ < 0 || i_ >= n || j_ >= n) continue;
                int total = Math.max(t.time, grid[i_][j_]);
                if(total < ans[i_][j_]){
                    ans[i_][j_] = total;
                    pq.add(new Triplet(i_,j_,total));
                }
            }
        }
        return ans[n-1][n-1];
    }
}
}
