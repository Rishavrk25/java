package Array;

import java.util.ArrayList;

public class Q3_KadansAlgorithm {
  // Kadan's Algorithm -> max sum of subarray
  // TC = O(n)
  // SC = O(1)
//   public int maxSubArray(int[] nums) {
//         int n=nums.length;
//         int s=0;
//         int ans=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             s+=nums[i];
//             ans=Math.max(ans,s);
//             if(s<0){ // if sum < 0 , its better to start fresh
//                 s=0;
//             }
//         }
//         return ans;
// }


// Given an array of integers arr[], find the contiguous subarray with the maximum sum that contains only non-negative numbers. If multiple subarrays have the same sum, return the one with the smallest starting index. If the array contains only negative numbers, return -1.
 public ArrayList<Integer> findSubarray(int arr[]) {
        int n=arr.length;
        int max=0;
        int sum=0;
        int s=0;
        int e=0;
        int resStart = 0;
        int resEnd = 0;
        boolean allNeg=true;
        for(int i=0;i<n;i++){
            if(arr[i]>0) allNeg=false;
            sum+=arr[i];
            if(sum>=max){
                max=sum;
                e=i;
                resStart = s;
                resEnd = e;
            }
            else if(arr[i]<0){
                sum=0;
                s=i+1;
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=resStart;i<=resEnd;i++){
            list.add(arr[i]);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        if(allNeg) return ans;
        return list;
        
        
        // code here
        // int n=arr.length;
        // int s=0;
        // int e=0;
        // int max=arr[0];
        // boolean allNeg = true;
        // for(int i=0;i<n;i++){
        //     int sum = 0;
        //     for(int j=i;j<n;j++){
        //         if(arr[j]>0) allNeg=false;
        //         if(arr[j]<0) break;
        //         sum+=arr[j];
        //         if(sum>=max){
        //             max=sum;
        //             s=i;
        //             e=j;
        //         }
        //     }
        // }
        // ArrayList<Integer> list = new ArrayList<>();
        // for(int i=s;i<=e;i++){
        //     list.add(arr[i]);
        // }
        // ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(-1);
        // if(allNeg) return ans;
        // return list;
        
        
        
    }
}
