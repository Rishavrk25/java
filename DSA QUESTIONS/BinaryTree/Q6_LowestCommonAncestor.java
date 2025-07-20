package BinaryTree;

import javax.swing.tree.TreeNode;

public class Q6_LowestCommonAncestor {
    // OPTIMAL -> O(n)
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==p || root==q || root==null) return root;
        TreeNode l=lowestCommonAncestor(root.left,p,q);
        TreeNode r=lowestCommonAncestor(root.right,p,q);
        if(r==null) return l;
        else if(l==null) return r;
        else return root;
    }


    // TC -> O(n^2)
    // boolean exists(TreeNode root,TreeNode node){
    //     if(root==node) return true;
    //     if(root==null) return false;
    //     return exists(root.left,node) || exists(root.right,node);
    // }
    // public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    //     if(p==root || q==root) return root;
    //     boolean pExistsInLST=exists(root.left,p);
    //     boolean qExistsInLST=exists(root.left,q);
    //     if(pExistsInLST && qExistsInLST) return lowestCommonAncestor(root.left,p,q);
    //     if(!pExistsInLST && !qExistsInLST) return lowestCommonAncestor(root.right,p,q);
    //     else return root;
    // }
}
