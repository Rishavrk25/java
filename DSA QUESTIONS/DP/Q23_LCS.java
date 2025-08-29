package DP;

import java.util.Arrays;

public class Q23_LCS {
  // MEMOIZATION
  //  int helper(String s1,String s2,int i,int j,int dp[][]){
  //       if(i==0 || j==0) return 0;
  //       if(dp[i][j]!=-1) return dp[i][j];
  //       if(s1.charAt(i-1)==s2.charAt(j-1)) return dp[i][j] = 1+helper(s1,s2,i-1,j-1,dp);
  //       else return dp[i][j]=Math.max(helper(s1,s2,i-1,j,dp), helper(s1,s2,i,j-1,dp)); 
  //   }
  //   public int longestCommonSubsequence(String text1, String text2) {
  //       int m=text1.length();
  //       int n=text2.length();
  //       int dp[][]=new int[m+1][n+1];
  //       for(int row[]: dp) Arrays.fill(row,-1);
  //       return helper(text1,text2,m,n,dp);
  //   }

  
    // TABULATION
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int m=text1.length();
    //     int n=text2.length();
    // *** dp will store length of LCS ***
    //     int dp[][]=new int[m+1][n+1];
    //     for(int i=1;i<=m;i++){
    //         for(int j=1;j<=n;j++){
    //             if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j]  = 1 + dp[i-1][j-1];
    //             else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
    //         }
    //     }
    //     return dp[m][n];
    // }


    // WITH SPACE OPTIMIZATION
    // public int longestCommonSubsequence(String text1, String text2) {
    //     int m=text1.length();
    //     int n=text2.length();
    //     int dp[][]=new int[2][n+1];
    //     for(int i=1;i<=m;i++){
    //         for(int j=1;j<=n;j++){
    //             if(text1.charAt(i-1)==text2.charAt(j-1)) dp[1][j]  = 1 + dp[1-1][j-1];
    //             else dp[1][j] = Math.max(dp[1-1][j],dp[1][j-1]);
    //         }
    //         for(int j=0;j<=n;j++) dp[0][j] = dp[1][j];
    //     }
    //     return dp[1][n];
    // }


    // PRINT LCS
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();
        int dp[][]=new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(text1.charAt(i-1)==text2.charAt(j-1)) dp[i][j]  = 1 + dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
            }
        }
        // print lcs
        int i=m;
        int j=n;
        String lcs = "";
        while(i>0 && j>0){
            if(text1.charAt(i-1) == text2.charAt(j-1)){
                lcs += text1.charAt(i-1);
                i--;
                j--;
            }
            else if(dp[i-1][j] > dp[i][j-1]) i--;
            else j--;
        }
        StringBuilder sb= new StringBuilder(lcs);
        lcs = sb.reverse().toString();
        System.out.print(lcs);
        return dp[m][n];
    }
}
