import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import javax.swing.tree.TreeNode;

public class Q15_InOrderTraversal_Iterative {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        TreeNode temp=root;
        Stack<TreeNode> st=new Stack<>();
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.isEmpty()) break;
                TreeNode node=st.pop();
                res.add(node.val);
                temp=node.right;
            }
        }
        return res;
    
    }
}