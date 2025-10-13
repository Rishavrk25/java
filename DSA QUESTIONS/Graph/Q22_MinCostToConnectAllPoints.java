import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import Heap.Q7_findKclosestElements.Pair;

public class Q22_MinCostToConnectAllPoints {
class Pair implements Comparable<Pair>{
    int node;
    int cost;
    Pair(int node,int cost){
        this.node=node;
        this.cost=cost;
    }
    public int compareTo(Pair t){
        return Integer.compare(this.cost,t.cost);
    }
}
class Solution {
    public int minCostConnectPoints(int[][] arr) {
        int n=arr.length;
        // Building adjacency list
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int x1 = arr[i][0], y1 = arr[i][1];
                int x2 = arr[j][0], y2 = arr[j][1];
                int dist = Math.abs(x1-x2) + Math.abs(y1-y2);
                adj.get(i).add(new Pair(j,dist));
                adj.get(j).add(new Pair(i,dist));
            }
        }
        // Prims Algorithm
        boolean visited[] = new boolean[n];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
        int ans = 0;

        while(!pq.isEmpty()){
            Pair top = pq.remove();
            int node = top.node;
            int cost  = top.cost;
            if(visited[node]) continue;
            visited[node]=true;
            ans += cost;
            for(Pair p : adj.get(node)){
                if(!visited[p.node]){
                    pq.add(new Pair(p.node,p.cost));
                }
            }
        }
        return ans;
    }
}
}