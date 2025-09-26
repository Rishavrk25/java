import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q12_CourseSchedule {
  // BFS
  // Cycle detection using Kahn's Algorithm for directed graph
  void bfs(List<List<Integer>> adj,int in[],int n,List<Integer> ans){
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++){
            if(in[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int u=q.remove();
            ans.add(u);
            for(int ele:adj.get(u)){
                in[ele]--;
                if(in[ele]==0) q.add(ele);
            }
        }
    }
    public boolean canFinish(int n, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int in[] = new int[n];
        for(int i=0;i<prerequisites.length;i++){
            int u = prerequisites[i][0];
            int v = prerequisites[i][1];
            adj.get(v).add(u);
            in[u]++;
        }
        List<Integer> ans = new ArrayList<>();
        bfs(adj,in,n,ans);
        if(ans.size()!=n) return false;
        else return true;
    }
}
