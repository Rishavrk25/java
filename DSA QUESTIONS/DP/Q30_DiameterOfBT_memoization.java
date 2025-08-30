package DP;

import java.util.HashMap;

import javax.swing.tree.TreeNode;

public class Q30_DiameterOfBT_memoization {
  int mx=0;
    HashMap<TreeNode,Integer> dp = new HashMap<>();
    int helper(TreeNode root){
        if(root==null) return 0;
        if(dp.containsKey(root)) return dp.get(root);
        int l=helper(root.left);
        int r=helper(root.right);
        int d = l+r;
        mx=Math.max(mx,d); 
        dp.put(root,1+Math.max(l,r));
        return dp.get(root);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return mx;
    }
}
