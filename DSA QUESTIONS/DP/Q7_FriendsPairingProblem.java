package DP;

public class Q7_FriendsPairingProblem {
  // MEMOIZATION
    // long helper(int n,long dp[]){
    //     if(n<=2) return n;
    //     if(dp[n]!=-1) return dp[n];
    //     return dp[n] = helper(n-1,dp) + (n-1)*helper(n-2,dp);
    // }
    // public long countFriendsPairings(int n) {
    //     long dp[]=new long[n+1];
    //     Arrays.fill(dp,-1);
    //     return helper(n,dp);
        
    // }
    
    // TABULATION
    public long countFriendsPairings(int n) {
        if(n<=2) return n;
        long dp[]=new long[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i] = dp[i-1] + (i-1)*dp[i-2];
        }
        return dp[n];
    }
}
