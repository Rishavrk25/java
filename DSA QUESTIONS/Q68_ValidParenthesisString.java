import java.util.Stack;

public class Q68_ValidParenthesisString {
    public boolean checkValidString(String s) {
        int n=s.length();
        Stack<Character> st=new Stack<>();
        int open=0;
        int close=0;
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='*') open++;
            else open--;
            if(open<0) return false;
        }
        for(int i=n-1;i>=0;i--){
           char ch=s.charAt(i);
           if(ch==')' || ch=='*') close++;
           else close--;
           if(close<0) return false;
           
        }
        return true;
    }
}
