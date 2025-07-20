package BinaryTree;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Q3_PreOrderTraversal_Iterative {
    public List<Integer> preorderTraversal(TreeNode root) {
        // DFS USING STACKS
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Stack<TreeNode> st=new Stack<>();
        st.push(root);
        while(!st.isEmpty()){
            TreeNode node=st.pop();
            if(node.right!=null) st.push(node.right);
            if(node.left!=null) st.push(node.left);
            ans.add(node.val);
        }
        return ans;
    }
}
