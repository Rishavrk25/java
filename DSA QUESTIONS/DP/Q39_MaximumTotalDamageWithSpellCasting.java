package DP;

import java.util.Arrays;
import java.util.HashMap;

public class Q39_MaximumTotalDamageWithSpellCasting {
class Solution {
    HashMap<Integer,Integer> map;
    int ub(int arr[],int t){
        int l=0;
        int h=arr.length;
        while(l<h){
            int m=(l+h)/2;
            if(arr[m] <= t) l=m+1;
            else h=m;
        }
        return l;
    }
    long helper(int arr[],int i,long dp[]){
        int n=arr.length;
        if(i>=n) return 0;
        if(dp[i]!=-1) return dp[i];
        long skip = helper(arr,i+1,dp);
        int j=ub(arr,arr[i]+2);
        long take = (long)arr[i] * map.get(arr[i]) + helper(arr,j,dp);
        return dp[i] = Math.max(take,skip);
    }
    public long maximumTotalDamage(int[] power) {
        map = new HashMap<>();
        for(int ele : power){
            if(!map.containsKey(ele)) map.put(ele,1);
            else map.put(ele,map.get(ele)+1);
        }
        int arr[] = new int[map.size()];
        long dp[] = new long[arr.length];
        Arrays.fill(dp,-1);
        int k=0;
        for(int key: map.keySet()){
            arr[k++] = key;
        }
        Arrays.sort(arr);
        return helper(arr,0,dp);

    }
}
}