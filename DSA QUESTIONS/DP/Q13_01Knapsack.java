package DP;

import java.util.Arrays;

public class Q13_01Knapsack {
  // MEMOIZATION
  // static int helper(int i,int wt[],int val[],int c,int dp[][]){
    //     if(i>=wt.length) return 0;
    //     if(dp[i][c]!=-1) return dp[i][c];
    //     int skip = helper(i+1,wt,val,c,dp);
    //     int take=0;
    //     if(wt[i] <= c) take = val[i] + helper(i+1,wt,val,c-wt[i],dp);
    //     return dp[i][c]=Math.max(take,skip);
    // }
    // static int knapsack(int W, int val[], int wt[]) {
    //     // code here
    //     int n=wt.length;
    //     int dp[][]=new int[n+1][W+1];
    //     for(int row[] : dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return helper(0,wt,val,W,dp);
        
    // }
    

    // TABULATION
    static int knapsack(int c, int val[], int wt[]) {
        int n=wt.length;
        int dp[][]=new int[n+1][c+1];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=c;j++){
                int skip = dp[i+1][j];
                int take = 0;
                if(wt[i] <= j) take = val[i] + dp[i+1][j-wt[i]];
                dp[i][j] = Math.max(skip,take);
            }
        }
        return dp[0][c];
    }
    


    // UNBOUNDED KNAPSACK -> PICK  me i+1 k jagah i , remaining code will be same
    
    // static int helper(int val[],int wt[],int c,int i,int dp[][]){
    //     if(i>=wt.length) return 0;
    //     if(dp[i][c]!=-1) return dp[i][c];
    //     int skip= helper(val,wt,c,i+1,dp);
    //     int pick = 0;
    //     if(wt[i]<=c) pick = val[i] + helper(val,wt,c-wt[i],i,dp);
    //     return dp[i][c] = Math.max(skip,pick);
    // }
    // static int knapSack(int val[], int wt[], int capacity) {
    //     // code here
    //     int n=wt.length;
    //     int dp[][]=new int[n][capacity+1];
    //     for(int row[]:dp) Arrays.fill(row,-1);
    //     return helper(val,wt,capacity,0,dp);
        
    // }
}
