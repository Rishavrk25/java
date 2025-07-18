import java.util.ArrayList;
import java.util.List;

public class Q47_Subsets {
    void helper(int nums[],List<Integer> list,List<List<Integer>> ans,int i){
        if(i>=nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }
        // include
        list.add(nums[i]);
        helper(nums,list,ans,i+1);
        list.remove(list.size()-1); // backtrack (because list is pass by reference)
        // exclude 
        helper(nums,list,ans,i+1);
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(nums,list,ans,0);
        return ans;
    }
}
