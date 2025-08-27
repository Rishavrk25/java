package DP;

import java.util.Arrays;

public class Q6_HouseRobber_2 {
// MEMOIZATION
// int helper(int arr[],int i,int n,int dp[]){
//         if(i>n) return 0;
//         if(dp[i]!=-1) return dp[i];
//         int take=arr[i] + helper(arr,i+2,n,dp);
//         int skip= helper(arr,i+1,n,dp);
//         return dp[i] = Math.max(take,skip);
//     }
//      public int rob(int[] arr) {
//         int n=arr.length;
//         if(n==1) return arr[0];
//         if(n==2) return Math.max(arr[0],arr[1]);

//         int dp[]=new int[n];
//         Arrays.fill(dp,-1);
//         int dp1[]=new int[n];
//         Arrays.fill(dp1,-1);
        
//         int case1 = helper(arr,0,n-2,dp);
//         int case2 = helper(arr,1,n-1,dp1);
//         return Math.max(case1,case2);
//      }


// TABULATION
public int rob(int[] arr) {
        int n=arr.length;
        if(n==1) return arr[0];
        if(n==2) return Math.max(arr[0],arr[1]);
        
        // 0 to n-2
        int dp[]=new int[n];    
        dp[0]=arr[0];
        dp[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n-1;i++){
            dp[i] = Math.max(arr[i]+dp[i-2], dp[i-1]);
        }

        // 1 to n-1
        int dp1[]=new int[n];    
        dp1[1]=arr[1];
        dp1[2]=Math.max(arr[1],arr[2]);
        for(int i=2;i<n;i++){
            dp1[i] = Math.max(arr[i]+dp1[i-2], dp1[i-1]);
        }
         
        return Math.max(dp[n-2],dp1[n-1]);

    }
}
