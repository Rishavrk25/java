package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q5_FindIfPathExists {
    // The time complexity of this code is O(V + E),
    // where V is the number of vertices and E is the number of edges in the graph
    // The space complexity is O(V) for the visited array and the adjacency list representation of the graph
    // This is because the adjacency list can hold at most V elements in the worst case,
    // and the visited array also has a size of V.
    void bfs(int s,int d,List<List<Integer>> adj,boolean visited[]){  
        Queue<Integer> q= new LinkedList<>();
        q.add(s);
        visited[s]=true;
        while(!q.isEmpty()){
            int u=q.remove();
            for(int v : adj.get(u)){
                if(!visited[v]){
                    q.add(v);
                    visited[v]=true;
                    if(v == d) return;
                }
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
        bfs(source,destination,adj,visited);
        return visited[destination];
        

    }
}
