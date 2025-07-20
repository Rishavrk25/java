package BinaryTree;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class Q12_LeftView {
    // RECURSIVE SOLUTION
    void helper(Node root,ArrayList<Integer> res,int lvl){
        if(root==null) return;
        if(lvl == res.size()) res.add(root.data); 
        helper(root.left,res,lvl+1);
        helper(root.right,res,lvl+1);
    }
    ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> res=new ArrayList<>();
        helper(root,res,0);
        return res;
        
        // BFS -> ITERATIVE
        // ArrayList<Integer> res=new ArrayList<>();
        // if(root==null) return res;
        // Queue<Node> q=new LinkedList<>();
        // q.add(root);
        // while(!q.isEmpty()){
        //     int size=q.size();
        //     for(int i=0;i<size;i++){
        //         Node node=q.remove();
        //         if(node.left!=null) q.add(node.left);
        //         if(node.right!=null) q.add(node.right);
        //         if(i==0) res.add(node.data);
                
        //     }
        // }
        // return res;
    }
}
