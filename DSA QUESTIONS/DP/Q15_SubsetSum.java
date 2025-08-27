package DP;

import java.util.Arrays;

public class Q15_SubsetSum {
//   static boolean helper(int arr[],int t,int i,int dp[][]){
//         if(i==arr.length){
//             if(t==0) return true;
//             else return false;
//         }
//         if(dp[i][t]!=-1) return dp[i][t]==1;
//         boolean ans = false;
//         boolean skip = helper(arr,t,i+1,dp);
//         boolean pick = false;
//         if(arr[i]<=t) pick = helper(arr,t - arr[i],i+1,dp);
//         ans = skip || pick;
//         if(ans) dp[i][t] = 1;
//         else dp[i][t] = 0;
//         return ans;
//     }
//     static Boolean isSubsetSum(int arr[], int t) {
//         // code here
//         int n=arr.length;
//         int dp[][]=new int[n+1][t+1];
//         for(int row[] : dp){
//             Arrays.fill(row,-1);
//         }
//         return helper(arr,t,0,dp);
        
//     }


// TABULATION
static Boolean isSubsetSum(int arr[], int t) {
    int n = arr.length;
    boolean dp[][] = new boolean[n+1][t+1];

    // Base case: target 0 is always true
    for (int i = 0; i <= n; i++) {
        dp[i][0] = true;
    }

    // Fill DP table
    for (int i = n-1; i >= 0; i--) {
        for (int j = 0; j <= t; j++) {
            boolean skip = dp[i+1][j];
            boolean pick = false;
            if (arr[i] <= j) pick = dp[i+1][j-arr[i]];
            dp[i][j] = skip || pick;
        }
    }

    return dp[0][t];
}

}
