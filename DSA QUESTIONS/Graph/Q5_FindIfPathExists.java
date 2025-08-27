package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q5_FindIfPathExists {
    // BFS
    // TC = O(V + E)
    // void bfs(int s,int d,List<List<Integer>> adj,boolean visited[]){  
    //     Queue<Integer> q= new LinkedList<>();
    //     q.add(s);
    //     visited[s]=true;
    //     while(!q.isEmpty()){
    //         int u=q.remove();
    //         for(int v : adj.get(u)){
    //             if(!visited[v]){
    //                 q.add(v);
    //                 visited[v]=true;
    //                 if(v == d) return;
    //             }
    //         }
    //     }   
    // }
    // public boolean validPath(int n, int[][] edges, int source, int destination) {
    //     List<List<Integer>> adj=new ArrayList<>();
    //     for(int i=0;i<n;i++){
    //         adj.add(new ArrayList<>());
    //     }
    //     for(int i=0;i<edges.length;i++){
    //         int u=edges[i][0];
    //         int v=edges[i][1];
    //         adj.get(u).add(v);
    //         adj.get(v).add(u);
    //     }
    //     boolean visited[]=new boolean[n];
    //     bfs(source,destination,adj,visited);
    //     return visited[destination];
    // }


    // DFS 
    // TC = O(V + E)
    void dfs(List<List<Integer>> adj,boolean visited[],int s,int d){
        visited[s]=true;
        for(int ele : adj.get(s)){
            if(!visited[ele]){
                dfs(adj,visited,ele,d);
            }
        }
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean visited[]=new boolean[n];
        dfs(adj,visited,source,destination);
        return visited[destination];
    }
}
