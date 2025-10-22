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
// boolean dfs(int adj[][],int visited[],int u, int color){
//         visited[u] = color;
//         for(int ele: adj[u]){
//             if(visited[ele] == color) return false;
//             if(visited[ele]==-1){
//                 if(!dfs(adj,visited,ele,1-color)) return false;
//             }
//         }
//         return true;

//     }
//     public boolean isBipartite(int[][] adj) {
//         int n=adj.length;
//         int visited[] = new int[n];
//         Arrays.fill(visited,-1);
//         for(int i=0;i<n;i++){
//             if(visited[i]==-1){
//                 if(!dfs(adj,visited,i,0)) return false;
//             }
//         }
//         return true;

//     }
// }


// USING DSU
class Solution {
    int parent[];
    int size[];
    boolean parity[];
    int find(int a){
        if(parent[a]==a) return a;
        return parent[a] = find(parent[a]);
    }
    void union(int a,int b){
        int leaderA = find(a);
        int leaderB = find(b);
        if(leaderA!=leaderB){
            if(size[leaderA] > size[leaderB]){
                parent[leaderB]=leaderA;
                size[leaderA] += size[leaderB];
                parity[b] = !parity[a];
            }
            else{
                parent[leaderA] = leaderB;
                size[leaderB] += size[leaderA];
                parity[a] = !parity[b];
            }
        }
    }
    public boolean isBipartite(int[][] graph) {
        int n=graph.length;
        parent = new int[n];
        size = new int[n];
        parity = new boolean[n];
        for(int i=0;i<n;i++){
            parent[i] = i;
            size[i]=1;
            parity[i] = false;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<graph[i].length;j++){
                int u = i;
                int v = graph[i][j];
                if(v>u){
                    if(find(u) == find(v)){ // cycle detected
                        if(parity[u]==parity[v]) return false;
                    }
                    else union(u,v);
                }
            }
        }
        return true;
    }
}