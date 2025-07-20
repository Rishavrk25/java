package BST;

import org.w3c.dom.Node;

public class Q2_Ceil {
    int findCeil(Node root, int key) {
        // code here
        int ceil=-1;
        while(root!=null){
            if(key<root.data){
                ceil=root.data;
                root=root.left;  
            } 
            else if(key>root.data){
                root=root.right;
            }
            else return root.data;
        }
        return ceil;
    }
}
