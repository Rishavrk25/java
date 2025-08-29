package DP;

public class Q26_LongestCommonSubstring {
  public int longestCommonSubstr(String s1, String s2) {
        // code here
        int ans =0 ;
        int m=s1.length();
        int n = s2.length();
        int dp[][] = new int[m+1][n+1];
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)) dp[i][j] = 1 + dp[i-1][j-1];
                else dp[i][j] = 0;
                ans = Math.max(ans, dp[i][j]);
            }
        }
        return ans;
        
    }
}
