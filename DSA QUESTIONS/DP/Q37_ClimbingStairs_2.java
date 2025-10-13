package DP;

public class Q37_ClimbingStairs_2 {
  int cost(int costs[],int i,int j){
        return costs[j-1] + (j-i)*(j-i);
    }
    public int climbStairs(int n, int[] costs) {
        int dp[] = new int[n+1];
        dp[0]=0;
        if(n>=1) dp[1]=cost(costs,0,1);
        if(n>=2) dp[2]=Math.min(dp[0]+cost(costs,0,2),dp[1]+cost(costs,1,2));
        for(int i=3;i<=n;i++){
            dp[i] = Math.min(Math.min(dp[i-1] + cost(costs,i-1,i),dp[i-2]+cost(costs,i-2,i)),dp[i-3]+cost(costs,i-3,i));
        }
        return dp[n];
    }
}
