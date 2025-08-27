package DP;

import java.util.Arrays;

public class Q24_EditDistance {
//    int helper(String s1,String s2,int i,int j,int dp[][]){
//         if(i==0) return j;
//         if(j==0) return i;
//         if(dp[i][j]!=-1) return dp[i][j];
//         if(s1.charAt(i-1)==s2.charAt(j-1)) return dp[i][j] = helper(s1,s2,i-1,j-1,dp);
//         else{
//             int del = helper(s1,s2,i-1,j,dp);
//             int in = helper(s1,s2,i,j-1,dp);
//             int re = helper(s1,s2,i-1,j-1,dp);
//             return dp[i][j] = 1 + Math.min(del,Math.min(in,re));
//         } 
//     }
//     public int minDistance(String word1, String word2) {
//         int m = word1.length();
//         int n = word2.length();
//         int dp[][] = new int[m + 1][n + 1];
//         for(int row[]:dp) Arrays.fill(row,-1);
//         return helper(word1,word2,m,n,dp);
//     }




// TABULATION
// public int minDistance(String word1, String word2) {
//         int m = word1.length();
//         int n = word2.length();
//         int dp[][] = new int[m + 1][n + 1];
//         // Initialize base cases
//         for (int i = 0; i <= m; i++) dp[i][0] = i;
//         for (int j = 0; j <= n; j++) dp[0][j] = j; 
        
//         for (int i = 1; i <= m; i++) {
//             for (int j = 1; j <= n; j++) {
//                 if (word1.charAt(i - 1) == word2.charAt(j - 1)) dp[i][j] = dp[i - 1][j - 1];
//                 else {
//                     int del = dp[i - 1][j];
//                     int in = dp[i][j - 1];
//                     int re = dp[i - 1][j - 1];
//                     dp[i][j] = 1 + Math.min(del, Math.min(in, re));
//                 }
//             }
//         }
//         return dp[m][n];
//     }



// TABULATION WITH SPACE OPTIMIZATION
public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int dp[][] = new int[2][n + 1];
        // Initialize base cases
        for (int j = 0; j <= n; j++) dp[0][j] = j; 
        for (int i = 1; i <= m; i++) {
            dp[1][0] = i;
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) dp[1][j] = dp[1 - 1][j - 1];
                else {
                    int del = dp[1 - 1][j];
                    int in = dp[1][j - 1];
                    int re = dp[1 - 1][j - 1];
                    dp[1][j] = 1 + Math.min(del, Math.min(in, re));
                }
            }
            for(int j=0;j<=n;j++) dp[0][j]=dp[1][j];
        }
        return dp[0][n];
    }
}