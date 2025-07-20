package BinaryTree;

import javax.swing.tree.TreeNode;

public class Q7_MinimumDepth {
     int min=Integer.MAX_VALUE;
    void helper(TreeNode root,int depth){
        if(root==null) return;
        if(root.left==null && root.right==null){
            min=Math.min(min,depth);
            return;
        }
        helper(root.left,depth+1);
        helper(root.right,depth+1);
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        helper(root,1);
        return min;
    }
}
