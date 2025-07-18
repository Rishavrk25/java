import java.util.*;
public class reverse {
   static void displayReverseStack(Stack<Integer> st){
        if(st.isEmpty()) return;
        int t=st.pop();
        System.out.println(t);
        displayReverseStack(st);
        st.push(t);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);

        // Stack<Integer> temp=new Stack<>();
        // while(st.size()!=0) temp.push(st.pop());
        // System.out.println(temp);

        displayReverseStack(st);
        System.out.println(st);
        



    }
}
