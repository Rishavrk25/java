package DP;

import java.util.Arrays;

public class Q8_DearrangementOfBalls {
  // MEMOIZATION
        static int helper(int n,int dp[]){
            if(n<=3) return n-1;
            if(dp[n]!=-1) return dp[n];
            return dp[n] = (n-1) * (helper(n-1,dp) + helper(n-2,dp));
        }
        static int countDer(int n) {
            int dp[]=new int[n+1];
            Arrays.fill(dp,-1);
            return helper(n,dp);
        }
    
    
    // TABULATION
    // static int countDer(int n) {
    //     if(n<=3) return n-1;
    //     int dp[]=new int[n+1];
    //     dp[1]=0;
    //     dp[2]=1;
    //     dp[3]=2;
    //     for(int i=4;i<=n;i++){
    //         dp[i] = (i-1) * (dp[i-1] + dp[i-2]);
    //     }
    //     return dp[n];
    // }
}
