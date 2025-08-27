package DP;

import java.util.Arrays;

public class Q16_PartitionEqualSubsetSum {
// MEMOIZATION
//    boolean helper(int arr[],int i,int t,int dp[][]){
//         if(i==arr.length){
//             if(t==0) return true;
//             else return false;
//         }
//         if(t<0) return false;
//         if(dp[i][t]!=-1) return dp[i][t]==1;
//         boolean skip = helper(arr,i+1,t,dp);
//         boolean pick = helper(arr,i+1,t-arr[i],dp);
//         boolean ans = skip || pick;
//         dp[i][t]= ans ? 1 : 0;
//         return ans;
//     }
//     public boolean canPartition(int[] arr) {
//         int n=arr.length;
//         int sum=0;
//         for(int ele : arr) sum+=ele;
//         if(sum%2!=0) return false;
//         int target= sum/2;

//         int dp[][]=new int[n+1][target+1];
//         for(int row[] : dp) Arrays.fill(row,-1);
//         return helper(arr,0,target,dp);
//     }


// TABULATION
public boolean canPartition(int[] arr) {
        int n=arr.length;
        int sum=0;
        for(int ele : arr) sum+=ele;
        if(sum%2!=0) return false;
        int target= sum/2;

        boolean dp[][]=new boolean[n+1][target+1];
        for(int i=0;i<=n;i++) dp[i][0] = true;
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=target;j++){
                boolean skip = dp[i+1][j];
                boolean take = false;
                if(arr[i]<=j) take = dp[i+1][j-arr[i]];
                dp[i][j]=skip||take;
            }
        }
        return dp[0][target];
    }
}
