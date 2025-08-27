package DP;

public class Q5_bestTimeToBuyAndSellStock {
  // think as if we are selling a stock on ith day, we must have bought it on the day with minimum price till now
   public int maxProfit(int[] arr) {
        int n=arr.length;
        int mn=Integer.MAX_VALUE;
        int mxProfit=0;
        for(int i=0;i<n;i++){
            mn=Math.min(mn,arr[i]);
            mxProfit=Math.max(mxProfit,arr[i]-mn);
        }
        return mxProfit;
    }
}