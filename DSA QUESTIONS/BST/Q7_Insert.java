import javax.swing.tree.TreeNode;

public class Q7_Insert {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        if(val<root.val) root.left=insertIntoBST(root.left,val);
        else root.right = insertIntoBST(root.right,val);
        return root;
    }


    // void helper(TreeNode root,int val){
    //     TreeNode node = new TreeNode(val);
    //     if(val<root.val){
    //         if(root.left==null) root.left=node;
    //         else helper(root.left,val);
    //     }
    //     else{
    //         if(root.right==null) root.right=node;
    //         else helper(root.right,val);
    //     }
    // }
    // public TreeNode insertIntoBST(TreeNode root, int val) {
    //     if(root==null) return new TreeNode(val);
    //     helper(root,val);
    //     return root;

    // }


}