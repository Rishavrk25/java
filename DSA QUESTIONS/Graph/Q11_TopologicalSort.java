import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q11_TopologicalSort {
  // DFS
  // static void dfs(ArrayList<ArrayList<Integer>> adj,boolean visited[],int i,ArrayList<Integer> ans){
  //       if(visited[i]) return;
  //       visited[i] = true;
  //       for(int ele : adj.get(i)){
  //           if(!visited[ele]) dfs(adj,visited,ele,ans);
  //       }
  //       ans.add(0,i); // add at head for reverse order
  //   }
  //   public static ArrayList<Integer> topoSort(int V, int[][] edges) {
  //       ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
  //       for(int i=0;i<V;i++){
  //           adj.add(new ArrayList<>());
  //       }
  //       for(int i=0;i<edges.length;i++){
  //           int u= edges[i][0];
  //           int v= edges[i][1];
  //           adj.get(u).add(v); // for directed graph
  //       }
  //       ArrayList<Integer> ans = new ArrayList<>();
  //       boolean visited[] = new boolean[V];
  //       for(int i=0;i<V;i++){
  //           dfs(adj,visited,i,ans);
  //       }
  //       return ans;
  
  
  // BFS
  // Kahn's Algorithm
  static void bfs(ArrayList<ArrayList<Integer>> adj,int V,int indegree[],ArrayList<Integer> ans){
        Queue<Integer> q = new LinkedList<>();
        // push nodes with indegree 0
        for(int i=0;i<V;i++){
            if(indegree[i]==0) q.add(i);
        }
        while(!q.isEmpty()){
            int u = q.remove();
            ans.add(u);
             // reduce indegree of neighbors
            for(int ele : adj.get(u)){
                indegree[ele]--;
                if(indegree[ele]==0) q.add(ele);
            }
        }
    }
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[] = new int[V];
        for(int i=0;i<edges.length;i++){
            int u= edges[i][0];
            int v= edges[i][1];
            adj.get(u).add(v); // for directed graph
            indegree[v]++;
        }
        ArrayList<Integer> ans = new ArrayList<>();
        bfs(adj,V,indegree,ans);
        return ans;   
    }
  }

  
  