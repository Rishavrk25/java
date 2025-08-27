package DP;

import java.util.Arrays;

public class Q3_minCostClimbingStairs {
  // MEMOIZATION
  // int helper(int arr[],int idx,int dp[]){
  //       if(idx==0 || idx==1) return arr[idx];
  //       if(dp[idx]!=-1) return dp[idx];
  //       return dp[idx] = arr[idx] + Math.min(helper(arr,idx-1,dp),helper(arr,idx-2,dp));
  //   }
  //   public int minCostClimbingStairs(int[] arr) {
  //       int n=arr.length;
  //       // n is going from n-1 to 0
  //       int dp[] = new int[n];
  //       Arrays.fill(dp,-1);
  //       return Math.min(helper(arr,n-1,dp),helper(arr,n-2,dp));
        
  //   }

  
  // TABULATION
   public int minCostClimbingStairs(int[] arr) {
        int n=arr.length;
        int dp[]=new int[n];
        dp[0]=arr[0];
        dp[1]=arr[1];
        for(int i=2;i<n;i++){
            dp[i]= arr[i] + Math.min(dp[i-1],dp[i-2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
}
