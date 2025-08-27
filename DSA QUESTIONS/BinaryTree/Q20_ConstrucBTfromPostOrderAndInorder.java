package BinaryTree;

import javax.swing.tree.TreeNode;

public class Q20_ConstrucBTfromPostOrderAndInorder {
  TreeNode helper(int postorder[],int inorder[],int pl,int ph,int il,int ih){
        if(pl>ph || il>ih) return null;
        TreeNode root=new TreeNode(postorder[ph]);
        int r=0;
        while(postorder[ph]!=inorder[r]) r++;
        int ls=r-il;
        root.left=helper(postorder,inorder,pl,pl+ls-1,il,r-1);
        root.right=helper(postorder,inorder,pl+ls,ph-1,r+1,ih);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n=inorder.length;
        return helper(postorder,inorder,0,n-1,0,n-1);
    }
}
