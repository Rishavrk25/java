package Tree;

public class sum {
    // static void helper(Node root,int sum[]){
    //     if(root==null) return;
    //     sum[0]+=root.data;
    //      helper(root.left,sum);
    //      helper(root.right,sum);
    // }
    // static int sumBT(Node root) {
    //     int sum[]=new int[1];
    //     helper(root,sum);
    //     return sum[0];
    // }
    
    static int sumBT(Node root) {
        if(root==null) return 0;
        return root.data + sumBT(root.left) + sumBT(root.right);
    }
}
