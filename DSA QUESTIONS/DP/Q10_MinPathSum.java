package DP;

public class Q10_MinPathSum {
  // MEMOIZATION
    // int helper(int arr[][],int r,int c,int i, int j,int dp[][]){
    //     if(i>=r || j>=c) return Integer.MAX_VALUE;
    //     if(i==r-1 && j==c-1) return arr[i][j];
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     int right = helper(arr,r,c,i,j+1,dp);
    //     int left =  helper(arr,r,c,i+1,j,dp);
    //     return dp[i][j] = arr[i][j] + Math.min(right,left);
    // }
    // public int minPathSum(int[][] grid) {
    //     int r=grid.length;
    //     int c=grid[0].length;
    //     int dp[][]=new int[r][c];
    //     for(int row[]: dp){
    //         Arrays.fill(row,-1);
    //     }
    //    return helper(grid,r,c,0,0,dp);
    // }

    // TABULATION
     public int minPathSum(int[][] grid) {
         int r=grid.length;
        int c=grid[0].length;
        int dp[][]=new int[r][c];
        dp[0][0]=grid[0][0];
        for(int i=1;i<r;i++){
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for(int j=1;j<c;j++){
            dp[0][j] = grid[0][j] + dp[0][j-1];
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                dp[i][j]= grid[i][j] + Math.min(dp[i-1][j],dp[i][j-1]);
            }
        }
        return dp[r-1][c-1];

     }
}
