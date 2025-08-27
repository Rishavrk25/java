package DP;

import java.util.Arrays;
import java.util.List;

public class Q19_LengthOfLongestSubsequenceThatSumsToTarget {
  
  // Memoization -> INTUITIVE , TLE ERROR
  // int helper(List<Integer> arr, int t, int i, int dp[][]) {
  //   if (i == arr.size()) return (t == 0) ? 0 : -1;
  //   if (t < 0) return -1; // target negative -> invalid
  //   if (dp[i][t] != -1) return dp[i][t];
  //   int skip = helper(arr, t, i + 1, dp);
  //   int pick = -1;
  //   if (arr.get(i) <= t) {
  //     int temp = helper(arr, t - arr.get(i), i + 1, dp);
  //     if (temp != -1) pick = 1 + temp;
  //   }
  //   return dp[i][t] = Math.max(skip, pick);
  // }

  // public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
  //   int n = nums.size();
  //   int dp[][] = new int[n + 1][target + 1];
  //   for (int row[] : dp)
  //     Arrays.fill(row, -1);
  //   return helper(nums, target, 0, dp);
  // }
  


  // TABULATION  -> BEST
  public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int n=nums.size();
        int dp[][] = new int[n+1][target+1];
        for(int row[] : dp) Arrays.fill(row,-1);

        // Base Case: sum = 0
        // If the remaining sum target is 0, it means we don’t need any more elements to reach the target.
        // So, the longest subsequence that sums to 0 is an empty subsequence, which has length 0.
        for (int i = 0; i <= n; i++) dp[i][0] = 0;

        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=target;j++){
                int skip = dp[i+1][j];
                int take = -1;
                if(nums.get(i) <= j && dp[i + 1][j - nums.get(i)] != -1){
                    take = 1 + dp[i+1][j - nums.get(i)];   
                }
                dp[i][j] = Math.max(skip,take);
            }
        }
        return dp[0][target];
    }

}