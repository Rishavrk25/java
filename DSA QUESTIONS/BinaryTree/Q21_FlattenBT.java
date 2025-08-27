package BinaryTree;

import java.util.ArrayList;

import javax.swing.tree.TreeNode;

public class Q21_FlattenBT {
  // M-1
  // void helper(TreeNode root, ArrayList<TreeNode> pre){
  //       if(root==null) return;
  //       pre.add(root);
  //       helper(root.left,pre);
  //       helper(root.right,pre);
  //   }
  //   void flatten(TreeNode root) {
  //       ArrayList<TreeNode> pre=new ArrayList<>();
  //       helper(root,pre);
  //       for(int i=0;i<pre.size()-1;i++){
  //           pre.get(i).left=null;
  //           pre.get(i).right=pre.get(i+1);   
  //       }
  //   }


  // M-2
//   void flatten(TreeNode root) {
//         if(root==null) return;
//         TreeNode lst=root.left;
//         TreeNode rst=root.right;
//         flatten(lst);
//         flatten(rst);
//         root.left=null;
//         root.right=lst;
//         TreeNode t=root;
//         while(t.right!=null) t=t.right;
//         t.right=rst;
//     }
// }


// M-3 -> similar to morris traversal
 void flatten(TreeNode root) {
        TreeNode curr=root;
        while(curr!=null){
            if(curr.left!=null){
                TreeNode r=curr.right;
                curr.right=curr.left;
                TreeNode pred=curr.left;
                while(pred.right!=null) pred=pred.right;
                curr.left=null;
                pred.right=r;
                curr=curr.right;
            }
            else{
                curr=curr.right;
            }
        }
    }
