package BinaryTree;
import javax.swing.tree.TreeNode;

public class Q5_DiameterOfBinaryTree {
    
    int mx=0;
    int helper(TreeNode root){
        if(root==null) return 0;
        int l=helper(root.left);
        int r=helper(root.right);
        int d = l+r;
        mx=Math.max(mx,d); 
        return 1 + Math.max(l,r);
    }
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return mx;
    }
}
