package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q3_NoOfProvinces {
    // The time complexity of your code is O(N²),
    //  where N is the number of cities (nodes).
    // The space complexity is O(N) for the visited array.
    // This is because you are using a queue to perform BFS, which can hold at most
    // N elements in the worst case, and the visited array also has a size of N
    
    void bfs(int i,int adj[][],boolean visited[]){
        int n=adj.length;
        Queue<Integer> q=new LinkedList<>();
        q.add(i);
        visited[i]=true;
        while(!q.isEmpty()){
            int u=q.remove();
            for(int j=0;j<n;j++){
                if(adj[u][j]==1 && !visited[j]){
                    q.add(j);
                    visited[j]=true;
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean visited[]=new boolean[n];
        int c=0;
        for(int i=0;i<n;i++){
            if(!visited[i]){
                c++;
                bfs(i,isConnected,visited);
            }
        }
        return c;


    }
}
