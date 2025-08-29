package DP;

public class Q28_PalindromicSubstring {
  public int countSubstrings(String s) {
        int n = s.length();
        int dp[][]=new int[n][n];
        int ans = 0 ;
        for(int k=0;k<n;k++){
            int i = 0;
            int j = k;
            while(i<n && j<n){
                if(k==0) dp[i][j] = 1;
                else if(k==1 && s.charAt(i)==s.charAt(j)) dp[i][j] = 1;
                else{
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==1) dp[i][j]=1;
                    else dp[i][j] = 0;
                }
                if(dp[i][j]==1) ans++;
                i++; j++;
            }
        }
        return ans;
    }
}