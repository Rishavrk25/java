package Recursion;
import java.util.ArrayList;
import java.util.List;

public class Q4_GenerateParenthesis {
    // OPTIMAL
    void helper(int n,String s,List<String> ans,int open,int close){
        if(s.length()==n*2){
            ans.add(s);
            return;
        }
        if(open<n) helper(n,s+'(',ans,open+1,close);
        if(close<open) helper(n,s+')',ans,open,close+1);
    }
     public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        helper(n,"",ans,0,0);
        return ans;
    }


    // boolean isValid(String s){
    //     int c=0;
    //     for(int i=0;i<s.length();i++){
    //      char ch=s.charAt(i);
    //      if(ch=='(') c++;
    //      else c--;
    //      if(c<0) return false;
    //     }
    //      return c==0;   

    // }
    // void helper(int n,String s,List<String> ans){
    //     if(s.length()==n*2){
    //         if(isValid(s)) ans.add(s);
    //         return;
    //     }
    //     helper(n,s+'(',ans);
    //     helper(n,s+')',ans);
    // }
    // public List<String> generateParenthesis(int n) {
    //     List<String> ans=new ArrayList<>();
    //     helper(n,"",ans);
    //     return ans;
    // }
}
