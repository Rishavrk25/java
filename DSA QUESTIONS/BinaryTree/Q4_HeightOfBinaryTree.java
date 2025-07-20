package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Q4_HeightOfBinaryTree {
    public int maxDepth(TreeNode root) {
        // m-1
        // if(root==null) return 0;
        // int l=maxDepth(root.left);
        // int r=maxDepth(root.right);
        // return 1 + Math.max(l,r);


        // m-2 -> levelOrderTraversal (BFS)
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int c=0; 
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            c++;
        }
        return c-1;
    }
}
