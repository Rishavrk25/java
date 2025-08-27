package DP;

import java.util.Arrays;

public class Q18_CoinChange {
    // MEMOIZATION
    // long helper(int arr[],int t,int i,long dp[][]){
    //     if(i==arr.length){
    //         if(t==0) return 0;
    //         else return Integer.MAX_VALUE;
    //     }
    //     if(dp[i][t]!=-1) return dp[i][t];
    //     long skip = helper(arr,t,i+1,dp);
    //     long pick = Integer.MAX_VALUE;
    //     if(arr[i]<=t) pick = 1 + helper(arr,t-arr[i],i,dp);
    //     return dp[i][t] = Math.min(skip,pick);
    // }
    // public int coinChange(int[] coins, int amount) {
    //     int n=coins.length;
    //     long dp[][]=new long[n+1][amount+1];
    //     for(long row[] : dp) Arrays.fill(row,-1);
    //     int ans = (int)helper(coins,amount,0,dp);
    //     if(ans==Integer.MAX_VALUE) return -1;
    //     return ans;
    // }

    
    // TABULATION
    // public int coinChange(int[] coins, int amount) {
    //     int n = coins.length;
    //     long dp[][] = new long[n + 1][amount + 1];
    //     // We are solving a minimum problem (minimum number of coins).
    //     // If a subproblem (dp[i][j]) has not been computed yet, it should be treated as impossible.
    //     // Using INF means "unreachable state". Later, when we take Math.min(skip, pick), the valid computed values will always be smaller than INF.
    //     // Think of INF as "not possible" marker.
    //     for (long row[] : dp)
    //         Arrays.fill(row, Integer.MAX_VALUE);
    //     // No matter which coins are available (i ranges from 0..n), the minimum number of coins required to make amount = 0 is 0.
    //     for (int i = 0; i <= n; i++)
    //         dp[i][0] = 0;
    //     for (int i = n - 1; i >= 0; i--) {
    //         for (int j = 0; j <= amount; j++) {
    //             long skip = dp[i + 1][j];
    //             long pick = Integer.MAX_VALUE;
    //             if (coins[i] <= j)
    //                 pick = 1 + dp[i][j - coins[i]];
    //             dp[i][j] = Math.min(skip, pick);
    //         }
    //     }
    //     return dp[0][amount] >= Integer.MAX_VALUE ? -1 : (int) dp[0][amount];
    // }


    // TABULATION WITH SPACE OPTIMIZATION
     public int coinChange(int[] coins, int amount) {
        int n = coins.length;
            long dp[][] = new long[2][amount + 1];
            for (long row[] : dp)
                Arrays.fill(row, Integer.MAX_VALUE);
            for (int i = 0; i <= 1; i++)
                dp[i][0] = 0;
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 1; j <= amount; j++) {
                    long skip = dp[1][j];
                    long pick = Integer.MAX_VALUE;
                    if (coins[i] <= j)
                        pick = 1 + dp[0][j - coins[i]];
                    dp[0][j] = Math.min(skip, pick);
                }
                for(int k=0;k<=amount;k++) dp[1][k]=dp[0][k];
            }
            return dp[0][amount] >= Integer.MAX_VALUE ? -1 : (int) dp[0][amount];
    }
}
