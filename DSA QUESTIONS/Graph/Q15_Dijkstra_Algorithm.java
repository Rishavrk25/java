import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Q15_Dijkstra_Algorithm {
  class Pair implements Comparable<Pair>{
    int node;
    int dist;
    Pair(int node,int dist){
        this.node=node;
        this.dist=dist;
    }
    public int compareTo(Pair p){
        return this.dist - p.dist;
    }
    
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        
        int dist[] = new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[src]=0;
        
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(src,0));
        while(!pq.isEmpty()){
            Pair top = pq.remove();
            if(top.dist > dist[top.node]) continue;
            for(Pair p : adj.get(top.node)){
                int total = top.dist + p.dist;
                if(total < dist[p.node]){
                    dist[p.node] = total;
                    pq.add(new Pair(p.node,total));
                }
            }
        }
        return dist;
        
    }
}
}
