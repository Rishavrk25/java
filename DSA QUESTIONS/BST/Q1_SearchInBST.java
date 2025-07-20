package BST;

import javax.swing.tree.TreeNode;

public class Q1_SearchInBST {

     public TreeNode searchBST(TreeNode root, int val) {
        //RECURSIVE
        // if(root==null) return null;
        // if(root.val==val) return root;
        // if(val<root.val) return searchBST(root.left,val);
        // else return searchBST(root.right,val);

        // ITERATIVE
        while(root!=null){
            if(val<root.val){
                root=root.left;
            }
            else if(val>root.val){
                root=root.right;
            }
            else return root;
        }
        return null;
    }
}