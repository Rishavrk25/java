import java.util.ArrayList;

public class Q4_adjMatrixToAdjList {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int j=0;j<n;j++){
                if(isConnected[i][j] != 0) list.add(j);
            }
            adj.add(list);
        }
}
