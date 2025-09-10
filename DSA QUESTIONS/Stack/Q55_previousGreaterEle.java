package Stack;
import java.util.ArrayList;
import java.util.Stack;

public class Q55_previousGreaterEle {
    public static void main(String[] args) {
        int arr[]={10,4,2,20,40,40,12,30};
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && st.peek()<=arr[i]) st.pop();
            if(st.isEmpty()) list.add(-1);
            else list.add(st.peek()); 
            st.push(arr[i]);
            }

        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        for(int ele:list){
            System.out.print(ele+" ");
        }
    }
}
