package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q3_NoOfProvinces {
    // BFS -> TC = O(n^2)
    // void bfs(int i,int adj[][],boolean visited[]){
    //     int n=adj.length;
    //     Queue<Integer> q=new LinkedList<>();
    //     q.add(i);
    //     visited[i]=true;
    //     while(!q.isEmpty()){
    //         int u=q.remove();
    //         for(int j=0;j<n;j++){
    //             if(adj[u][j]==1 && !visited[j]){
    //                 q.add(j);
    //                 visited[j]=true;
    //             }
    //         }
    //     }
    // }
    // public int findCircleNum(int[][] isConnected) {
    //     int n=isConnected.length;
    //     boolean visited[]=new boolean[n];
    //     int c=0;
    //     for(int i=0;i<n;i++){
    //         if(!visited[i]){
    //             c++;
    //             bfs(i,isConnected,visited);
    //         }
    //     }
    //     return c;
    // }


    // DFS -> TC = O(n^2)
    void dfs(int i,int adj[][],boolean visited[]){
        int n=adj.length;
        visited[i]=true;
        for(int j=0;j<n;j++){
            if(adj[i][j]==1 && !visited[j]){
                dfs(j,adj,visited);
            }
        }
    }
    public int findCircleNum(int[][] adj) {
        int n=adj.length;
        boolean visited[]=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                dfs(i,adj,visited);
                c++;
            }
        }
        return c;
    }
}
