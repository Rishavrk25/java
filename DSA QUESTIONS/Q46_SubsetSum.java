import java.util.ArrayList;

public class Q46_SubsetSum {
     void helper(int arr[],int i,int sum,ArrayList<Integer> ans){
        if(i==arr.length){
            ans.add(sum);
            return;
        }
        // include
        helper(arr,i+1,sum+arr[i],ans);
        // exclude
        helper(arr,i+1,sum,ans);
    }
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        helper(arr,0,0,ans);
        return ans;
        
    }
}
