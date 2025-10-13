import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Q17_PathWithMaximumProbability {
  class Pair implements Comparable<Pair>{
    int node;
    double prob;
    Pair(int node,double prob){
        this.node = node;
        this.prob = prob;
    }
    public int compareTo(Pair p){
        return Double.compare(this.prob,p.prob);
    }
}
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++) adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            int u = edges[i][0];
            int v = edges[i][1];
            double w = succProb[i];
            adj.get(u).add(new Pair(v,w));
            adj.get(v).add(new Pair(u,w));
        }

        double prob[] = new double[n];
        Arrays.fill(prob,0);
        prob[start_node] = 1;
        PriorityQueue<Pair> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(new Pair(start_node,1));
        while(!pq.isEmpty()){
            Pair top = pq.remove();
            if(top.prob < prob[top.node]) continue;
            for(Pair p: adj.get(top.node)){
                double total = (double)top.prob * (double)p.prob;
                if(total > prob[p.node]){
                    prob[p.node] = total;
                    pq.add(new Pair(p.node,total));
                }
            }
        }
        return prob[end_node];
    }
}
}
