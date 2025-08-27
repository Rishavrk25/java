package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q7_UndirectedGraphCycle {
    // BFS
    // class Pair {
    //     int node;
    //     int parent;

    //     Pair(int node, int parent) {
    //         this.node = node;
    //         this.parent = parent;
    //     }
    // }

    // class Solution {
    //     boolean bfs(int i, List<List<Integer>> adj, boolean visited[]) {
    //         Queue<Pair> q = new LinkedList<>();
    //         q.add(new Pair(i, -1));
    //         visited[i] = true;
    //         while (!q.isEmpty()) {
    //             Pair p = q.remove();
    //             int node = p.node;
    //             int parent = p.parent;
    //             for (int ele : adj.get(node)) {
    //                 if (!visited[ele]) {
    //                     q.add(new Pair(ele, node));
    //                     visited[ele] = true;
    //                 } else if (ele != parent) {
    //                     return true;
    //                 }
    //             }
    //         }
//             return false;
//         }

//         public boolean isCycle(int V, int[][] edges) {
//             // Code here
//             List<List<Integer>> adj = new ArrayList<>();
//             for (int i = 0; i < V; i++) {
//                 adj.add(new ArrayList<>());
//             }
//             for (int i = 0; i < edges.length; i++) {
//                 int u = edges[i][0];
//                 int v = edges[i][1];
//                 adj.get(u).add(v);
//                 adj.get(v).add(u);
//             }
//             boolean visited[] = new boolean[V];
//             for (int i = 0; i < V; i++) {
//                 if (!visited[i] && bfs(i, adj, visited))
//                     return true;
//             }
//             return false;
//         }
//     }


// DFS 
class Solution {
    boolean dfs(int i,int p,List<List<Integer>> adj,boolean visited[]){
        visited[i]=true;
        for(int ele: adj.get(i)){
            if(!visited[ele]){
                if(dfs(ele,i,adj,visited)) return true;
            }
            else if(ele!=p) return true;
        }
        return false;
    }
    public boolean isCycle(int V, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i] && dfs(i,-1,adj,visited)) return true;
        }
        return false;
    }
}
}
