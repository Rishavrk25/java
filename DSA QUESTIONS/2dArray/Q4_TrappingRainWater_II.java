import java.util.PriorityQueue;
public class Q4_TrappingRainWater_II {
  class Triplet implements Comparable<Triplet>{
    int height;
    int x;
    int y;
    Triplet(int height,int x,int y){
        this.height = height;
        this.x = x;
        this.y = y;
    }
    public int compareTo(Triplet t){
        return Integer.compare(this.height,t.height);
    }
}
class Solution {
    public int trapRainWater(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean visited[][] = new boolean[m][n];

        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        for(int i=0;i<m;i++){
            pq.add(new Triplet(arr[i][0],i,0));
            visited[i][0]=true;
            pq.add(new Triplet(arr[i][n-1],i,n-1));
            visited[i][n-1]=true;
        }
        for(int j=0;j<n;j++){
            pq.add(new Triplet(arr[0][j],0,j));
            visited[0][j]=true;
            pq.add(new Triplet(arr[m-1][j],m-1,j));
            visited[m-1][j] = true;
        }
        int ans = 0;
        int directions[][] = {{0,1},{1,0},{0,-1},{-1,0}};
        while(!pq.isEmpty()){
            Triplet t = pq.remove();
            int height = t.height;
            int i = t.x;
            int j = t.y;
            for(int dir[] : directions){
                int i_ = i + dir[0];
                int j_ = j + dir[1];
                if(i_ >= 0 && i_ < m && j_ >=0 && j_ < n && !visited[i_][j_]){
                    ans += Math.max(height - arr[i_][j_] , 0);
                    pq.add(new Triplet(Math.max(height,arr[i_][j_]), i_, j_));
                    visited[i_][j_] = true;
                }
            }
        }
        return ans;
    }
}
}
