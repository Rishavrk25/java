package Tree;

import javax.swing.tree.TreeNode;

public class SameTree {
     public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        boolean a = isSameTree(p.left,q.left);
        boolean b = isSameTree(p.right,q.right);
        return a && b;
       
    }
}
