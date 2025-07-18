class Node {
    int val;
    Node left;
    Node right;
    Node(int val){
        this.val=val;
    }
}
public class BinaryTree {
    static void display(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    static int product(Node root){
        if(root==null) return 1;
        if(root.val!=0) return root.val * product(root.left) * product(root.right);
        else return 1;
    }
    static int level(Node root){
        if(root==null) return 0;
        int left=level(root.left);
        int right=level(root.right);
        return 1+Math.max(left,right);                                                                            
    }
   public static void main(String[] args) {
     Node a=new Node(1);
    Node b=new Node(2);
    Node c=new Node(3);
    Node d=new Node(4);
    Node e=new Node(0);
    Node f=new Node(6);
    a.left=b; 
    a.right=c;
    b.left=d;
    b.right=e;
    c.left=f;
    display(a);
    System.out.println();
    System.out.println(product(a));
    System.out.println(level(a));
   }
    
}
