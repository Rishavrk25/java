package PrefixSum;

import java.util.HashMap;

public class Q2_ContiguousArray {
    // Given a binary array nums, return the maximum length of a 
    // contiguous subarray with an equal number of 0 and 1.

    // Convert all zeros to -1 and perform max length of subarray with 0 sum
    HashMap<Integer,Integer> map = new HashMap<>(); 
        // (sum, idx)
        int sum=0;
        int mxLen=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) arr[i]=-1;
            sum+=arr[i];
            if(sum==0) mxLen=Math.max(mxLen,i+1);
            if(!map.containsKey(sum)) map.put(sum,i);
            else mxLen=Math.max(mxLen,i - map.get(sum));
        }
        return mxLen;
}
