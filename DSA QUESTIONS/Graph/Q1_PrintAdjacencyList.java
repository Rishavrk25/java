package Graph;

import java.util.ArrayList;
import java.util.List;

public class Q1_PrintAdjacencyList {
    // TYPE-1 -> RETURN ARRAYLIST
    // public List<List<Integer>> printGraph(int V, int edges[][]) {
    //     List<List<Integer>> res=new ArrayList<>();
    //     for(int i=0;i<V;i++){
    //         res.add(new ArrayList<>());
    //     }
    //     int E = edges.length;
    //     for(int i=0;i<E;i++){
    //         int u=edges[i][0];
    //         int v=edges[i][1];
    //         res.get(u).add(v);
    //         res.get(v).add(u);
    //     }
    //     return res;
    // }


    // TYPE-2 -> RETURN ARRAY
    public static int[][] printAdjacency(int n, int m, int[][] edges) {
        List<List<Integer>> adjList=new ArrayList<>();
        for(int i=0;i<n;i++){
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<m;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }
        int adj[][] = new int[n][];
        for(int i=0;i<n;i++){
            List<Integer> list= adjList.get(i);
            adj[i]=new int[1+list.size()];
            adj[i][0]=i;
            for(int j=0;j<list.size();j++){
                adj[i][j+1]=list.get(j);
            }
        }
        return adj;
    }
    
    
}