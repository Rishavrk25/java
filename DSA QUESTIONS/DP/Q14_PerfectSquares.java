package DP;

import java.util.Arrays;

public class Q14_PerfectSquares {
  // MEMOIZATION -> Imp
//   int helper(int n,int dp[]){
//     if(n==0) return 0;
//     if(dp[n]!=-1) return dp[n];
//     int ans=n;
//     for(int i=1;i*i<=n;i++){
//         ans = Math.min(ans, 1 + helper(n-i*i,dp));
//     } 
//     return dp[n]=ans;
// }
// public int numSquares(int n) {
//     int dp[]=new int[n+1];
//     Arrays.fill(dp,-1);
//     return helper(n,dp);
// }


    // TABULATION -> derived from memoization
    public int numSquares(int n) {
     int dp[]=new int[n+1];
     Arrays.fill(dp,Integer.MAX_VALUE);
     dp[0] = 0;
     for(int i=1;i<=n;i++){
        for(int j=1;j*j<=n;j++){
            int temp= i - j*j;
            if(temp>=0) dp[i] = Math.min(dp[i], 1 + dp[temp]);
        }
     }
     return dp[n];

 }
}
