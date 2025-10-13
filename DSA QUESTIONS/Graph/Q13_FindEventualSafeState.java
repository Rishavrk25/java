import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q13_FindEventualSafeState {
  // leetcode 802
  // tc : o(V+E) 
  // sc : o(V+E) + o(V) + o(V)
  // approach : topological sort using kahn's algorithm
  void bfs(List<List<Integer>> adj, int in[],List<Integer> ans){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<in.length;i++) if(in[i]==0) q.add(i);
        while(!q.isEmpty()){
            int u = q.remove();
            ans.add(u);
            for(int ele : adj.get(u)){
                in[ele]--;
                if(in[ele]==0) q.add(ele);
            }
        }
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int in[] = new int[V];
        // reverse the graph
        // then apply topological sort using kahn's algorithm
        for(int i=0;i<V;i++){
            for(int j=0;j<graph[i].length;j++){
                adj.get(graph[i][j]).add(i);
                in[i]++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        bfs(adj,in,ans);
        Collections.sort(ans);
        return ans;
    }
}
