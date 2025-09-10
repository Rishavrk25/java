package Array;

import java.util.HashMap;
import java.util.HashSet;

public class Q19_minNoOfPeopleToTeach {
  boolean isCommon(int[][] languages ,int u,int v){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<languages[u].length;i++) set.add(languages[u][i]);
        for(int i=0;i<languages[v].length;i++){
            if(set.contains(languages[v][i])) return true;
        }
        return false;
    }
    public int minimumTeachings(int n, int[][] languages, int[][] friendships) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<friendships.length;i++){
            int u = friendships[i][0];
            int v = friendships[i][1];
            if(!isCommon(languages,u-1,v-1)){
                set.add(u);
                set.add(v);
            }
        }
        int total = set.size();
        HashMap<Integer,Integer> map = new HashMap<>();
        // lang , count of user who knows that lang among problematic users
        for(int i=0;i<languages.length;i++){
            for(int j=0;j<languages[i].length;j++){
                if(!set.contains(i+1)) continue;
                if(!map.containsKey(languages[i][j])) map.put(languages[i][j],1);
                else map.put(languages[i][j],map.get(languages[i][j])+1);
            }
        }
        int mxCount = 0;
        for(int key : map.keySet()){
            int val = map.get(key);
            mxCount = Math.max(mxCount,val);
        }
        return total-mxCount;
    }
  
}