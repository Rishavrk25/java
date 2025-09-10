package Stack;
import java.util.*;
public class Q60_AstroidalCollision {
    public int[] asteroidCollision(int[] arr) {
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            int ele=arr[i];
            while(!st.isEmpty() && (ele<0 && st.peek()>0 && Math.abs(ele)>Math.abs(st.peek()))) st.pop();
            if(!st.isEmpty() && ele<0 && st.peek()>0 && Math.abs(ele)==Math.abs(st.peek())) st.pop();
            else if(!st.isEmpty()  && ele<0 && st.peek()>0 && Math.abs(ele)<Math.abs(st.peek())) continue;
             else st.push(ele);   
        }

        int res[]=new int[st.size()];
        int k=st.size()-1;
        while(!st.isEmpty()){
            res[k--]=st.pop();
        }
        return res;

    }
}
