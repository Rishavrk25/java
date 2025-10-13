import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import Heap.Q7_findKclosestElements.Pair;

public class Q21_Prims_Algorithm {
  class Pair implements Comparable<Pair>{
    int node;
    int wt;
    Pair(int node,int wt){
        this.node=node;
        this.wt=wt;
    }
    public int compareTo(Pair t){
        return Integer.compare(this.wt,t.wt);
    }
}
class Solution {
    public int spanningTree(int V, int[][] edges) {
        // code here
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            int w=edges[i][2];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }
        int ans = 0;
        boolean visited[] = new boolean[V];
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(0,0));
       
        while(!pq.isEmpty()){
            Pair top = pq.remove();
            int node = top.node;
            int wt = top.wt;
            
            if(visited[node]) continue;
            visited[node] = true;
            ans+=wt;
            
            for(Pair p : adj.get(node)){
                if(!visited[p.node]){
                    pq.add(new Pair(p.node,p.wt));
                }
            }
        }
        return ans;
    }
}

}
