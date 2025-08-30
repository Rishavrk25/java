package BinaryTree;

import javax.swing.tree.TreeNode;

public class Q22_MaxPathSum {
    int mxPathSum = Integer.MIN_VALUE;
    // lineSum -> root to children max sum
    int lineSum(TreeNode root){
        if(root==null) return 0;
        int l= lineSum(root.left);
        int r= lineSum(root.right);
        
        int pathSum = root.val;
        if(l>0) pathSum+=l;
        if(r>0) pathSum+=r;
        mxPathSum = Math.max(pathSum,mxPathSum);
        
        return root.val + Math.max(0,Math.max(l,r));
    }
    public int maxPathSum(TreeNode root) {
        lineSum(root);
        return mxPathSum;
    }
}