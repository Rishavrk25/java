package DP;

import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class Q31_BalancedBT_memoization {
  boolean result = true;
    HashMap<TreeNode,Integer> dp = new HashMap<>();
    int helper(TreeNode root){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int l = helper(root.left);
        int r = helper(root.right);
        if(Math.abs(l-r)>1) result = false;
        dp.put(root,1+Math.max(l,r));
        return dp.get(root);
    }
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return result;
    }
}
