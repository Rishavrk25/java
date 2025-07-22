package PrefixSum;
import java.util.HashMap;

public class Q1_MaxLenOfSubarrayWith0sum {
    public static void main(String[] args) {
        HashMap<Integer,Integer> map=new HashMap<>();
        // (sum,idx)
        int sum=0;
        int mx=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum==0) mx=Math.max(mx,i+1);
            else if(!map.containsKey(sum)) map.put(sum,i);
            else mx=Math.max(mx,i-map.get(sum));
        }
        return mx;
    }
}
