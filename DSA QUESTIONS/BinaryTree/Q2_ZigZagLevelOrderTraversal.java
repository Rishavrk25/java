package BinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Q2_ZigZagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        boolean flag=true;
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> list=new ArrayList<>();
                for(int i=0;i<size;i++){
                    TreeNode node=q.remove();
                    if(node.left!=null) q.add(node.left);
                    if(node.right!=null) q.add(node.right);
                    if(flag) list.add(node.val); // left to right
                    else list.add(0,node.val); // right to left
                }
                ans.add(list);
                flag=!flag;
            
        }
        return ans;
    }
}
