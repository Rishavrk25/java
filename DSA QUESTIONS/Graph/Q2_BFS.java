package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Q2_BFS {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Boolean> visited = new ArrayList<>();
        int V = adj.size();
        for(int i=0;i<V;i++){
            visited.add(false);
        }
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited.set(0,true);
        while(!q.isEmpty()){
            int u=q.remove();
            res.add(u);
            for(int ele: adj.get(u)){
                if(!visited.get(ele)){
                    q.add(ele);
                    visited.set(ele,true);
                }
            }
        }
        return res;
    }
}
