public class Q37_MajorityEle {
    public int majorityElement(int[] nums) {
        // BRUTE FORCE TC = O(nlogn)
        // int n=nums.length;
        // Arrays.sort(nums);
        // return nums[n/2];

        // USING HASHMAP TC = O(n) 
        // int n=nums.length;
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<n;i++){
        //     if(!map.containsKey(nums[i])) map.put(nums[i],1);
        //     else{
        //         int val=map.get(nums[i]);
        //         map.put(nums[i],val+1);
        //     }
        // }
        // for(int ele:map.keySet()){
        //     if(map.get(ele)>n/2) return ele;
        // }
        // return -1;

        //Boyer-Moore Voting Algorithm -> OPTIMAL TC = O(n)
        int c=0;
        int mele=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(c==0) mele=nums[i];
            if(nums[i]==mele) c++;
            else c--;
        }
        return mele;
    }
}
