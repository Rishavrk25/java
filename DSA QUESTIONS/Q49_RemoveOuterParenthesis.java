import java.util.Stack;

public class Q49_RemoveOuterParenthesis {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(st.isEmpty()) st.push(ch);
            else{
                if(ch==')'){
                    char c=st.pop();
                    if(!st.isEmpty()) res+=ch;
                }
                else{
                    st.push(ch);
                    res+=ch;
                }
            }
        }
        return res;
    }
}
