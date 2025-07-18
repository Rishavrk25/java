import java.util.HashMap;
import java.util.Stack;


public class Q45_NextGreaterElement_1 {
    
 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Stack<Integer> st=new Stack<>();
        // Mapping Next greatest Elements
        for(int i=nums2.length-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=nums2[i]) st.pop();
            if(st.isEmpty()) map.put(nums2[i],-1);
            else map.put(nums2[i],st.peek());
            st.push(nums2[i]);
        }
        int ans[]=new int[nums1.length];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])) ans[k++]=map.get(nums1[i]);
            else ans[k++]=-1;
        }
        return ans;
        
        // BRUTE FORCE
        // int ans[]=new int[nums1.length];
        // int m=0;
        // for(int i=0;i<nums1.length;i++){
        //     int idx=-1;
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             idx=j;
        //             break;
        //         }
        //     }
        //     boolean flag=false;
        //     for(int k=idx;k<nums2.length;k++){
        //         if(nums2[k]>nums1[i]){
        //             ans[m++]=nums2[k];
        //             flag=true;
        //             break;
        //         }
        //     }
        //     if(flag==false) ans[m++]=-1;
            

        // }
        // return ans;



    }}