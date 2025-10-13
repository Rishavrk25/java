package Graph;

import java.util.Arrays;
import java.util.PriorityQueue;

public class Q18_PathWithMinEffort {
class Triplet implements Comparable<Triplet>{
    int x;
    int y;
    int effort;
    Triplet(int x,int y,int effort){
        this.x=x;
        this.y=y;
        this.effort=effort;
    }
    public int compareTo(Triplet t){
        return Integer.compare(this.effort,t.effort);
    }
}
class Solution {
    public int minimumEffortPath(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;

        int ans[][] = new int[r][c];
        for(int row[]:ans) Arrays.fill(row,Integer.MAX_VALUE);
        ans[0][0]=0;

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        pq.add(new Triplet(0,0,0));

        int row[]={-1,0,1,0};
        int col[]={0,1,0,-1};

        while(!pq.isEmpty()){
            Triplet t = pq.remove();
            if(t.x == r-1 && t.y == c-1) return ans[r-1][c-1];
            for(int i=0;i<=3;i++){
                int nx = t.x + row[i];
                int ny = t.y + col[i];
                if(nx < 0 || nx >= r || ny < 0 || ny >= c) continue;
                int total = Math.max(t.effort,Math.abs(arr[t.x][t.y]-arr[nx][ny]));
                if(total < ans[nx][ny]){
                    ans[nx][ny]=total;
                    pq.add(new Triplet(nx,ny,total));
                }
            }
        }
        return ans[r-1][c-1];
    }
}
}
