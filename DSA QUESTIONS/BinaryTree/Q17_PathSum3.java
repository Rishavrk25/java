import javax.swing.tree.TreeNode;

public class Q17_PathSum3 {
    int c=0;
    void helper(TreeNode root,long t){
        if(root==null) return;
        t-=root.val;
        if(t==0) c++;
        helper(root.left,t);
        helper(root.right,t);
    }
    public int pathSum(TreeNode root, int targetSum) {
        if(root==null) return c;
        helper(root,targetSum);
        pathSum(root.left,targetSum);
        pathSum(root.right,targetSum);
        return c;
    }
}

