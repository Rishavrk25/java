package DP;

import java.util.Arrays;

public class Q2_tribonacci {
  // Recursive dp , Memoization, top-down
  
  // int helper(int n,int dp[]){
  //       if(n==0 || n==1) return n;
  //       if(n==2) return 1;
  //       if(dp[n]!=-1) return dp[n];
  //       return dp[n] = helper(n-1,dp) + helper(n-2,dp) + helper(n-3,dp);
  //   }
  // public int tribonacci(int n) {
  //     int dp[]=new int[n+1];
  //     Arrays.fill(dp,-1);
  //     return helper(n,dp);
  //   }


  // Iterative dp , Tabulation , bottom up

    // public int tribonacci(int n) {
    // if(n==0 || n==1 ) return n;
        // int dp[]=new int[n+1];
        // dp[0]=0;
        // dp[1]=1;
        // dp[2]=1;
        // for(int i=3;i<=n;i++){
        //     dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
        // }
        // return dp[n];
    //  }
}
