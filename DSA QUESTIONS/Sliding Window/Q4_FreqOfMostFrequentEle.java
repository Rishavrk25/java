class Solution {
    int bs(int targetIdx,int arr[],int k , int prefixSum[]){
        int l=0;
        int h=targetIdx;
        int res = 0;
        while(l<=h){
            int m=(l+h)/2;
            int count = targetIdx - m + 1;
            int windowSum = count * arr[targetIdx];
            int originalSum = prefixSum[targetIdx] - prefixSum[m] + arr[m];
            int diff = windowSum - originalSum;
            if(diff > k){
                l=m+1;
            }
            else{
                res = Math.max(res,count);
                h=m-1;
            }
        }
        return res;
    }
    public int maxFrequency(int[] arr, int k) {
        int n=arr.length;
        Arrays.sort(arr);
        int prefixSum[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            prefixSum[i] = sum;
        }
        int res = 0;
        for(int i=0;i<n;i++){
            int freq = bs(i,arr,k,prefixSum);
            res = Math.max(res,freq);
        }
        return res;
    }
}