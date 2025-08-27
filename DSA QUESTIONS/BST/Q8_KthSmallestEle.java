package BST;

import javax.swing.tree.TreeNode;

public class Q8_KthSmallestEle {
    // Time: O(k) in the best case (balanced BST, early stopping), O(n) worst-case.
    // Space: O(h) for recursion stack, where h is the tree height.
    // int i=0;
    // int ans=-1;
    // void helper(TreeNode root,int k){
    //     if(root==null) return;
    //     if(ans!=-1) return;
    //     helper(root.left,k);
    //     i++;
    //     if(i==k){
    //         ans=root.val;
    //         return;
    //     }
    //     helper(root.right,k);
    // }
    // public int kthSmallest(TreeNode root, int k) {
    //     helper(root,k);
    //     return ans;
    // }


    // MORRIS TRAVERSAL
    public int kthSmallest(TreeNode root, int k) {
        TreeNode curr=root;
        int i=1;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode pred=curr.left;
                while(pred.right!=null && pred.right!=curr) pred=pred.right;
                // link
                if(pred.right==null){
                    pred.right=curr;
                    curr=curr.left;
                }
                // unlink
                else{
                    // visit
                    if(i==k) return curr.val;
                    i++;
                    curr=curr.right;
                    pred.right=null;
                }
            }
            else{
                    // visit
                    if(i==k) return curr.val;
                    i++;
                    curr=curr.right;
                }
        }
        return -1;
    }
}
