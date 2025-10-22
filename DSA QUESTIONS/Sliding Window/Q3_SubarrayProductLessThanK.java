public class Q3_SubarrayProductLessThanK {
    class Solution {
    public int numSubarrayProductLessThanK(int[] arr, int k) {
        int i=0;
        int j=0;
        int n=arr.length;
        int p=1;
        int c=0;
        if(k<=1) return 0;
        while(j<n){
            p*=arr[j];
            while(p>=k){
                p/=arr[i];
                i++;
            }
            c+=j-i+1;
            j++;
        }
        return c;
    }
}
}
