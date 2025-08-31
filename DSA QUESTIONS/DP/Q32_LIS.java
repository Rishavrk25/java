package DP;

public class Q32_LIS {
  // Longest Increasing Subsequence
  public int lengthOfLIS(int[] arr) {
        int n= arr.length;
        int dp[] = new int[n];
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i-1;j++){
                if(arr[j]<arr[i]) dp[i] = Math.max(dp[i],dp[j]);
            }
            dp[i]++;
            ans = Math.max(ans,dp[i]);
        }
        return ans;
    }
}
