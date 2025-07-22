package Graph;

import java.util.ArrayList;

public class Q3_DFS {
    void dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> res, ArrayList<Boolean> visited,int u){
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
