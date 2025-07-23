package Graph;

import java.util.LinkedList;
import java.util.Queue;

public class Q6_NoOfIsland {
    class Pair{
        int x;
        int y;
        Pair(int x,int y){
            this.x=x;
            this.y=y;
        }
    }
    void bfs(int x,int y,char grid[][],boolean visited[][]){
        int m=grid.length;
        int n=grid[0].length;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(x,y));
        visited[x][y]=true;
        while(!q.isEmpty()){
            Pair p=q.remove();
            int u = p.x;
            int v = p.y;
            if(v+1<n && grid[u][v+1]=='1' && !visited[u][v+1]){ // right
                q.add(new Pair(u,v+1));
                visited[u][v+1]=true;
            }
            if(v-1>=0 && grid[u][v-1]=='1' && !visited[u][v-1]){ // left
                q.add(new Pair(u,v-1));
                visited[u][v-1]=true;
            }
            if(u-1>=0 && grid[u-1][v]=='1' && !visited[u-1][v]){ // up
                q.add(new Pair(u-1,v));
                visited[u-1][v]=true;
            }
            if(u+1<m && grid[u+1][v]=='1' && !visited[u+1][v]){ //down
                q.add(new Pair(u+1,v));
                visited[u+1][v]=true;
            }
            
        }
        
    }
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        boolean visited[][]=new boolean[m][n];
        int c=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    bfs(i,j,grid,visited);
                    c++;
                }
            }
        }
        return c;
    }
}
