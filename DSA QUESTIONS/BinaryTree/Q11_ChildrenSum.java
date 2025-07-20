package BinaryTree;

import org.w3c.dom.Node;

public class Q11_ChildrenSum {
    int ans=1;
    public  int isSumProperty(Node root) {
        if(root==null) return 1; 
        if(root.left==null && root.right==null) return 1;
        int l = (root.left!=null) ? root.left.data : 0;
        int r = (root.right!=null) ? root.right.data : 0;
        if(l + r != root.data){
            ans=0;
            return 0;
        }
        isSumProperty(root.left);
        isSumProperty(root.right);
        return ans;
}
}
