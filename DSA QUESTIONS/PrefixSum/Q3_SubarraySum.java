import java.util.HashMap;

public class Q3_SubarraySum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // (sum,freq)
        int sum=0;
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(sum)) map.put(sum,1);
            else{
                int val=map.get(sum);
                map.put(sum,val+1);
            }
            sum+=arr[i];
            if(map.containsKey(sum-k)) ans+=map.get(sum-k);
        }
        return ans;
    }
}
