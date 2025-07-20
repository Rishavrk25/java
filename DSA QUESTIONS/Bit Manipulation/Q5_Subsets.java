public class Q5_Subsets {
    public List<List<Integer>> subsets(int[] arr) {
        // BIT MANIPULATION
        List<List<Integer>> res = new ArrayList<>();
        int n=arr.length;
        int total=1<<n;
        for(int num=0;num<total;num++){
            ArrayList<Integer> list=new ArrayList<>();
            for(int bitIdx=0;bitIdx<n;bitIdx++){
                int mask=(1<<bitIdx);
                if(((num & mask) != 0)) list.add(arr[bitIdx]);
            }
            res.add(list);
        }
        return res;
    }

    // RECURSION
    // void helper(int arr[],int i,List<List<Integer>> res,List<Integer> list){
    //     int n=arr.length;
    //     if(i==n){
    //         res.add(new ArrayList<>(list));
    //         return;
    //     }
    //     list.add(arr[i]);
    //     helper(arr,i+1,res,list);
    //     list.remove(list.size()-1);
    //     helper(arr,i+1,res,list);
    // }
    // public List<List<Integer>> subsets(int[] arr) {
    //     List<List<Integer>> res = new ArrayList<>();
    //     List<Integer> list=new ArrayList<>();
    //     helper(arr,0,res,list);
    //     return res;
    // }
}
