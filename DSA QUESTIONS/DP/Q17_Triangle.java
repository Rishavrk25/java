package DP;

import java.util.List;

public class Q17_Triangle {
  public int minimumTotal(List<List<Integer>> arr) {
        for(int i=arr.size()-2;i>=0;i--){
            for(int j=0;j<arr.get(i).size();j++){
                int down = arr.get(i+1).get(j);
                int diag = arr.get(i+1).get(j+1);
                arr.get(i).set(j, arr.get(i).get(j) + Math.min(down,diag));
            }
        }
        return arr.get(0).get(0);
    }
}
