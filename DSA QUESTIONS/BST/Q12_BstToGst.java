package BST;

import javax.swing.tree.TreeNode;

public class Q12_BstToGst {
    int sum=0;
    void helper(TreeNode root){
        if(root==null) return;
        helper(root.right);
        sum += root.val;
        root.val=sum;
        helper(root.left);
    }
    public TreeNode bstToGst(TreeNode root) {
        helper(root);
        return root;
    }
}
