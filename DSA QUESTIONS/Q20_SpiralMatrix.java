import java.util.ArrayList;
import java.util.List;

public class Q20_SpiralMatrix {
    public List<Integer> spiralOrder(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int r=arr.length;
        int c=arr[0].length;
        int total = r*c;
        int count =0;
        int left=0;
        int right=c-1;
        int top=0;
        int bottom = r-1;
        while(count < total){
            for(int i=left;i<=right && count<total;i++){
                list.add(arr[top][i]);
                count++;
            }
            top++;
            for(int i=top;i<=bottom && count<total;i++){
                list.add(arr[i][right]);
                count++;
            }
            right--;
            for(int i=right;i>=left && count<total;i--){
                list.add(arr[bottom][i]);
                count++;
            }
            bottom--;
            for(int i=bottom;i>=top && count<total;i--){
                list.add(arr[i][left]);
                count++;
            }
            left++;
        }
        return list;
    }
}
