package Graph;

import java.util.ArrayList;
import java.util.List;

public class Q1_PrintAdjacencyList {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> res=new ArrayList<>();
        for(int i=0;i<V;i++){
            res.add(new ArrayList<>());
        }
        int E = edges.length;
        for(int i=0;i<E;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            
            res.get(u).add(v);
            res.get(v).add(u);
            
        }
        return res;
    }
    
    
}