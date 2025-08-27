package DP;

import java.util.Arrays;

public class Q20_Target_Sum {
  int sum = 0;
    int helper(int arr[],int t,int res,int i,int dp[][]){
        if(i==arr.length) return (res==t)? 1 : 0;
        if(dp[i][res+sum]!=-1) return dp[i][res+sum];
        int skip = helper(arr,t,res-arr[i], i+1,dp);
        int take = helper(arr,t,res+arr[i],i+1,dp);
        return dp[i][res+sum] = (skip + take);
    }
    public int findTargetSumWays(int[] arr, int target) {
        int n=arr.length;
        // i -> 0 to n-1
        // res -> -sum to sum
        sum=0;
        for(int ele:arr) sum+=ele;
        int dp[][] = new int[n][2*sum+1];
        for(int row[] : dp) Arrays.fill(row,-1);
        return helper(arr,target,0,0,dp);
    }
}
