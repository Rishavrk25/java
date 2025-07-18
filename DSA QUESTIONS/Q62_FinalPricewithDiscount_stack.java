import java.util.Stack;

public class Q62_FinalPricewithDiscount_stack {
    public int[] finalPrices(int[] arr) {
        // ONE PASS
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            int d=0;
            while(!st.isEmpty() && st.peek()>arr[i]) st.pop();
            if(!st.isEmpty()) d=st.peek();
            st.push(arr[i]);
            arr[i]-=d;
        }
        return arr;

        // TWO PASS
        // Stack<Integer> st=new Stack<>();
        // int n=arr.length;
        // int discount[]=new int[n]; // Next smaller
        // for(int i=n-1;i>=0;i--){
        //     while(!st.isEmpty() && st.peek()>arr[i]) st.pop();
        //     if(st.isEmpty()) discount[i]=0;
        //     else discount[i]=st.peek();
        //     st.push(arr[i]);
        // }
        // for(int i=0;i<n;i++){
        //     arr[i]-=discount[i];
        // }
        // return arr;
    }
}
