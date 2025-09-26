package Graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q9_ShortestPathInUnweightedGraph {
    public static LinkedList<Integer> shortestPath(int[][] edges, int n, int m, int s, int t) {
		// BFS
		List<List<Integer>> adj=new ArrayList<>();
		for(int i=0;i<n+1;i++){
			adj.add(new ArrayList<>());
		}
		for(int i=0;i<m;i++){
			int u=edges[i][0];
			int v=edges[i][1];
			adj.get(u).add(v);
			adj.get(v).add(u);
		}
        
		boolean visited[]=new boolean[n+1];
		int parent[]=new int[n+1];
		for(int i=0;i<n+1;i++) parent[i]=-1;
		Queue<Integer> q=new LinkedList<>();
		q.add(s);
		visited[s]=true;
		while(!q.isEmpty()){
			int u=q.remove();
			for(int ele : adj.get(u)){
				if(!visited[ele]){
					q.add(ele);
					visited[ele]=true;
					parent[ele]=u;
				}
			}	
		}
		LinkedList<Integer> res=new LinkedList<>();
		res.add(t);
		int ele=parent[t];
		while(ele!=-1){
			res.add(0,ele);
			ele=parent[ele];
		}
		return res;


	}
}