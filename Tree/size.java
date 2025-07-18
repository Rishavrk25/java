package Tree;

public class size {
     public static int getSize(Node node) {
        // code here
        if(node==null) return 0;
        return 1+getSize(node.left) + getSize(node.right);
    }
}
