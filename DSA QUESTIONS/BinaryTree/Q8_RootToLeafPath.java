package BinaryTree;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class Q8_RootToLeafPath {
    void helper(Node root,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> res ){
        if(root==null) return;
        list.add(root.data);
        if(root.left==null && root.right==null){
            res.add(new ArrayList<>(list));
        }
        helper(root.left,list,res);
        helper(root.right,list,res);
        
        list.remove(list.size()-1); // Backtrack to explore other paths
    }
    public  ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        helper(root,list,res);
        return res;
        
    }
}
