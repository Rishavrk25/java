package BinaryTree;

import javax.swing.tree.TreeNode;

public class Q10_BalancedBTree {
    boolean result = true;
    int helper(TreeNode root){
        if(root==null) return 0;
        int l = helper(root.left);
        int r = helper(root.right);
        if(Math.abs(l-r) >1 ){
            result=false;
            return 0;
        }
        return 1 + Math.max(l,r);
    }
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return result;
    }
}
