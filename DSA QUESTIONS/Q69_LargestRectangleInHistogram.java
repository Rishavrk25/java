import java.util.Stack;

public class Q69_LargestRectangleInHistogram {
    public int largestRectangleArea(int[] arr) {
        // TWO PASS
        // int n=arr.length;
        // int pse[]=new int[n]; // index of pse
        // Stack<Integer> st=new Stack<>();
        // for(int i=0;i<n;i++){
        //     while(!st.isEmpty() && arr[st.peek()]>=arr[i]) st.pop();
        //     if(st.isEmpty()) pse[i]=-1;
        //     else pse[i]=st.peek();
        //     st.push(i);
        // }
        // int nse[]=new int[n]; // index of nse
        // Stack<Integer> st1=new Stack<>();
        // for(int i=n-1;i>=0;i--){
        //     while(!st1.isEmpty() && arr[st1.peek()]>=arr[i]) st1.pop();
        //     if(st1.isEmpty()) nse[i]=n;
        //     else nse[i]=st1.peek();
        //     st1.push(i);
        // }
        // for(int ele : nse){
        //     System.out.print(ele+" ");
        // }
        // int mx=0;
        // for(int i=0;i<n;i++){
        //     mx=Math.max(mx,arr[i]*(nse[i]-pse[i]-1));
        // }
        // return mx;

        // ONE PASS 
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int mx=0;
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                int ele=st.pop();
                int nse=i;
                int pse = st.isEmpty() ? -1 : st.peek();
                int area=arr[ele]*(nse-pse-1);
                mx=Math.max(mx,area);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int ele=st.pop();
            int nse=n;
            int pse=st.isEmpty() ? -1 : st.peek();
            int area=arr[ele]*(nse-pse-1);
            mx=Math.max(mx,area);
        }
        return mx;
    }
}
