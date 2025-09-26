import java.util.Arrays;

public class Q10_BipartiteGraph {

// BFS
//   boolean ans = true;
//     void bfs(int adj[][],int visited[],int i){
//         int n=adj.length;
//         Queue<Integer> q = new LinkedList<>();
//         q.add(i);
//         visited[i] = 0;
//         while(!q.isEmpty()){
//             int u = q.remove();
//             int color = visited[u];
//             for(int ele : adj[u]){
//                 if(visited[ele] == visited[u]){
//                     ans = false;
//                     return;
//                 }
//                 if(visited[ele] == -1 ){
//                     q.add(ele);
//                     visited[ele] = 1 - color;
//                 }
//             }
//         }
//     }
//     public boolean isBipartite(int[][] adj) {
//         int n=adj.length;
//         int visited[] = new int[n];
//         Arrays.fill(visited,-1);
//         for(int i=0;i<n;i++){
//             if(visited[i]==-1) bfs(adj,visited,i);
//         }
//         return ans;
//     }


// DFS
boolean dfs(int adj[][],int visited[],int u, int color){
        visited[u] = color;
        for(int ele: adj[u]){
            if(visited[ele] == color) return false;
            if(visited[ele]==-1){
                if(!dfs(adj,visited,ele,1-color)) return false;
            }
        }
        return true;

    }
    public boolean isBipartite(int[][] adj) {
        int n=adj.length;
        int visited[] = new int[n];
        Arrays.fill(visited,-1);
        for(int i=0;i<n;i++){
            if(visited[i]==-1){
                if(!dfs(adj,visited,i,0)) return false;
            }
        }
        return true;

    }
}
