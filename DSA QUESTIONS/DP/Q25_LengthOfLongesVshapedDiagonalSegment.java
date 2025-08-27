package DP;

public class Q25_LengthOfLongesVshapedDiagonalSegment {
  class Solution {
    int dp[][][][];
    int helper(int arr[][],int i,int j ,int dir, boolean allowed,int target,int directions[][]){
        int m = arr.length;
        int n=arr[0].length;
        int ni = i + directions[dir][0];
        int nj = j + directions[dir][1];
        if(ni<0 || ni>=m || nj<0 || nj>=n || arr[ni][nj]!= target) return 0;
        if(dp[ni][nj][dir][allowed ? 1 : 0]!=-1) return dp[ni][nj][dir][allowed ? 1 : 0];
        int nottaketurn = 1 + helper(arr,ni,nj,dir,allowed,2-target,directions);
        int taketurn = 0;
        if(allowed) taketurn = 1 + helper(arr,ni,nj,(dir+1)%4, !allowed,2-target,directions);
        return dp[ni][nj][dir][allowed ? 1 : 0] = Math.max(nottaketurn,taketurn);
    }
    public int lenOfVDiagonal(int[][] arr) {
        int m = arr.length;
        int n=arr[0].length;
        dp = new int[m][n][4][2];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<4;k++){
                    for(int l=0;l<2;l++){
                        dp[i][j][k][l] = -1;
                    }
                }
            }
        }
        int ans = 0;
        int directions[][] = {{1,1},{1,-1},{-1,-1},{-1,1}};
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==1){
                    for(int dir = 0;dir<4;dir++){
                        ans = Math.max(ans, 1 + helper(arr,i,j,dir,true,2,directions));
                    }
                }
            }
        }
        return ans;
    }
}
}