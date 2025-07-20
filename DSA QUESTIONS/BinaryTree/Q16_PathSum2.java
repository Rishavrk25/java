import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Q16_PathSum2 {
    void helper(TreeNode root,int t,List<Integer> list,List<List<Integer>> res){
        if(root==null) return;
        list.add(root.val);
        t-=root.val;
        if(root.left==null && root.right==null && t==0){
            res.add(new ArrayList<>(list));
        }
        helper(root.left,t,list,res);
        helper(root.right,t,list,res);
        list.remove(list.size()-1); // BackTracking
    }
    
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(root,targetSum,list,res);
        return res;
    }
}
