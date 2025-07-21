package BST;

public class Q9_ValidateBST {
    // M-1
    int max(TreeNode root){
        if(root==null) return Integer.MIN_VALUE;
        return Math.max(root.val,Math.max(max(root.left),max(root.right)));
    }
    int min(TreeNode root){
        if(root==null) return Integer.MAX_VALUE;
        return Math.min(root.val,Math.min(min(root.left),min(root.right)));
    }
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;
        if(root.left!=null && root.val <= max(root.left)) return false;
        if(root.right!=null && root.val >= min(root.right)) return false;
        return isValidBST(root.left) && isValidBST(root.right);
    }

    // M-2
    // void inorder(TreeNode root,ArrayList<Integer> list){
    //     if(root==null) return;
    //     inorder(root.left,list);
    //     list.add(root.val);
    //     inorder(root.right,list);
    // }
    // public boolean isValidBST(TreeNode root) {
    //     ArrayList<Integer> list=new ArrayList<>();
    //     inorder(root,list);
    //     int n=list.size();
    //     for(int i=1;i<n;i++){
    //         if(list.get(i-1)>=list.get(i)) return false;
    //     }
    //     return true;
    // }

}
