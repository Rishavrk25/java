public class Q57_LongestConsecutiveSequence {
    
    public int longestConsecutive(int[] arr) {
        // BRUTE FORCE -> TC = O(nlogn)
        // int n=arr.length;
        // if(n==0) return 0;
        // Arrays.sort(arr);
        // int mx=0;
        // int c=1;
        // for(int i=0;i<n-1;i++){
        //     if(arr[i]==arr[i+1]) continue;
        //     else if(arr[i]+1==arr[i+1]) c++;
        //     else{
        //         mx=Math.max(mx,c);
        //         c=1;
        //     }
        // }
        // return Math.max(mx,c);

        // OPTIMAL USING HASHSET , TC = O(n) , SC = O(n);
        int n=arr.length;
        if(n==0) return 0;
        int mx=1;
        HashSet<Integer> set= new HashSet<>();
        for(int ele: arr) set.add(ele);
        for(int ele: set){
            if(!set.contains(ele-1)){
                int c=1;
                int num=ele;
                while(set.contains(num+1)){
                    c++;
                    num++;
                }
                mx=Math.max(mx,c);
            }
        }
        return mx;
    }
}

