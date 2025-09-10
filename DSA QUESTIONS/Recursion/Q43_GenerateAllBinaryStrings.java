package Recursion;
import java.util.ArrayList;
import java.util.List;

public class Q43_GenerateAllBinaryStrings {
    static void helper(int n,String s, List<String> list){
        if(n==0){
            list.add(s);
            return;
        }
        helper(n-1,s+"0",list);
        int l=s.length();
        if(l==0 || s.charAt(l-1)!='1') helper(n-1,s+"1",list);
    }
    public static List<String> generateBinaryStrings(int n) {
        // code here
        List<String> list=new ArrayList<>();
        helper(n,"",list);
        return list;
        
        
        
    }
}