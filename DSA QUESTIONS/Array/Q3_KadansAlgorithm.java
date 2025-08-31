package Array;
public class Q3_KadansAlgorithm {
  // Kadan's Algorithm -> max sum of subarray
  // TC = O(n)
  // SC = O(1)
  public int maxSubArray(int[] nums) {
        int n=nums.length;
        int s=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            s+=nums[i];
            ans=Math.max(ans,s);
            if(s<0){ // if sum < 0 , its better to start fresh
                s=0;
            }
        }
        return ans;
}
}
