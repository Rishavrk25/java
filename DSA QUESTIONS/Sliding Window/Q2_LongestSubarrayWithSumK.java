public class Q2_LongestSubarrayWithSumK {
    public static int longestSubarrayWithSumK(int []arr, long k) {
        // SLIDING WINDOW -> DYNAMIC LENGTH
        int i=0;
        int j=0;
        int n= arr.length;
        long sum=0;
        int mxlen=Integer.MIN_VALUE;
        while(j<n){
            sum+=arr[j];
            while(sum>k){
                sum-=arr[i];
                i++;
            }
           if(sum==k) {
               mxlen=Math.max(mxlen,j-i+1);  
           }
                j++;
        }
        return mxlen;
    }
}
