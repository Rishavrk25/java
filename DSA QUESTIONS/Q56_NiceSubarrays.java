public class Q56_NiceSubarrays {

    class Solution {
    int atMostK(int arr[],int k){
        int n=arr.length;
        int i=0;
        int j=0;
        int odd=0;
        int sum=0;
        while(j<n){
            if(arr[j]%2!=0) odd++;
            while(odd>k){
                if(arr[i]%2!=0) odd--;
                i++;
            }
            sum+=j-i+1;
            j++;
        }
        return sum;
    }
    public int numberOfSubarrays(int[] arr, int k) {
        return atMostK(arr,k)-atMostK(arr,k-1);
    }
}
}