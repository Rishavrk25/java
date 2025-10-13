import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Q16_NetworkDelayTime {
  class Pair implements Comparable<Pair>{
    int node;
    int time;
    Pair(int node,int time){
        this.node=node;
        this.time=time;
    }
    public int compareTo(Pair p){
        return this.time - p.time;
    }
}
class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<times.length;i++){
            int u = times[i][0];
            int v = times[i][1];
            int w = times[i][2];
            adj.get(u).add(new Pair(v,w));
        }

        // dijkstra's algorithm
        int time[] = new int[n+1];
        Arrays.fill(time,Integer.MAX_VALUE);
        time[k]=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>();
        pq.add(new Pair(k,0));
        while(!pq.isEmpty()){
            Pair top = pq.remove();
            if(top.time > time[top.node]) continue;
            for(Pair p : adj.get(top.node)){
                int total = top.time + p.time;
                if(total < time[p.node]){
                    time[p.node] = total;
                    pq.add(new Pair(p.node,total));
                }
            }
        }

        int max = 0;
        for(int i=1;i<=n;i++) max = Math.max(max,time[i]);
        if(max==Integer.MAX_VALUE) return -1;
        return max;
    }
}
}
