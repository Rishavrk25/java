package BinaryTree;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class Q9_LevelOrderRecursive {
    int level(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(level(root.left), level(root.right));
    }

    void nthLevel(TreeNode root, int level, int n, ArrayList<Integer> list) {
        if (root == null)
            return;
        if (level == n)
            list.add(root.val);
        nthLevel(root.left, level + 1, n, list);
        nthLevel(root.right, level + 1, n, list);
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        int lvl = level(root);
        for (int i = 0; i < lvl; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            nthLevel(root, 0, i, list);
            ans.add(list);
        }
        return ans;
    }
}
