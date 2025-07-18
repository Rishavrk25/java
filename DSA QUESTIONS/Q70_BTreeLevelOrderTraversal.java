import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class Q70_BTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        // BFS USING QUEUE
        // TC = O(n)
        // SC = O(n)
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size=q.size();
            ArrayList<Integer> level=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                level.add(node.val);
            }
            ans.add(level);
        }
        return ans;
    }
}
