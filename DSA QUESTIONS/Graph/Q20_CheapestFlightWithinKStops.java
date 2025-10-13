import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Heap.Q6_kClosestPointsToOrigin.Triplet;

public class Q20_CheapestFlightWithinKStops {
  class Triplet{
    int node;
    int cost;
    int stops;
    Triplet(int node,int cost,int stops){
        this.node=node;
        this.cost=cost;
        this.stops=stops;
    }
}
class Solution {
    public int findCheapestPrice(int n, int[][] arr, int src, int dst, int k) {
        List<List<Triplet>> adj=new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<arr.length;i++){
            int u = arr[i][0];
            int v = arr[i][1];
            int cost = arr[i][2];
            adj.get(u).add(new Triplet(v,cost,0));
        }

        int cost[] = new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[src]=0;

        Queue<Triplet> pq = new LinkedList<>();
        pq.add(new Triplet(src,0,0));
        while(!pq.isEmpty()){
            Triplet top = pq.remove();
            if(top.stops == k+1) continue;
            for(Triplet p : adj.get(top.node)){
                int total = top.cost + p.cost;
                if(total < cost[p.node]){
                    cost[p.node]=total;
                    pq.add(new Triplet(p.node,total,top.stops+1));
                }
            }
        }
        if(cost[dst]==Integer.MAX_VALUE) return -1;
        return cost[dst];
    }
}
}
