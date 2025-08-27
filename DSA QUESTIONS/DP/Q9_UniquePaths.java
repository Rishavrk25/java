package DP;

public class Q9_UniquePaths {
  // MEMOIZATION
    // int helper(int m,int n,int i,int j,int dp[][]){
    //     if(i>=m || j>=n) return 0;
    //     if(i==m-1 && j==n-1) return 1;
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     return dp[i][j] = helper(m,n,i,j+1,dp) + helper( m, n,i+1,j,dp);     
    // }
    // public int uniquePaths(int m, int n) {
    //     int dp[][]=new int[m][n];
    //     for(int row[] : dp){
    //         Arrays.fill(row,-1);
    //     }
    //     return helper(m,n,0,0,dp);
    // }


    // TABULATION
    // public int uniquePaths(int m, int n) {
    //     int dp[][]=new int[m][n];
    //     for(int i=0;i<m;i++){
    //         dp[i][0]=1;
    //     }
    //     for(int j=0;j<n;j++){
    //         dp[0][j]=1;
    //     }
    //     for(int i=1;i<m;i++){
    //         for(int j=1;j<n;j++){
    //             dp[i][j] = dp[i][j-1] + dp[i-1][j];
    //         }
    //     }
    //     return dp[m-1][n-1];
    // }


    // TABULATION -> WITH SPACE OPTIMIZATION
    public int uniquePaths(int m, int n) {
        if(m==1) return 1;
        int dp[][]=new int[2][n];
        for(int j=0;j<n;j++){
            dp[0][j]=1;
            dp[1][j]=1;
        }
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                dp[1][j] = dp[1][j-1] + dp[0][j];
                dp[0][j]=dp[1][j];
            }
            
        }
        return dp[1][n-1];
    }
}
