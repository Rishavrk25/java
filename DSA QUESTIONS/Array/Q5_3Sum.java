package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q5_3Sum {
  // OPTIMAL 
  // TC = O(nlogn + n^2)
  // SC = O(m) , where m = no. of unique triplets
    public List<List<Integer>> threeSum(int[] arr) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            if(i>0 && arr[i]==arr[i-1]) continue;
            int j=i+1;
            int k=n-1;
            while(j<k){
                int sum=arr[i]+arr[j]+arr[k];
                if(sum<0) j++;
                else if(sum>0) k--;
                else{ // sum==0
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[j]);
                    list.add(arr[k]);
                    ans.add(list);
                    j++;
                    k--;
                    while(j<k && arr[j]==arr[j-1]) j++;
                    while(j<k && arr[k]==arr[k+1]) k--;
                }
            }
        }
        return ans;

        // USING HASHSET
        // HashSet<List<Integer>> ansSet=new HashSet<>();
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     HashSet<Integer> set=new HashSet<>();
        //     for(int j=i+1;j<n;j++){
        //         int ele = arr[i]+arr[j];
        //         int rem = -ele;
        //         if(set.contains(rem)){
        //             List<Integer> list=new ArrayList<>();
        //             list.add(arr[i]);
        //             list.add(arr[j]);
        //             list.add(rem);
        //             Collections.sort(list);
        //             ansSet.add(list);
        //         }
        //         else set.add(arr[j]);
        //     }
        // }
        //     List<List<Integer>> ans=new ArrayList<>();
        //     for(List<Integer> list : ansSet){
        //         ans.add(list);
        //     }   
        //     return ans;

        
        // BRUTE FORCE
        // HashSet<List<Integer>> set = new HashSet<>();
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         for(int k=j+1;k<n;k++){
        //             if(arr[i]+arr[j]+arr[k]==0){
        //                 ArrayList<Integer> list=new ArrayList<>();
        //                 list.add(arr[i]);
        //                 list.add(arr[j]);
        //                 list.add(arr[k]);
        //                 Collections.sort(list);
        //                 set.add(list);
        //             }
        //         }
        //     }
        // }
        // List<List<Integer>> ans=new ArrayList<>();
        // for(List<Integer> list : set){
        //     ans.add(list);
        // }
        // return ans;
    }
}
