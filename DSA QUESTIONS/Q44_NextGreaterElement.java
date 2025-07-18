import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class Q44_NextGreaterElement {
    public static void main(String[] args) {
         Stack<Integer> st=new Stack<>();
        int n=arr.length;
        ArrayList<Integer> ans=new ArrayList<>();
        st.push(arr[n-1]);
        ans.add(-1);
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && arr[i]>=st.peek()) st.pop();
            if(st.isEmpty()){
                ans.add(-1);
            }
            else{
                ans.add(st.peek());
            }
            st.push(arr[i]);
            
        }
        Collections.reverse(ans);
        return ans;
    }
}
