package DP;

import java.util.Arrays;

public class Q38_MinScoreTrangulationOfPolygon {
// mcm pattern
// Recursion + Memoization
int helper(int arr[],int i,int j,int dp[][]){
        if(i+1 == j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans = Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
            int x=arr[i]*arr[j]*arr[k];
            int total = helper(arr,i,k,dp) + helper(arr,k,j,dp) + x;
            ans = Math.min(ans,total);
        }
        return dp[i][j]=ans;
    }
    public int minScoreTriangulation(int[] arr) {
        int n=arr.length;
        int dp[][] = new int[n][n];
        for(int row[]:dp) Arrays.fill(row,-1);
        return helper(arr,0,n-1,dp);
    }
}

// Tabulation
// public int minScoreTriangulation(int[] arr) {
//         int n = arr.length;
//         int dp[][] = new int[n][n];
//         for (int i = n - 1; i >= 0; i--) {
//             for (int j = i+2; j < n; j++) {
//                 if (i + 1 == j) {
//                     dp[i][j] = 0;
//                     continue;
//                 }
//                 int ans = Integer.MAX_VALUE;
//                 for (int k = i + 1; k < j; k++) {
//                     int x = arr[i] * arr[j] * arr[k];
//                     int total = dp[i][k] + dp[k][j] + x;
//                     ans = Math.min(ans, total);
//                 }
//                 dp[i][j]=ans;
//             }
//         }
//         return dp[0][n-1];

//     }