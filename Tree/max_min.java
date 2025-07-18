package Tree;

public class max_min {
    // static void helper1(Node root,int arr[]){
    //     if(root==null) return;
    //     // arr[0]=Math.max(root.data,arr[0]);
    //     if(root.data>arr[0]) arr[0]=root.data;
    //     helper1(root.left,arr);
    //     helper1(root.right,arr);
    // }
    // static void helper2(Node root,int arr[]){
    //     if(root==null) return;
    //     // arr[0]=Math.min(root.data,arr[0]);
    //     if(root.data<arr[0]) arr[0]=root.data;
    //     helper2(root.left,arr);
    //     helper2(root.right,arr);
    // }
    public static int findMax(Node root) {
        // code here
        // int arr[]=new int[1];
        // helper1(root,arr);
        // return arr[0];
        if(root==null) return Integer.MIN_VALUE;
        int a=root.data;
        int b=findMax(root.left);
        int c=findMax(root.right);
        return Math.max(a,Math.max(b,c));
        
    }

    public static int findMin(Node root) {
        
        // code here
        // int arr[]=new int[1];
        // arr[0]=Integer.MAX_VALUE;
        // helper2(root,arr);
        // return arr[0];
        if(root==null) return Integer.MAX_VALUE;
        int a=root.data;
        int b=findMin(root.left);
        int c=findMin(root.right);
        return Math.min(a,Math.min(b,c));
    }
}
