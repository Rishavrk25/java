package DP;

public class Q21_VisitArrayPositionsToMaximizeScore {
  // MEMOIZATION
    // long helper(int arr[],int x,int i,int parity,long dp[][]){
    //     if(i==arr.length) return 0;
    //     if(dp[i][parity]!=-1) return dp[i][parity];
    //     long skip = helper(arr,x,i+1,parity,dp);
    //     long take = 0;
    //     if(arr[i]%2 == parity ){
    //        take = arr[i] + helper(arr,x,i+1,parity,dp);
    //     }
    //     else take = arr[i] - x + helper(arr,x,i+1,(parity==0) ? 1:0,dp);
    //     return dp[i][parity]=Math.max(skip,take);
    // }
    // public long maxScore(int[] nums, int x) {
    //     int n=nums.length;
    //     long dp[][]=new long[n+1][2];
    //     for(long row[]:dp) Arrays.fill(row,-1);
    //     return nums[0] + helper(nums,x,1,nums[0]%2,dp);
    // } 


    // TABULATION
    public long maxScore(int[] arr, int x) {
        int n=arr.length;
        long dp[][]=new long[n+1][2];
        for(int i=n-1;i>=0;i--){
           for(int j=0;j<=1;j++){
            long skip = dp[i+1][j];
            long take = 0;
            if(arr[i]%2 == j) take= arr[i] + dp[i+1][j];
            else take =arr[i]-x+dp[i+1][1-j];
            dp[i][j] = Math.max(skip,take);
           }
        }
        return dp[0][arr[0]%2];
    } 
}