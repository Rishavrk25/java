package BinaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Q14_PostOrder_Iterative {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        if(root==null) return res;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            if(node.left!=null) st.push(node.left);
            if(node.right!=null) st.push(node.right);
            res.add(0,node.val);
        }
        return res;
    }
}
