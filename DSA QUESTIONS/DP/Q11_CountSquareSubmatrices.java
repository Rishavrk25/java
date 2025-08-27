package DP;

public class Q11_CountSquareSubmatrices {
   public int countSquares(int[][] arr) {
        int r=arr.length;
        int c=arr[0].length;
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(arr[i][j]!=0){
                    arr[i][j] = arr[i][j] + Math.min(Math.min(arr[i-1][j],arr[i][j-1]),arr[i-1][j-1]);
                }
            }
        }
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                ans+=arr[i][j];
            }
        }
        return ans;
    }
}
