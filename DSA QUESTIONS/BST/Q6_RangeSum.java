import javax.swing.tree.TreeNode;

public class Q6_RangeSum {
    int sum=0;
    void helper(TreeNode root,int l,int h){
        if(root==null) return;
        if(root.val >= l && root.val <= h) sum+=root.val;
        if(root.val>l) helper(root.left,l,h);
        if(root.val<=h) helper(root.right,l,h);
    }
    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root,low,high);
        return sum;
    }
}