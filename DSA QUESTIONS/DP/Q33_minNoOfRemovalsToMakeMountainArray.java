package DP;

public class Q33_minNoOfRemovalsToMakeMountainArray {
    public int minimumMountainRemovals(int[] arr) {
        // LIS
        int n=arr.length;
        int dp1[] = new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<=i-1;j++){
                if(arr[j]<arr[i]) dp1[i] = Math.max(dp1[j],dp1[i]);
            }
            dp1[i]++;
        }
        // LIS - RIGHT TO LEFT
        int dp2[] = new int[n];
        for(int i=n-1;i>=0;i--){
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[i]) dp2[i] = Math.max(dp2[j],dp2[i]);
            }
            dp2[i]++;
        }

        int mx=0; // max len of mountain array
        for(int i=0;i<n;i++){
            if(dp1[i]>1 && dp2[i]>1){
                mx = Math.max(mx,dp1[i] + dp2[i] - 1);
            }
        }
        return n-mx;
    }
}