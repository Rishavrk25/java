public class Q26_RedundantConnection {
class Solution {
    int parent[];
    int size[];
    int find(int a){
        if(parent[a]==a) return a;
        return parent[a] = find(parent[a]);
    }
    void union(int a,int b){
        int leaderA = find(a);
        int leaderB = find(b);
        if(leaderA!=leaderB){
            if(size[leaderA] > size[leaderB]){
                parent[leaderB] = leaderA;
                size[leaderA] += size[leaderB];
            }
            else{
                parent[leaderA]=leaderB;
                size[leaderB] += size[leaderA];
            }
        }
    }
    public int[] findRedundantConnection(int[][] edges) {
        int n=edges.length;
        parent = new int[n+1];
        size = new int[n+1];
        for(int i=1;i<=n;i++){
            parent[i]=i;
            size[i]=1;
        }
        for(int i=0;i<n;i++){
            int a=edges[i][0];
            int b=edges[i][1];
            if(find(a)==find(b)) return new int[]{a,b};
            union(a,b);
        }
        return new int[2];
    }
}
}