public class Q1_maxSumOfSubarrayOfSizeK {
     public int maximumSumSubarray(int[] arr, int k) {
        // SLIDING WINDOW
        int n=arr.length;
        int i=0;
        int j=0;
        int mx=Integer.MIN_VALUE;
        int sum=0;
        while(j<n){
            sum+=arr[j];
            if(j-i+1 > k){
                sum-=arr[i];
                i++;
            }
            mx=Math.max(mx,sum);
            j++;
        }
        return mx;
    }
}
