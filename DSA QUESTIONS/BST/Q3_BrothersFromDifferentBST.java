package BST;

import java.util.ArrayList;

import org.w3c.dom.Node;

public class Q3_BrothersFromDifferentBST {
//    Given two BSTs containing N1 and N2 distinct nodes respectively and given a value x,
//    your task is to complete the function countPairs(), that returns the count of all pairs
//    of (a, b), where a belongs to one BST and b belongs to another BST, such that a + b = x.
     static void inorder(Node root, ArrayList<Integer> arr){
        if(root==null) return;
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
    }
    public static int countPairs(Node root1, Node root2, int x) {
        // Code here
        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();
        inorder(root1,arr1);
        inorder(root2,arr2);
        int c=0;
        int i=0;
        int j=arr2.size()-1;
        while(i<arr1.size() && j>=0){
            int a=arr1.get(i);
            int b=arr2.get(j);
            int sum=a+b;
            if(sum<x) i++;
            else if(sum>x) j--;
            else{
                c++;
                i++;
                j--;
            }
        }
        return c;
        
        
    }
}
