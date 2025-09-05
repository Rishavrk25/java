package Array;

import java.util.HashMap;

public class Q6_PartitionArrayIntoK_distinctGroups {
  public boolean partitionArray(int[] arr, int k) {
        int n=arr.length;
        if(n%k!=0) return false;
        int noOfgrp = n/k;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int ele: arr){
            if(!map.containsKey(ele)) map.put(ele,1);
            else map.put(ele,map.get(ele) + 1);
        }
        for(int key : map.keySet()){
            int freq = map.get(key);
            if(freq>noOfgrp) return false;
        }
        return true;

    }
}