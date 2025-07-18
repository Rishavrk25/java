public class Q73_heightOfBinaryTree {
    public int maxDepth(TreeNode root) {
        // m-1
        // if(root==null) return 0;
        // return 1 + Math.max(maxDepth(root.left),maxDepth(root.right));

        // m-2
        if(root==null) return 0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int c=0;
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.remove();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }
            c++;
        }
        return c;
    }
}
