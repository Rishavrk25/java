package BST;

import javax.swing.tree.TreeNode;

public class Q10_SortedArrayToBST {
    TreeNode helper(int arr[],int l,int h){
        if(l>h) return null;
        int m=(l+h)/2;
        TreeNode root=new TreeNode(arr[m]);
        root.left=helper(arr,l,m-1);
        root.right=helper(arr,m+1,h);
        return root;
    }
    public TreeNode sortedArrayToBST(int[] arr) {
        int n=arr.length;
        TreeNode root = helper(arr,0,n-1);
        return root;
    }
}
