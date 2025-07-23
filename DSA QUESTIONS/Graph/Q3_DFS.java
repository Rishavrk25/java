package Graph;

import java.util.ArrayList;

public class Q3_DFS {
    void dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res, ArrayList<Boolean> visited,int u){
        // The time complexity of this DFS implementation is O(V + E),
        // where V is the number of vertices and E is the number of edges in the graph
        // The space complexity is O(V) for the visited array and the recursion stack
        // This is because the recursion stack can hold at most V elements in the worst case,
        // and the visited array also has a size of V.
        if(visited.get(u)==true) return;
        visited.set(u,true);
        res.add(u);
        for(int ele : adj.get(u)){
            if(!visited.get(ele)) dfs(adj,res,visited,ele);
        }
    }
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
         ArrayList<Integer> res=new ArrayList<>();
         ArrayList<Boolean> visited= new ArrayList<>();
         int V = adj.size();
         for(int i=0;i<V;i++){
             visited.add(false);
         }
         dfs(adj,res,visited,0);
         return res;
        
    }
}
