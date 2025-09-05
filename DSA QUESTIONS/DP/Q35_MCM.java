public class Q35_MCM {
  // int cost(int arr[][],int i,int j,int dp[][]){
  //       if(i==j) return 0;
  //       if(dp[i][j]!=-1) return dp[i][j];
  //       int minCost = Integer.MAX_VALUE;
  //       for(int k=i;k<j;k++){
  //           int x = arr[i][0] * arr[k][1] * arr[j][1];
  //           int tc = cost(arr,i,k,dp) + cost(arr,k+1,j,dp) + x;
  //           minCost=Math.min(minCost,tc);
  //       }
  //       return dp[i][j]=minCost;
  //   }
  //   int matrixMultiplication(int brr[]) {
  //       int arr[][] = new int[brr.length-1][2];
  //       for(int i=0;i<brr.length-1;i++){
  //           arr[i][0]=brr[i];
  //           arr[i][1]=brr[i+1];
  //       }
  //       int n = arr.length;
  //       int dp[][] = new int[n][n];
  //       for(int row[]:dp) Arrays.fill(row,-1);
  //       int i=0;
  //       int j=n-1;
  //       return cost(arr,i,j,dp);
  //   }


  // TABULATION
  int matrixMultiplication(int brr[]) {
        int arr[][] = new int[brr.length-1][2];
        for(int i=0;i<brr.length-1;i++){
            arr[i][0]=brr[i];
            arr[i][1]=brr[i+1];
        }
        int n = arr.length;
        int dp[][] = new int[n][n];
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<n;j++){
                if(i==j){
                    dp[i][j] = 0;
                    continue;
                }
                int minCost = Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int x = arr[i][0] * arr[k][1] * arr[j][1];
                    int tc = dp[i][k] + dp[k+1][j] + x;
                    minCost=Math.min(minCost,tc);
                }   
                dp[i][j]=minCost;
            }
        }
        return dp[0][n-1];
    }
}
